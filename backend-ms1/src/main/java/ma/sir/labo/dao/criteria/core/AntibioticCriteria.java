package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class AntibioticCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;

    private MicrobiologyCriteria microbiology ;
    private List<MicrobiologyCriteria> microbiologys ;


    public AntibioticCriteria(){}

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

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }


    public MicrobiologyCriteria getMicrobiology(){
        return this.microbiology;
    }

    public void setMicrobiology(MicrobiologyCriteria microbiology){
        this.microbiology = microbiology;
    }
    public List<MicrobiologyCriteria> getMicrobiologys(){
        return this.microbiologys;
    }

    public void setMicrobiologys(List<MicrobiologyCriteria> microbiologys){
        this.microbiologys = microbiologys;
    }
}
