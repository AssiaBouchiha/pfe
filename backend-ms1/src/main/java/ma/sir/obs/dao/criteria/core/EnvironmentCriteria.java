package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EnvironmentCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String lastname;
    private String lastnameLike;
    private String firstname;
    private String firstnameLike;
    private LocalDateTime dateofbirth;
    private LocalDateTime dateofbirthFrom;
    private LocalDateTime dateofbirthTo;
    private String age;
    private String ageLike;

    private GenderCriteria gender ;
    private List<GenderCriteria> genders ;
    private AgeCategoryCriteria ageCategory ;
    private List<AgeCategoryCriteria> ageCategorys ;


    public EnvironmentCriteria(){}

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

    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastnameLike(){
        return this.lastnameLike;
    }
    public void setLastnameLike(String lastnameLike){
        this.lastnameLike = lastnameLike;
    }

    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstnameLike(){
        return this.firstnameLike;
    }
    public void setFirstnameLike(String firstnameLike){
        this.firstnameLike = firstnameLike;
    }

    public LocalDateTime getDateofbirth(){
        return this.dateofbirth;
    }
    public void setDateofbirth(LocalDateTime dateofbirth){
        this.dateofbirth = dateofbirth;
    }
    public LocalDateTime getDateofbirthFrom(){
        return this.dateofbirthFrom;
    }
    public void setDateofbirthFrom(LocalDateTime dateofbirthFrom){
        this.dateofbirthFrom = dateofbirthFrom;
    }
    public LocalDateTime getDateofbirthTo(){
        return this.dateofbirthTo;
    }
    public void setDateofbirthTo(LocalDateTime dateofbirthTo){
        this.dateofbirthTo = dateofbirthTo;
    }
    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }
    public String getAgeLike(){
        return this.ageLike;
    }
    public void setAgeLike(String ageLike){
        this.ageLike = ageLike;
    }


    public GenderCriteria getGender(){
        return this.gender;
    }

    public void setGender(GenderCriteria gender){
        this.gender = gender;
    }
    public List<GenderCriteria> getGenders(){
        return this.genders;
    }

    public void setGenders(List<GenderCriteria> genders){
        this.genders = genders;
    }
    public AgeCategoryCriteria getAgeCategory(){
        return this.ageCategory;
    }

    public void setAgeCategory(AgeCategoryCriteria ageCategory){
        this.ageCategory = ageCategory;
    }
    public List<AgeCategoryCriteria> getAgeCategorys(){
        return this.ageCategorys;
    }

    public void setAgeCategorys(List<AgeCategoryCriteria> ageCategorys){
        this.ageCategorys = ageCategorys;
    }
}
