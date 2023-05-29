package ma.sir.obs.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.obs.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "food")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="food_seq",sequenceName="food_seq",allocationSize=1, initialValue = 1)
public class Food   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;

    private AnimalSpecie animalSpecie ;
    
    private MarketCategory marketCategory ;
    
    private Brand brand ;
    


    public Food(){
        super();
    }

    public Food(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="food_seq")
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
    public AnimalSpecie getAnimalSpecie(){
        return this.animalSpecie;
    }
    public void setAnimalSpecie(AnimalSpecie animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public MarketCategory getMarketCategory(){
        return this.marketCategory;
    }
    public void setMarketCategory(MarketCategory marketCategory){
        this.marketCategory = marketCategory;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Brand getBrand(){
        return this.brand;
    }
    public void setBrand(Brand brand){
        this.brand = brand;
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
        Food food = (Food) o;
        return id != null && id.equals(food.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

