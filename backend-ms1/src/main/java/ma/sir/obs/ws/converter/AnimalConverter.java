package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AnimalHistory;
import ma.sir.obs.bean.core.Animal;
import ma.sir.obs.ws.dto.AnimalDto;

@Component
public class AnimalConverter extends AbstractConverter<Animal, AnimalDto, AnimalHistory> {

    @Autowired
    private GenderConverter genderConverter ;
    @Autowired
    private AnimalTypeConverter animalTypeConverter ;
    @Autowired
    private MarketCategoryConverter marketCategoryConverter ;
    @Autowired
    private AnimalSpecieConverter animalSpecieConverter ;
    @Autowired
    private AgeCategoryConverter ageCategoryConverter ;
    private boolean gender;
    private boolean ageCategory;
    private boolean animalSpecie;
    private boolean animalType;
    private boolean marketCategory;

    public  AnimalConverter(){
        super(Animal.class, AnimalDto.class, AnimalHistory.class);
    }

    @Override
    public Animal toItem(AnimalDto dto) {
        if (dto == null) {
            return null;
        } else {
        Animal item = new Animal();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getName()))
                item.setName(dto.getName());
            if(StringUtil.isNotEmpty(dto.getAge()))
                item.setAge(dto.getAge());
            if(this.gender && dto.getGender()!=null)
                item.setGender(genderConverter.toItem(dto.getGender())) ;

            if(this.ageCategory && dto.getAgeCategory()!=null)
                item.setAgeCategory(ageCategoryConverter.toItem(dto.getAgeCategory())) ;

            if(this.animalSpecie && dto.getAnimalSpecie()!=null)
                item.setAnimalSpecie(animalSpecieConverter.toItem(dto.getAnimalSpecie())) ;

            if(this.animalType && dto.getAnimalType()!=null)
                item.setAnimalType(animalTypeConverter.toItem(dto.getAnimalType())) ;

            if(this.marketCategory && dto.getMarketCategory()!=null)
                item.setMarketCategory(marketCategoryConverter.toItem(dto.getMarketCategory())) ;



        return item;
        }
    }

    @Override
    public AnimalDto toDto(Animal item) {
        if (item == null) {
            return null;
        } else {
            AnimalDto dto = new AnimalDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getName()))
                dto.setName(item.getName());
            if(StringUtil.isNotEmpty(item.getAge()))
                dto.setAge(item.getAge());
        if(this.gender && item.getGender()!=null) {
            dto.setGender(genderConverter.toDto(item.getGender())) ;
        }
        if(this.ageCategory && item.getAgeCategory()!=null) {
            dto.setAgeCategory(ageCategoryConverter.toDto(item.getAgeCategory())) ;
        }
        if(this.animalSpecie && item.getAnimalSpecie()!=null) {
            dto.setAnimalSpecie(animalSpecieConverter.toDto(item.getAnimalSpecie())) ;
        }
        if(this.animalType && item.getAnimalType()!=null) {
            dto.setAnimalType(animalTypeConverter.toDto(item.getAnimalType())) ;
        }
        if(this.marketCategory && item.getMarketCategory()!=null) {
            dto.setMarketCategory(marketCategoryConverter.toDto(item.getMarketCategory())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.gender = value;
        this.ageCategory = value;
        this.animalSpecie = value;
        this.animalType = value;
        this.marketCategory = value;
    }


    public GenderConverter getGenderConverter(){
        return this.genderConverter;
    }
    public void setGenderConverter(GenderConverter genderConverter ){
        this.genderConverter = genderConverter;
    }
    public AnimalTypeConverter getAnimalTypeConverter(){
        return this.animalTypeConverter;
    }
    public void setAnimalTypeConverter(AnimalTypeConverter animalTypeConverter ){
        this.animalTypeConverter = animalTypeConverter;
    }
    public MarketCategoryConverter getMarketCategoryConverter(){
        return this.marketCategoryConverter;
    }
    public void setMarketCategoryConverter(MarketCategoryConverter marketCategoryConverter ){
        this.marketCategoryConverter = marketCategoryConverter;
    }
    public AnimalSpecieConverter getAnimalSpecieConverter(){
        return this.animalSpecieConverter;
    }
    public void setAnimalSpecieConverter(AnimalSpecieConverter animalSpecieConverter ){
        this.animalSpecieConverter = animalSpecieConverter;
    }
    public AgeCategoryConverter getAgeCategoryConverter(){
        return this.ageCategoryConverter;
    }
    public void setAgeCategoryConverter(AgeCategoryConverter ageCategoryConverter ){
        this.ageCategoryConverter = ageCategoryConverter;
    }
    public boolean  isGender(){
        return this.gender;
    }
    public void  setGender(boolean gender){
        this.gender = gender;
    }
    public boolean  isAgeCategory(){
        return this.ageCategory;
    }
    public void  setAgeCategory(boolean ageCategory){
        this.ageCategory = ageCategory;
    }
    public boolean  isAnimalSpecie(){
        return this.animalSpecie;
    }
    public void  setAnimalSpecie(boolean animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public boolean  isAnimalType(){
        return this.animalType;
    }
    public void  setAnimalType(boolean animalType){
        this.animalType = animalType;
    }
    public boolean  isMarketCategory(){
        return this.marketCategory;
    }
    public void  setMarketCategory(boolean marketCategory){
        this.marketCategory = marketCategory;
    }
}
