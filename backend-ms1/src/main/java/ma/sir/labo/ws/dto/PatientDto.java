package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatientDto  extends AuditBaseDto {

    private String code  ;
    private String lastname  ;
    private String firstname  ;
    private String dateofbirth ;
    private String age  ;

    private GenderDto gender ;
    private AgeCategoryDto ageCategory ;
    private DataImportExportDto dataImportExport ;



    public PatientDto(){
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
    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    @Log
    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDateofbirth(){
        return this.dateofbirth;
    }
    public void setDateofbirth(String dateofbirth){
        this.dateofbirth = dateofbirth;
    }

    @Log
    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }


    public GenderDto getGender(){
        return this.gender;
    }

    public void setGender(GenderDto gender){
        this.gender = gender;
    }
    public AgeCategoryDto getAgeCategory(){
        return this.ageCategory;
    }

    public void setAgeCategory(AgeCategoryDto ageCategory){
        this.ageCategory = ageCategory;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }




}
