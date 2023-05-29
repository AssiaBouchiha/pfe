package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AntibioticDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;

    private MicrobiologyDto microbiology ;



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




}
