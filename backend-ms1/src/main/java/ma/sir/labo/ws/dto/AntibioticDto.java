package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class AntibioticDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;

    private MicrobiologyDto microbiology ;

    private List<LaboratoryAntibioticDto> laboratoryAntibiotics ;


    public AntibioticDto(){
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
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }


    public MicrobiologyDto getMicrobiology(){
        return this.microbiology;
    }

    public void setMicrobiology(MicrobiologyDto microbiology){
        this.microbiology = microbiology;
    }



    public List<LaboratoryAntibioticDto> getLaboratoryAntibiotics(){
        return this.laboratoryAntibiotics;
    }

    public void setLaboratoryAntibiotics(List<LaboratoryAntibioticDto> laboratoryAntibiotics){
        this.laboratoryAntibiotics = laboratoryAntibiotics;
    }

}
