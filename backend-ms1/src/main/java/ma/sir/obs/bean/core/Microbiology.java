package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "microbiology")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="microbiology_seq",sequenceName="microbiology_seq",allocationSize=1, initialValue = 1)
public class Microbiology   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String betalactamase;
    @Column(length = 500)
    private String esbl;
    @Column(length = 500)
    private String carbapenemase;
    @Column(length = 500)
    private String mrsa;
    @Column(length = 500)
    private String inducibleClindamycinResistance;

    private Organism organism ;
    
    private SeroType seroType ;
    
    private Antibiotic antibiotic ;
    


    public Microbiology(){
        super();
    }

    public Microbiology(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="microbiology_seq")
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
    @ManyToOne(fetch = FetchType.LAZY)
    public Organism getOrganism(){
        return this.organism;
    }
    public void setOrganism(Organism organism){
        this.organism = organism;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public SeroType getSeroType(){
        return this.seroType;
    }
    public void setSeroType(SeroType seroType){
        this.seroType = seroType;
    }
    public String getBetalactamase(){
        return this.betalactamase;
    }
    public void setBetalactamase(String betalactamase){
        this.betalactamase = betalactamase;
    }
    public String getEsbl(){
        return this.esbl;
    }
    public void setEsbl(String esbl){
        this.esbl = esbl;
    }
    public String getCarbapenemase(){
        return this.carbapenemase;
    }
    public void setCarbapenemase(String carbapenemase){
        this.carbapenemase = carbapenemase;
    }
    public String getMrsa(){
        return this.mrsa;
    }
    public void setMrsa(String mrsa){
        this.mrsa = mrsa;
    }
    public String getInducibleClindamycinResistance(){
        return this.inducibleClindamycinResistance;
    }
    public void setInducibleClindamycinResistance(String inducibleClindamycinResistance){
        this.inducibleClindamycinResistance = inducibleClindamycinResistance;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Antibiotic getAntibiotic(){
        return this.antibiotic;
    }
    public void setAntibiotic(Antibiotic antibiotic){
        this.antibiotic = antibiotic;
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
        Microbiology microbiology = (Microbiology) o;
        return id != null && id.equals(microbiology.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

