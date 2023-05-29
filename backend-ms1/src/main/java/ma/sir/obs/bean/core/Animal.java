package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "animal")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="animal_seq",sequenceName="animal_seq",allocationSize=1, initialValue = 1)
public class Animal   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String name;
    @Column(length = 500)
    private String age;

    private Gender gender ;
    
    private AgeCategory ageCategory ;
    
    private AnimalSpecie animalSpecie ;
    
    private AnimalType animalType ;
    
    private MarketCategory marketCategory ;
    


    public Animal(){
        super();
    }

    public Animal(Long id,String name){
        this.id = id;
        this.name = name ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="animal_seq")
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
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Gender getGender(){
        return this.gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
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
    @ManyToOne(fetch = FetchType.LAZY)
    public AnimalSpecie getAnimalSpecie(){
        return this.animalSpecie;
    }
    public void setAnimalSpecie(AnimalSpecie animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public AnimalType getAnimalType(){
        return this.animalType;
    }
    public void setAnimalType(AnimalType animalType){
        this.animalType = animalType;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public MarketCategory getMarketCategory(){
        return this.marketCategory;
    }
    public void setMarketCategory(MarketCategory marketCategory){
        this.marketCategory = marketCategory;
    }

    @Transient
    public String getLabel() {
        label = name;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id != null && id.equals(animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

