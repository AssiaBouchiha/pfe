package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;

public class MicrobiologyCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String betalactamase;
    private String betalactamaseLike;
    private String esbl;
    private String esblLike;
    private String carbapenemase;
    private String carbapenemaseLike;
    private String mrsa;
    private String mrsaLike;
    private String inducibleClindamycinResistance;
    private String inducibleClindamycinResistanceLike;

    private OrganismCriteria organism ;
    private List<OrganismCriteria> organisms ;
    private SeroTypeCriteria seroType ;
    private List<SeroTypeCriteria> seroTypes ;
    private AntibioticCriteria antibiotic ;
    private List<AntibioticCriteria> antibiotics ;


    public MicrobiologyCriteria(){}

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

    public String getBetalactamase(){
        return this.betalactamase;
    }
    public void setBetalactamase(String betalactamase){
        this.betalactamase = betalactamase;
    }
    public String getBetalactamaseLike(){
        return this.betalactamaseLike;
    }
    public void setBetalactamaseLike(String betalactamaseLike){
        this.betalactamaseLike = betalactamaseLike;
    }

    public String getEsbl(){
        return this.esbl;
    }
    public void setEsbl(String esbl){
        this.esbl = esbl;
    }
    public String getEsblLike(){
        return this.esblLike;
    }
    public void setEsblLike(String esblLike){
        this.esblLike = esblLike;
    }

    public String getCarbapenemase(){
        return this.carbapenemase;
    }
    public void setCarbapenemase(String carbapenemase){
        this.carbapenemase = carbapenemase;
    }
    public String getCarbapenemaseLike(){
        return this.carbapenemaseLike;
    }
    public void setCarbapenemaseLike(String carbapenemaseLike){
        this.carbapenemaseLike = carbapenemaseLike;
    }

    public String getMrsa(){
        return this.mrsa;
    }
    public void setMrsa(String mrsa){
        this.mrsa = mrsa;
    }
    public String getMrsaLike(){
        return this.mrsaLike;
    }
    public void setMrsaLike(String mrsaLike){
        this.mrsaLike = mrsaLike;
    }

    public String getInducibleClindamycinResistance(){
        return this.inducibleClindamycinResistance;
    }
    public void setInducibleClindamycinResistance(String inducibleClindamycinResistance){
        this.inducibleClindamycinResistance = inducibleClindamycinResistance;
    }
    public String getInducibleClindamycinResistanceLike(){
        return this.inducibleClindamycinResistanceLike;
    }
    public void setInducibleClindamycinResistanceLike(String inducibleClindamycinResistanceLike){
        this.inducibleClindamycinResistanceLike = inducibleClindamycinResistanceLike;
    }


    public OrganismCriteria getOrganism(){
        return this.organism;
    }

    public void setOrganism(OrganismCriteria organism){
        this.organism = organism;
    }
    public List<OrganismCriteria> getOrganisms(){
        return this.organisms;
    }

    public void setOrganisms(List<OrganismCriteria> organisms){
        this.organisms = organisms;
    }
    public SeroTypeCriteria getSeroType(){
        return this.seroType;
    }

    public void setSeroType(SeroTypeCriteria seroType){
        this.seroType = seroType;
    }
    public List<SeroTypeCriteria> getSeroTypes(){
        return this.seroTypes;
    }

    public void setSeroTypes(List<SeroTypeCriteria> seroTypes){
        this.seroTypes = seroTypes;
    }
    public AntibioticCriteria getAntibiotic(){
        return this.antibiotic;
    }

    public void setAntibiotic(AntibioticCriteria antibiotic){
        this.antibiotic = antibiotic;
    }
    public List<AntibioticCriteria> getAntibiotics(){
        return this.antibiotics;
    }

    public void setAntibiotics(List<AntibioticCriteria> antibiotics){
        this.antibiotics = antibiotics;
    }
}
