package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.FoodHistory;
import ma.sir.obs.bean.core.Food;
import ma.sir.obs.ws.dto.FoodDto;

@Component
public class FoodConverter extends AbstractConverter<Food, FoodDto, FoodHistory> {

    @Autowired
    private BrandConverter brandConverter ;
    @Autowired
    private MarketCategoryConverter marketCategoryConverter ;
    @Autowired
    private AnimalSpecieConverter animalSpecieConverter ;
    private boolean animalSpecie;
    private boolean marketCategory;
    private boolean brand;

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


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.animalSpecie = value;
        this.marketCategory = value;
        this.brand = value;
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
}
