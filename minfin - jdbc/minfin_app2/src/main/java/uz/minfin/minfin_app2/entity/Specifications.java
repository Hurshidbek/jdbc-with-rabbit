package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Specifications extends BaseEntity{

    @JsonProperty("FINYEAR")
    private Integer finYear;

    @JsonProperty("KLS")
    private String kls;

    @JsonProperty("NPOS")
    private Integer npos;

    @JsonProperty("TOVAR")
    private String tovar;

    @JsonProperty("TOVARNAME")
    private String tovarName;

    @JsonProperty("TOVAREDIZM")
    private String tovarEdizm;

    @JsonProperty("TOVARAMOUNT")
    private Integer tovarAmount;

    @JsonProperty("TOVARPRICE")
    private BigDecimal tovarPrice;

    @JsonProperty("TOVARSUMMA")
    private BigDecimal tovarSumma;

    @JsonProperty("EXPENSE")
    private BigDecimal expense;

    @JsonProperty("NOTE")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specifications")
    private List<Note> note;

    @JsonProperty("SPLIT")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specifications")
    private List<Split> split;

    @JsonProperty("PROPERTIES")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "specifications")
    private List<Properties> properties;

    @ManyToOne
    private Payload payload;
}