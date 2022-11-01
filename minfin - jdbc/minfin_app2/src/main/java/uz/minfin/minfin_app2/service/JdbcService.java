package uz.minfin.minfin_app2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import uz.minfin.minfin_app2.entity.dto.RequestJsonDto;
import uz.minfin.minfin_app2.response.RestAPIResponse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
@EnableScheduling
@RequiredArgsConstructor
public class JdbcService {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    private final GeneralService generalService;

    @Value("${jsonCountFromJDBC}")
    int count;

    @Value("${queryGet}")
    String queryGet ;




    @Scheduled(initialDelayString = "${schedule.initialDelay}", fixedDelayString = "${schedule.fixedDelay}")
    public RestAPIResponse getJsons() throws JsonProcessingException {

        List<RequestJsonDto> jsons = new ArrayList<>();

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, username, password);
            preparedStatement(connection, jsons);

        } catch (SQLException e) {
            System.out.println("SQLException in getJsons method: " + e);
            e.printStackTrace();

        }catch (Exception e){
            System.out.println("Exception in getJsons method: " + e);
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (jsons.size() > 0)
            generalService.save(jsons);

        return new RestAPIResponse("succeess", true, 200);
    }


    public void preparedStatement(Connection connection, List<RequestJsonDto> jsons) {
        StringBuilder idsForDelete = new StringBuilder();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(queryGet);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                RequestJsonDto dto = new RequestJsonDto();
                dto.setId(resultSet.getLong("id"));
                dto.setJson(resultSet.getString("json"));
                jsons.add(dto);

                idsForDelete.append(resultSet.getLong("id")).append(",");
            }

            if (idsForDelete.length() > 0){
                idsForDelete.deleteCharAt(idsForDelete.length() - 1);
                String queryDelete = "delete from request_copy where id = any (array [" + idsForDelete + "])";
                preparedStatement = connection.prepareStatement(queryDelete);
                preparedStatement.execute();
            }
        } catch (SQLException e) {
            System.out.println("SQLException in  preparedStatement");
        }


    }

}
