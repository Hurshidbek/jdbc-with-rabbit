package uz.minfin.minfin_app1.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RequestCopy {

    @Id
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String json;

}