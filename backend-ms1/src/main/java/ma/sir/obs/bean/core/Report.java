package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "report")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="report_seq",sequenceName="report_seq",allocationSize=1, initialValue = 1)
public class Report   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;

    private Laboratory laboratory ;
    


    public Report(){
        super();
    }

    public Report(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="report_seq")
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
        Report report = (Report) o;
        return id != null && id.equals(report.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

