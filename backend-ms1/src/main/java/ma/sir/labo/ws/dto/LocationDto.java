package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class LocationDto  extends AuditBaseDto {

    private String code  ;
    private String description  ;

    private InstitutionDto institution ;
    private DepartmentDto department ;
    private LocationTypeDto locationType ;
    private LaboratoryDto laboratory ;



    public LocationDto(){
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
    public LaboratoryDto getLaboratory(){
        return this.laboratory;
    }

    public void setLaboratory(LaboratoryDto laboratory){
        this.laboratory = laboratory;
    }




}
