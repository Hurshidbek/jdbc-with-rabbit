package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//@JsonIgnoreProperties(ignoreUnknown = true)
public class Resultat extends BaseEntity {

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("ETP_ID")
    private Long etpId;

    @JsonProperty("REQUEST_ID")
    private Long requestId;

    @JsonProperty("METHOD_NAME")
    private String methodName;

    @JsonProperty("PAYLOAD")
    @OneToOne(cascade = CascadeType.ALL)
    private Payload payload;

//    @OneToOne
//    private TestEnt testEnt ;


}
