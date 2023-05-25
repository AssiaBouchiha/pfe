package ma.sir.labo.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "location")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="location_seq",sequenceName="location_seq",allocationSize=1, initialValue = 1)
public class Location   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String description;

    private Institution institution ;
    
    private Department department ;
    
    private LocationType locationType ;
    
    private Laboratory laboratory ;
    


    public Location(){
        super();
    }

    public Location(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="location_seq")
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Laboratory getLaboratory(){
        return this.laboratory;
    }
    public void setLaboratory(Laboratory laboratory){
        this.laboratory = laboratory;
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
        Location location = (Location) o;
        return id != null && id.equals(location.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

