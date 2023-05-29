package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrganismDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;




    public OrganismDto(){
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }






}
