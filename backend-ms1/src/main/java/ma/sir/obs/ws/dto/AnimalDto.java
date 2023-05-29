package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnimalDto  extends AuditBaseDto {

    private String code  ;
    private String name  ;
    private String age  ;

    private GenderDto gender ;
    private AgeCategoryDto ageCategory ;
    private AnimalSpecieDto animalSpecie ;
    private AnimalTypeDto animalType ;
    private MarketCategoryDto marketCategory ;



    public AnimalDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Log
    public String getAge(){
        return this.age;
    }
    public void setAge(String age){
        this.age = age;
    }


    public GenderDto getGender(){
        return this.gender;
    }

    public void setGender(GenderDto gender){
        this.gender = gender;
    }
    public AgeCategoryDto getAgeCategory(){
        return this.ageCategory;
    }

    public void setAgeCategory(AgeCategoryDto ageCategory){
        this.ageCategory = ageCategory;
    }
    public AnimalSpecieDto getAnimalSpecie(){
        return this.animalSpecie;
    }

    public void setAnimalSpecie(AnimalSpecieDto animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public AnimalTypeDto getAnimalType(){
        return this.animalType;
    }

    public void setAnimalType(AnimalTypeDto animalType){
        this.animalType = animalType;
    }
    public MarketCategoryDto getMarketCategory(){
        return this.marketCategory;
    }

    public void setMarketCategory(MarketCategoryDto marketCategory){
        this.marketCategory = marketCategory;
    }




}
