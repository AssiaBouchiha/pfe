package ma.sir.obs.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "environment")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="environment_seq",sequenceName="environment_seq",allocationSize=1, initialValue = 1)
public class Environment   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String lastname;
    @Column(length = 500)
    private String firstname;
    private LocalDateTime dateofbirth ;
    @Column(length = 500)
    private String age;

    private Gender gender ;
    
    private AgeCategory ageCategory ;
    


    public Environment(){
        super();
    }

    public Environment(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="environment_seq")
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
    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Gender getGender(){
        return this.gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public LocalDateTime getDateofbirth(){
        return this.dateofbirth;
    }
    public void setDateofbirth(LocalDateTime dateofbirth){
        this.dateofbirth = dateofbirth;
    }
    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public AgeCategory getAgeCategory(){
        return this.ageCategory;
    }
    public void setAgeCategory(AgeCategory ageCategory){
        this.ageCategory = ageCategory;
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
        Environment environment = (Environment) o;
        return id != null && id.equals(environment.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

