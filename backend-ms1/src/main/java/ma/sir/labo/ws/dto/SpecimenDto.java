package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecimenDto  extends AuditBaseDto {

    private String code  ;
    private String date ;
    private String type  ;

    private ReasonDto reason ;
    private DataImportExportDto dataImportExport ;



    public SpecimenDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDate(){
        return this.date;
    }
    public void setDate(String date){
        this.date = date;
    }

    @Log
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }


    public ReasonDto getReason(){
        return this.reason;
    }

    public void setReason(ReasonDto reason){
        this.reason = reason;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }




}
