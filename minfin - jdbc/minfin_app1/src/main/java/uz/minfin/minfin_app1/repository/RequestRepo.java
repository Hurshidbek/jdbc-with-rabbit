package uz.minfin.minfin_app1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.minfin.minfin_app1.entity.RequestJson;

public interface RequestRepo extends JpaRepository<RequestJson, Long> {
}
