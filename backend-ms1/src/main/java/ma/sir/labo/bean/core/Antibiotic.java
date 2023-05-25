package ma.sir.labo.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.labo.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "antibiotic")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="antibiotic_seq",sequenceName="antibiotic_seq",allocationSize=1, initialValue = 1)
public class Antibiotic   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String nom;

    private Microbiology microbiology ;
    

    private List<LaboratoryAntibiotic> laboratoryAntibiotics ;

    public Antibiotic(){
        super();
    }

    public Antibiotic(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="antibiotic_seq")
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
    public Microbiology getMicrobiology(){
        return this.microbiology;
    }
    public void setMicrobiology(Microbiology microbiology){
        this.microbiology = microbiology;
    }
    @OneToMany(mappedBy = "antibiotic")
    public List<LaboratoryAntibiotic> getLaboratoryAntibiotics(){
        return this.laboratoryAntibiotics;
    }
    public void setLaboratoryAntibiotics(List<LaboratoryAntibiotic> laboratoryAntibiotics){
        this.laboratoryAntibiotics = laboratoryAntibiotics;
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
        Antibiotic antibiotic = (Antibiotic) o;
        return id != null && id.equals(antibiotic.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

