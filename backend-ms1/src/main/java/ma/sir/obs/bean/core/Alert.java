package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "alert")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="alert_seq",sequenceName="alert_seq",allocationSize=1, initialValue = 1)
public class Alert   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String description;
    @Column(length = 500)
    private String nom;

    private Laboratory laboratory ;
    


    public Alert(){
        super();
    }

    public Alert(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="alert_seq")
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
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
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
        Alert alert = (Alert) o;
        return id != null && id.equals(alert.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

