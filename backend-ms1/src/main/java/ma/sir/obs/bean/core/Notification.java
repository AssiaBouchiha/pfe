package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "notification")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="notification_seq",sequenceName="notification_seq",allocationSize=1, initialValue = 1)
public class Notification   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String description;

    private Laboratory laboratory ;
    


    public Notification(){
        super();
    }

    public Notification(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="notification_seq")
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
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
        Notification notification = (Notification) o;
        return id != null && id.equals(notification.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

