package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Grafics extends BaseEntity{

    @JsonProperty("FINYEAR")
    private Integer finYear;

    @JsonProperty("MONTH")
    private Integer month;

    @JsonProperty("KLS")
    private String kls;

    @JsonProperty("TOVARSUMMA")
    private BigDecimal tovarSumma;

    @JsonProperty("EXPENSE")
    private BigDecimal expense;

    @JsonProperty("AVANS")
    private BigDecimal avans;

    @JsonProperty("SUMMA")
    private BigDecimal summa;

    @ManyToOne
    private Payload payload;
}