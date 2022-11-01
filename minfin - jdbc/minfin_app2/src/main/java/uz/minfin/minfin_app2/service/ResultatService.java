package uz.minfin.minfin_app2.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.minfin.minfin_app2.entity.Resultat;
import uz.minfin.minfin_app2.entity.dto.RequestJsonDto;
import uz.minfin.minfin_app2.entity.error.NotSaved;
import uz.minfin.minfin_app2.repository.NotSavedRepo;
import uz.minfin.minfin_app2.repository.ResultatRepo;
import uz.minfin.minfin_app2.response.RestAPIResponse;

@Service
@RequiredArgsConstructor
public class ResultatService {

    private final ResultatRepo resultatRepo;
    private final NotSavedRepo notSavedRepo ;

    public RestAPIResponse save(RequestJsonDto request) throws JsonProcessingException {

        try {
            Resultat resultat = new ObjectMapper().readValue(request.getJson(), Resultat.class);
            resultatRepo.save(resultat);
        }catch (Exception e){
            notSavedRepo.save(new NotSaved(request.getId(), request.getJson()));
        }

        return new RestAPIResponse("succeess", true, 200);
    }

}
