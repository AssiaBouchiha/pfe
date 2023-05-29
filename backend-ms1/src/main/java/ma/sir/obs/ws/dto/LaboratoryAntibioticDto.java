package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaboratoryAntibioticDto  extends AuditBaseDto {


    private LaboratoryDto laboratory ;
    private AntibioticDto antibiotic ;



    public LaboratoryAntibioticDto(){
        super();
    }




    public LaboratoryDto getLaboratory(){
        return this.laboratory;
    }

    public void setLaboratory(LaboratoryDto laboratory){
        this.laboratory = laboratory;
    }
    public AntibioticDto getAntibiotic(){
        return this.antibiotic;
    }

    public void setAntibiotic(AntibioticDto antibiotic){
        this.antibiotic = antibiotic;
    }




}
