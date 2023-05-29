package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataArchiveDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;

    private LaboratoryDto laboratory ;



    public DataArchiveDto(){
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


    public LaboratoryDto getLaboratory(){
        return this.laboratory;
    }

    public void setLaboratory(LaboratoryDto laboratory){
        this.laboratory = laboratory;
    }




}
