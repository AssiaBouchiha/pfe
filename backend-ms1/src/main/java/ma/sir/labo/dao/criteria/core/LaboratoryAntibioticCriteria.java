package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class LaboratoryAntibioticCriteria extends  BaseCriteria  {


    private LaboratoryCriteria laboratory ;
    private List<LaboratoryCriteria> laboratorys ;
    private AntibioticCriteria antibiotic ;
    private List<AntibioticCriteria> antibiotics ;


    public LaboratoryAntibioticCriteria(){}


    public LaboratoryCriteria getLaboratory(){
        return this.laboratory;
    }

    public void setLaboratory(LaboratoryCriteria laboratory){
        this.laboratory = laboratory;
    }
    public List<LaboratoryCriteria> getLaboratorys(){
        return this.laboratorys;
    }

    public void setLaboratorys(List<LaboratoryCriteria> laboratorys){
        this.laboratorys = laboratorys;
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
