package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDataDto  extends AuditBaseDto {

    private String code  ;
    private String dateOfAdmission ;
    private String location  ;

    private InstitutionDto institution ;
    private DepartmentDto department ;
    private LocationTypeDto locationType ;
    private DataImportExportDto dataImportExport ;



    public LocationDataDto(){
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
    public String getDateOfAdmission(){
        return this.dateOfAdmission;
    }
    public void setDateOfAdmission(String dateOfAdmission){
        this.dateOfAdmission = dateOfAdmission;
    }

    @Log
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }


    public InstitutionDto getInstitution(){
        return this.institution;
    }

    public void setInstitution(InstitutionDto institution){
        this.institution = institution;
    }
    public DepartmentDto getDepartment(){
        return this.department;
    }

    public void setDepartment(DepartmentDto department){
        this.department = department;
    }
    public LocationTypeDto getLocationType(){
        return this.locationType;
    }

    public void setLocationType(LocationTypeDto locationType){
        this.locationType = locationType;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }




}
