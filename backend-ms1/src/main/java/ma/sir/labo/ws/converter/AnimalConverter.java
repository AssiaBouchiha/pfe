package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.AnimalHistory;
import ma.sir.labo.bean.core.Animal;
import ma.sir.labo.ws.dto.AnimalDto;

@Component
public class AnimalConverter extends AbstractConverter<Animal, AnimalDto, AnimalHistory> {

    @Autowired
    private AnimalTypeConverter animalTypeConverter ;
    @Autowired
    private AgeCategoryConverter ageCategoryConverter ;
    @Autowired
    private MarketCategoryConverter marketCategoryConverter ;
    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private GenderConverter genderConverter ;
    @Autowired
    private AnimalSpecieConverter animalSpecieConverter ;
    private boolean gender;
    private boolean ageCategory;
    private boolean animalSpecie;
    private boolean animalType;
    private boolean marketCategory;
    private boolean dataImportExport;

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

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;



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
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
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
        this.dataImportExport = value;
    }


    public AnimalTypeConverter getAnimalTypeConverter(){
        return this.animalTypeConverter;
    }
    public void setAnimalTypeConverter(AnimalTypeConverter animalTypeConverter ){
        this.animalTypeConverter = animalTypeConverter;
    }
    public AgeCategoryConverter getAgeCategoryConverter(){
        return this.ageCategoryConverter;
    }
    public void setAgeCategoryConverter(AgeCategoryConverter ageCategoryConverter ){
        this.ageCategoryConverter = ageCategoryConverter;
    }
    public MarketCategoryConverter getMarketCategoryConverter(){
        return this.marketCategoryConverter;
    }
    public void setMarketCategoryConverter(MarketCategoryConverter marketCategoryConverter ){
        this.marketCategoryConverter = marketCategoryConverter;
    }
    public DataImportExportConverter getDataImportExportConverter(){
        return this.dataImportExportConverter;
    }
    public void setDataImportExportConverter(DataImportExportConverter dataImportExportConverter ){
        this.dataImportExportConverter = dataImportExportConverter;
    }
    public GenderConverter getGenderConverter(){
        return this.genderConverter;
    }
    public void setGenderConverter(GenderConverter genderConverter ){
        this.genderConverter = genderConverter;
    }
    public AnimalSpecieConverter getAnimalSpecieConverter(){
        return this.animalSpecieConverter;
    }
    public void setAnimalSpecieConverter(AnimalSpecieConverter animalSpecieConverter ){
        this.animalSpecieConverter = animalSpecieConverter;
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
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
}
