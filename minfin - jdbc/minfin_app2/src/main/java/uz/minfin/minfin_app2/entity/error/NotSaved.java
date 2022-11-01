package uz.minfin.minfin_app2.entity.error;


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
public class NotSaved {


    @Id
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String json;

}
