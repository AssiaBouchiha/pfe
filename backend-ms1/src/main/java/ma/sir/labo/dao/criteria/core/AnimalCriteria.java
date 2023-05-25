package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class AnimalCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String name;
    private String nameLike;
    private String age;
    private String ageLike;

    private GenderCriteria gender ;
    private List<GenderCriteria> genders ;
    private AgeCategoryCriteria ageCategory ;
    private List<AgeCategoryCriteria> ageCategorys ;
    private AnimalSpecieCriteria animalSpecie ;
    private List<AnimalSpecieCriteria> animalSpecies ;
    private AnimalTypeCriteria animalType ;
    private List<AnimalTypeCriteria> animalTypes ;
    private MarketCategoryCriteria marketCategory ;
    private List<MarketCategoryCriteria> marketCategorys ;
    private DataImportExportCriteria dataImportExport ;
    private List<DataImportExportCriteria> dataImportExports ;


    public AnimalCriteria(){}

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

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNameLike(){
        return this.nameLike;
    }
    public void setNameLike(String nameLike){
        this.nameLike = nameLike;
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
    public AnimalSpecieCriteria getAnimalSpecie(){
        return this.animalSpecie;
    }

    public void setAnimalSpecie(AnimalSpecieCriteria animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public List<AnimalSpecieCriteria> getAnimalSpecies(){
        return this.animalSpecies;
    }

    public void setAnimalSpecies(List<AnimalSpecieCriteria> animalSpecies){
        this.animalSpecies = animalSpecies;
    }
    public AnimalTypeCriteria getAnimalType(){
        return this.animalType;
    }

    public void setAnimalType(AnimalTypeCriteria animalType){
        this.animalType = animalType;
    }
    public List<AnimalTypeCriteria> getAnimalTypes(){
        return this.animalTypes;
    }

    public void setAnimalTypes(List<AnimalTypeCriteria> animalTypes){
        this.animalTypes = animalTypes;
    }
    public MarketCategoryCriteria getMarketCategory(){
        return this.marketCategory;
    }

    public void setMarketCategory(MarketCategoryCriteria marketCategory){
        this.marketCategory = marketCategory;
    }
    public List<MarketCategoryCriteria> getMarketCategorys(){
        return this.marketCategorys;
    }

    public void setMarketCategorys(List<MarketCategoryCriteria> marketCategorys){
        this.marketCategorys = marketCategorys;
    }
    public DataImportExportCriteria getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportCriteria dataImportExport){
        this.dataImportExport = dataImportExport;
    }
    public List<DataImportExportCriteria> getDataImportExports(){
        return this.dataImportExports;
    }

    public void setDataImportExports(List<DataImportExportCriteria> dataImportExports){
        this.dataImportExports = dataImportExports;
    }
}
