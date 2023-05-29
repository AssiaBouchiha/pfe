package ma.sir.obs.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "location_data")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="location_data_seq",sequenceName="location_data_seq",allocationSize=1, initialValue = 1)
public class LocationData   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime dateOfAdmission ;
    @Column(length = 500)
    private String location;

    private Institution institution ;
    
    private Department department ;
    
    private LocationType locationType ;
    


    public LocationData(){
        super();
    }

    public LocationData(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="location_data_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public LocalDateTime getDateOfAdmission(){
        return this.dateOfAdmission;
    }
    public void setDateOfAdmission(LocalDateTime dateOfAdmission){
        this.dateOfAdmission = dateOfAdmission;
    }
    public String getLocation(){
        return this.location;
    }
    public void setLocation(String location){
        this.location = location;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Institution getInstitution(){
        return this.institution;
    }
    public void setInstitution(Institution institution){
        this.institution = institution;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Department getDepartment(){
        return this.department;
    }
    public void setDepartment(Department department){
        this.department = department;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public LocationType getLocationType(){
        return this.locationType;
    }
    public void setLocationType(LocationType locationType){
        this.locationType = locationType;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationData locationData = (LocationData) o;
        return id != null && id.equals(locationData.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

