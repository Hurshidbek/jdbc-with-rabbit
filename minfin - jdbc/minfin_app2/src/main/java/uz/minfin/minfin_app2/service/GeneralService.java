package uz.minfin.minfin_app2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.minfin.minfin_app2.entity.dto.General;
import uz.minfin.minfin_app2.entity.dto.RequestJsonDto;
import uz.minfin.minfin_app2.entity.error.NotSaved;
import uz.minfin.minfin_app2.repository.NotSavedRepo;
import uz.minfin.minfin_app2.response.RestAPIResponse;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeneralService {

    private final ResultatService resultatService ;

    private final NotSavedRepo notSavedRepo ;


    public RestAPIResponse save(List<RequestJsonDto> jsons) throws JsonProcessingException {

        for(RequestJsonDto dto: jsons){
            General general = new ObjectMapper().readValue(dto.getJson(), General.class);

            if (general.getMethodName() == null){
                general.setMethodName("NO_METHOD_NAME");
                notSavedRepo.save(new NotSaved(dto.getId(), dto.getJson()));
            }

            switch (general.getMethodName()){
                case "RESULTAT" -> resultatService.save(dto);
            }
        }

        return new RestAPIResponse("succeess", true, 200);
    }

}
