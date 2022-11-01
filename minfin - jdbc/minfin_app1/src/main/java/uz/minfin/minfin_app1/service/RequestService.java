package uz.minfin.minfin_app1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.minfin.minfin_app1.entity.RequestCopy;
import uz.minfin.minfin_app1.entity.RequestJson;
import uz.minfin.minfin_app1.repository.RequestCopyRepo;
import uz.minfin.minfin_app1.repository.RequestRepo;

@Service
@RequiredArgsConstructor
public class RequestService {

    private final RequestRepo requestRepo;

    private final RequestCopyRepo copyRepo;
    public void save(String request){
        RequestJson saved = requestRepo.save(new RequestJson(request));
        copyRepo.save(new RequestCopy(saved.getId(), saved.getJson()));
    }


}
