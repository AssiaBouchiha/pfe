package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.MarketCategoryHistory;
import ma.sir.labo.bean.core.MarketCategory;
import ma.sir.labo.ws.dto.MarketCategoryDto;

@Component
public class MarketCategoryConverter extends AbstractConverter<MarketCategory, MarketCategoryDto, MarketCategoryHistory> {


    public  MarketCategoryConverter(){
        super(MarketCategory.class, MarketCategoryDto.class, MarketCategoryHistory.class);
    }

    @Override
    public MarketCategory toItem(MarketCategoryDto dto) {
        if (dto == null) {
            return null;
        } else {
        MarketCategory item = new MarketCategory();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());


        return item;
        }
    }

    @Override
    public MarketCategoryDto toDto(MarketCategory item) {
        if (item == null) {
            return null;
        } else {
            MarketCategoryDto dto = new MarketCategoryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
