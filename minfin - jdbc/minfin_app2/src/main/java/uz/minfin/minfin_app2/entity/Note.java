package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Note extends BaseEntity{

    @JsonProperty("MARKA")
    private String marka;

    @JsonProperty("TECHSPEC")
    private String techSpec;

    @JsonProperty("MANUFACTURER")
    private String manufacturer;

    @JsonProperty("COUNTRY")
    private String country;

    @JsonProperty("GARANT")
    private String garant;

    @JsonProperty("GARANTS")
    private String garants;

    @JsonProperty("GODIZG")
    private Date godIzg;

    @JsonProperty("GODIZGS")
    private Date godIzgs;

    @JsonProperty("SROKGOD")
    private Date srokGod;

    @JsonProperty("SROKGODS")
    private Date srokGods;

    @JsonProperty("LICENSE")
    private String license;

    @ManyToOne
    private Specifications specifications;
}