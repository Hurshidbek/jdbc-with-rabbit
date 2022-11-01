package uz.minfin.minfin_app2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.minfin.minfin_app2.entity.error.NotSaved;

public interface NotSavedRepo extends JpaRepository<NotSaved, Long> {

}
