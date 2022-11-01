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
public class Split extends BaseEntity{

	@JsonProperty("MONTH")
	private Integer month;

	@JsonProperty("TOVARAMOUNT")
	private Long tovarAmount;

	@ManyToOne
	private Specifications specifications;
	
}