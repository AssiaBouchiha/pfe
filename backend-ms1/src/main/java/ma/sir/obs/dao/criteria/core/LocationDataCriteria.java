package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class LocationDataCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private LocalDateTime dateOfAdmission;
    private LocalDateTime dateOfAdmissionFrom;
    private LocalDateTime dateOfAdmissionTo;
    private String location;
    private String locationLike;

    private InstitutionCriteria institution ;
    private List<InstitutionCriteria> institutions ;
    private DepartmentCriteria department ;
    private List<DepartmentCriteria> departments ;
    private LocationTypeCriteria locationType ;
    private List<LocationTypeCriteria> locationTypes ;


    public LocationDataCriteria(){}

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

    public LocalDateTime getDateOfAdmission(){
        return this.dateOfAdmission;
    }
    public void setDateOfAdmission(LocalDateTime dateOfAdmission){
        this.dateOfAdmission = dateOfAdmission;
    }
    public LocalDateTime getDateOfAdmissionFrom(){
        return this.dateOfAdmissionFrom;
    }
    public void setDateOfAdmissionFrom(LocalDateTime dateOfAdmissionFrom){
        this.dateOfAdmissionFrom = dateOfAdmissionFrom;
    }
    public LocalDateTime getDateOfAdmissionTo(){
        return this.dateOfAdmissionTo;
    }
    public void setDateOfAdmissionTo(LocalDateTime dateOfAdmissionTo){
        this.dateOfAdmissionTo = dateOfAdmissionTo;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocationLike(){
        return this.locationLike;
    }
    public void setLocationLike(String locationLike){
        this.locationLike = locationLike;
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
}
