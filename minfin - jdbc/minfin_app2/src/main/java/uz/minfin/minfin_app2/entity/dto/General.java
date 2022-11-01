package uz.minfin.minfin_app2.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class General {

    @JsonProperty("METHOD_NAME")
    private String methodName;

    @JsonProperty("ETP_ID")
    private Long etpId;



}
