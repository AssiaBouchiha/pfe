package ma.sir.labo.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "laboratory_antibiotic")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="laboratory_antibiotic_seq",sequenceName="laboratory_antibiotic_seq",allocationSize=1, initialValue = 1)
public class LaboratoryAntibiotic   extends AuditBusinessObject     {

    private Long id;


    private Laboratory laboratory ;
    
    private Antibiotic antibiotic ;
    


    public LaboratoryAntibiotic(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="laboratory_antibiotic_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Laboratory getLaboratory(){
        return this.laboratory;
    }
    public void setLaboratory(Laboratory laboratory){
        this.laboratory = laboratory;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Antibiotic getAntibiotic(){
        return this.antibiotic;
    }
    public void setAntibiotic(Antibiotic antibiotic){
        this.antibiotic = antibiotic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LaboratoryAntibiotic laboratoryAntibiotic = (LaboratoryAntibiotic) o;
        return id != null && id.equals(laboratoryAntibiotic.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

