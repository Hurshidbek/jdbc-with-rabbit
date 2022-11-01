package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class FinSrc extends BaseEntity{

	@JsonProperty("NPOS")
	private Integer npos;

	@JsonProperty("KLS")
	private String kls;

	@JsonProperty("BANKCODE")
	private Integer bankCode;

	@JsonProperty("BANKACC")
	private String bankAcc;

	@JsonProperty("SUMMA")
	private Long summa;

	@JsonProperty("AVANS")
	private String avans;

	@ManyToOne
//	@JoinColumn(name = "payload_lot_id")
	private Payload payload;

}
