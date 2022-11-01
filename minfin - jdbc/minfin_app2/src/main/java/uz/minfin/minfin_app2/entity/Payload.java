package uz.minfin.minfin_app2.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {

    @Id
//    @JsonProperty("LOTID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long lotId;

    @JsonProperty("PROC_ID")
    private Integer procId;

    @JsonProperty("LOTDATE1")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private Date lotDate1;

    @JsonProperty("LOTDATES1")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date lotDates1;

    @JsonProperty("vendor_terr_name")
    private String vendorTerrName;

    @JsonProperty("LOTDATES2")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date lotDates2;

    @JsonProperty("LOTDATE2")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private Date lotDate2;

    @JsonProperty("CONTRACTNUM")
    private String contractNum;

    @JsonProperty("CONTRACTDAT")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private Date contractDat;

    @JsonProperty("CONTRACTDATS")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date contractSDat;

    @JsonProperty("DVR")
    private Integer dvr;

    @JsonProperty("ORGAN")
    private String organ;

    @JsonProperty("ORGAN_NAME")
    private String organName;

    @JsonProperty("INN")
    private String inn;

    @JsonProperty("LS")
    private String ls;

    @JsonProperty("VENDORNAME")
    private String vendorName;

    @JsonProperty("VENDORBANK")
    private Integer vendorBank;

    @JsonProperty("VENDORACC")
    private String vendorAcc;

    @JsonProperty("VENDORINN")
    private String vendorInn;

    @JsonProperty("MALOY")
    private String maloy;

    @JsonProperty("SUMMA")
    private BigDecimal summa;

    @JsonProperty("SUMNDS")
    private BigDecimal sumNds;

    @JsonProperty("SROK")
    private Integer srok;

    @JsonProperty("AVANS")
    private String avans;

    @JsonProperty("AVANSDAY")
    private Integer avansDay;

    @JsonProperty("CONTRACTBEG")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private Date contractBeg;

    @JsonProperty("CONTRACTBEGS")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date contractBegs;

    @JsonProperty("CONTRACTEND")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "ddMMyyyy")
    private Date contractEnd;

    @JsonProperty("CONTRACTENDS")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd.MM.yyyy")
    private Date contractEnds;

    @JsonProperty("PURPOSE")
    private String purpose;

    @JsonProperty("VENDORTERR")
    private Integer vendorTerr;

    @JsonProperty("BENEFICIAR")
    private String beneficiar;

    @JsonProperty("RASCHOT")
    private Integer raschot;

    @JsonProperty("REESTR_ID")
    private Long reestrId;

    @JsonProperty("PNFL")
    private Long pnfl;

    @JsonProperty("VENDORCOUNTRY")
    private String vendorCountry;

    @JsonProperty("VENDORFORIEGIN")
    private String vendorForiegn;

    @JsonProperty("VENDORINFO")
    private String vendorInfo;

    @JsonProperty("VENDORKLS")
    private String vendorKls;

    @JsonProperty("GEN_ID")
    private Long genId;

    @JsonProperty("CONTRACT_ID")
    private Long contractId;

    @JsonProperty("VERSION")
    private Integer version;

    @JsonProperty("FINSRC")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payload")
    private List<FinSrc> finSrc;

    @JsonProperty("SPECIFICATIONS")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payload")
    private List<Specifications> specifications;

    @JsonProperty("GRAFICS")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payload")
    private List<Grafics> grafics;

    @JsonProperty("LINKS")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "payload")
    private List<Links> links;

}