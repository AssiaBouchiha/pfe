package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class LocationCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String description;
    private String descriptionLike;

    private InstitutionCriteria institution ;
    private List<InstitutionCriteria> institutions ;
    private DepartmentCriteria department ;
    private List<DepartmentCriteria> departments ;
    private LocationTypeCriteria locationType ;
    private List<LocationTypeCriteria> locationTypes ;
    private LaboratoryCriteria laboratory ;
    private List<LaboratoryCriteria> laboratorys ;


    public LocationCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


    public InstitutionCriteria getInstitution(){
        return this.institution;
    }

    public void setInstitution(InstitutionCriteria institution){
        this.institution = institution;
    }
    public List<InstitutionCriteria> getInstitutions(){
        return this.institutions;
    }

    public void setInstitutions(List<InstitutionCriteria> institutions){
        this.institutions = institutions;
    }
    public DepartmentCriteria getDepartment(){
        return this.department;
    }

    public void setDepartment(DepartmentCriteria department){
        this.department = department;
    }
    public List<DepartmentCriteria> getDepartments(){
        return this.departments;
    }

    public void setDepartments(List<DepartmentCriteria> departments){
        this.departments = departments;
    }
    public LocationTypeCriteria getLocationType(){
        return this.locationType;
    }

    public void setLocationType(LocationTypeCriteria locationType){
        this.locationType = locationType;
    }
    public List<LocationTypeCriteria> getLocationTypes(){
        return this.locationTypes;
    }

    public void setLocationTypes(List<LocationTypeCriteria> locationTypes){
        this.locationTypes = locationTypes;
    }
    public LaboratoryCriteria getLaboratory(){
        return this.laboratory;
    }

    public void setLaboratory(LaboratoryCriteria laboratory){
        this.laboratory = laboratory;
    }
    public List<LaboratoryCriteria> getLaboratorys(){
        return this.laboratorys;
    }

    public void setLaboratorys(List<LaboratoryCriteria> laboratorys){
        this.laboratorys = laboratorys;
    }
}
