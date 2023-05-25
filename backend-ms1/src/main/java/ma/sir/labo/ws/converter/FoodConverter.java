package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.FoodHistory;
import ma.sir.labo.bean.core.Food;
import ma.sir.labo.ws.dto.FoodDto;

@Component
public class FoodConverter extends AbstractConverter<Food, FoodDto, FoodHistory> {

    @Autowired
    private BrandConverter brandConverter ;
    @Autowired
    private MarketCategoryConverter marketCategoryConverter ;
    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private AnimalSpecieConverter animalSpecieConverter ;
    private boolean animalSpecie;
    private boolean marketCategory;
    private boolean brand;
    private boolean dataImportExport;

    public  FoodConverter(){
        super(Food.class, FoodDto.class, FoodHistory.class);
    }

    @Override
    public Food toItem(FoodDto dto) {
        if (dto == null) {
            return null;
        } else {
        Food item = new Food();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(this.animalSpecie && dto.getAnimalSpecie()!=null)
                item.setAnimalSpecie(animalSpecieConverter.toItem(dto.getAnimalSpecie())) ;

            if(this.marketCategory && dto.getMarketCategory()!=null)
                item.setMarketCategory(marketCategoryConverter.toItem(dto.getMarketCategory())) ;

            if(this.brand && dto.getBrand()!=null)
                item.setBrand(brandConverter.toItem(dto.getBrand())) ;

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;



        return item;
        }
    }

    @Override
    public FoodDto toDto(Food item) {
        if (item == null) {
            return null;
        } else {
            FoodDto dto = new FoodDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
        if(this.animalSpecie && item.getAnimalSpecie()!=null) {
            dto.setAnimalSpecie(animalSpecieConverter.toDto(item.getAnimalSpecie())) ;
        }
        if(this.marketCategory && item.getMarketCategory()!=null) {
            dto.setMarketCategory(marketCategoryConverter.toDto(item.getMarketCategory())) ;
        }
        if(this.brand && item.getBrand()!=null) {
            dto.setBrand(brandConverter.toDto(item.getBrand())) ;
        }
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.animalSpecie = value;
        this.marketCategory = value;
        this.brand = value;
        this.dataImportExport = value;
    }


    public BrandConverter getBrandConverter(){
        return this.brandConverter;
    }
    public void setBrandConverter(BrandConverter brandConverter ){
        this.brandConverter = brandConverter;
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
    public AnimalSpecieConverter getAnimalSpecieConverter(){
        return this.animalSpecieConverter;
    }
    public void setAnimalSpecieConverter(AnimalSpecieConverter animalSpecieConverter ){
        this.animalSpecieConverter = animalSpecieConverter;
    }
    public boolean  isAnimalSpecie(){
        return this.animalSpecie;
    }
    public void  setAnimalSpecie(boolean animalSpecie){
        this.animalSpecie = animalSpecie;
    }
    public boolean  isMarketCategory(){
        return this.marketCategory;
    }
    public void  setMarketCategory(boolean marketCategory){
        this.marketCategory = marketCategory;
    }
    public boolean  isBrand(){
        return this.brand;
    }
    public void  setBrand(boolean brand){
        this.brand = brand;
    }
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
}
