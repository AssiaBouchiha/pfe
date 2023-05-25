package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class MicrobiologyDto  extends AuditBaseDto {

    private String code  ;
    private String betalactamase  ;
    private String esbl  ;
    private String carbapenemase  ;
    private String mrsa  ;
    private String inducibleClindamycinResistance  ;

    private OrganismDto organism ;
    private SeroTypeDto seroType ;
    private AntibioticDto antibiotic ;
    private DataImportExportDto dataImportExport ;



    public MicrobiologyDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getBetalactamase(){
        return this.betalactamase;
    }
    public void setBetalactamase(String betalactamase){
        this.betalactamase = betalactamase;
    }

    @Log
    public String getEsbl(){
        return this.esbl;
    }
    public void setEsbl(String esbl){
        this.esbl = esbl;
    }

    @Log
    public String getCarbapenemase(){
        return this.carbapenemase;
    }
    public void setCarbapenemase(String carbapenemase){
        this.carbapenemase = carbapenemase;
    }

    @Log
    public String getMrsa(){
        return this.mrsa;
    }
    public void setMrsa(String mrsa){
        this.mrsa = mrsa;
    }

    @Log
    public String getInducibleClindamycinResistance(){
        return this.inducibleClindamycinResistance;
    }
    public void setInducibleClindamycinResistance(String inducibleClindamycinResistance){
        this.inducibleClindamycinResistance = inducibleClindamycinResistance;
    }


    public OrganismDto getOrganism(){
        return this.organism;
    }

    public void setOrganism(OrganismDto organism){
        this.organism = organism;
    }
    public SeroTypeDto getSeroType(){
        return this.seroType;
    }

    public void setSeroType(SeroTypeDto seroType){
        this.seroType = seroType;
    }
    public AntibioticDto getAntibiotic(){
        return this.antibiotic;
    }

    public void setAntibiotic(AntibioticDto antibiotic){
        this.antibiotic = antibiotic;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }




}
