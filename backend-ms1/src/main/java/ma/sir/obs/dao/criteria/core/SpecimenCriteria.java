package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class SpecimenCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private LocalDateTime date;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;
    private String type;
    private String typeLike;

    private ReasonCriteria reason ;
    private List<ReasonCriteria> reasons ;


    public SpecimenCriteria(){}

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

    public LocalDateTime getDate(){
        return this.date;
    }
    public void setDate(LocalDateTime date){
        this.date = date;
    }
    public LocalDateTime getDateFrom(){
        return this.dateFrom;
    }
    public void setDateFrom(LocalDateTime dateFrom){
        this.dateFrom = dateFrom;
    }
    public LocalDateTime getDateTo(){
        return this.dateTo;
    }
    public void setDateTo(LocalDateTime dateTo){
        this.dateTo = dateTo;
    }
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getTypeLike(){
        return this.typeLike;
    }
    public void setTypeLike(String typeLike){
        this.typeLike = typeLike;
    }


    public ReasonCriteria getReason(){
        return this.reason;
    }

    public void setReason(ReasonCriteria reason){
        this.reason = reason;
    }
    public List<ReasonCriteria> getReasons(){
        return this.reasons;
    }

    public void setReasons(List<ReasonCriteria> reasons){
        this.reasons = reasons;
    }
}
