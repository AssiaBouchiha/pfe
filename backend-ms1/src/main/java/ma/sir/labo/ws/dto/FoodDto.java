package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class FoodDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;

    private AnimalSpecieDto animalSpecie ;
    private MarketCategoryDto marketCategory ;
    private BrandDto brand ;
    private DataImportExportDto dataImportExport ;



    public FoodDto(){
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
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }


    public AnimalSpecieDto getAnimalSpecie(){
        return this.animalSpecie;
    }

    public void setAnimalSpecie(AnimalSpecieDto animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public MarketCategoryDto getMarketCategory(){
        return this.marketCategory;
    }

    public void setMarketCategory(MarketCategoryDto marketCategory){
        this.marketCategory = marketCategory;
    }
    public BrandDto getBrand(){
        return this.brand;
    }

    public void setBrand(BrandDto brand){
        this.brand = brand;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }




}
