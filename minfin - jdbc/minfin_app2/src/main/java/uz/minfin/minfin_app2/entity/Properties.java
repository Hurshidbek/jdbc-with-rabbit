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
public class Properties extends BaseEntity{

	@JsonProperty("PROP_NUMB")
	private Integer propNumb;

	@JsonProperty("PROP_NAME")
	private String propName;

	@JsonProperty("VAL_NUMB")
	private Integer valNumb;

	@JsonProperty("VAL_NAME")
	private String valName;

	@ManyToOne
	private Specifications specifications;
}