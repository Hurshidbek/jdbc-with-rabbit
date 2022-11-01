package uz.minfin.minfin_app2.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.minfin.minfin_app2.response.RestAPIResponse;
import uz.minfin.minfin_app2.service.JdbcService;

@RestController
@RequiredArgsConstructor
public class RequestController {

    private final JdbcService jdbcService;

    @GetMapping
    public ResponseEntity<?> save() throws JsonProcessingException {

        RestAPIResponse apiResponse = jdbcService.getJsons();
        return ResponseEntity.status(apiResponse.isSuccess() ? HttpStatus.OK : HttpStatus.CONFLICT).body(apiResponse);
    }

}
