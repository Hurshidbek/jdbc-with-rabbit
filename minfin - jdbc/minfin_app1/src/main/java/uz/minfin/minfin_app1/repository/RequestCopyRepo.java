package uz.minfin.minfin_app1.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import uz.minfin.minfin_app1.entity.RequestCopy;

public interface RequestCopyRepo extends JpaRepository<RequestCopy, Long> {
}
