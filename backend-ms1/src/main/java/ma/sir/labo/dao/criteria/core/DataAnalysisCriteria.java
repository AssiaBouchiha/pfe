package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class DataAnalysisCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String format;
    private String formatLike;

    private LaboratoryCriteria laboratory ;
    private List<LaboratoryCriteria> laboratorys ;


    public DataAnalysisCriteria(){}

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

    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }
    public String getFormatLike(){
        return this.formatLike;
    }
    public void setFormatLike(String formatLike){
        this.formatLike = formatLike;
    }


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
}
