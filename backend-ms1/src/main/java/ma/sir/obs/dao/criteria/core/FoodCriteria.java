package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;

public class FoodCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;

    private AnimalSpecieCriteria animalSpecie ;
    private List<AnimalSpecieCriteria> animalSpecies ;
    private MarketCategoryCriteria marketCategory ;
    private List<MarketCategoryCriteria> marketCategorys ;
    private BrandCriteria brand ;
    private List<BrandCriteria> brands ;


    public FoodCriteria(){}

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

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
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
    public BrandCriteria getBrand(){
        return this.brand;
    }

    public void setBrand(BrandCriteria brand){
        this.brand = brand;
    }
    public List<BrandCriteria> getBrands(){
        return this.brands;
    }

    public void setBrands(List<BrandCriteria> brands){
        this.brands = brands;
    }
}
