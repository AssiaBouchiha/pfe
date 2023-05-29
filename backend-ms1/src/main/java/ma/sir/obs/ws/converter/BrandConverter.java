package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.BrandHistory;
import ma.sir.obs.bean.core.Brand;
import ma.sir.obs.ws.dto.BrandDto;

@Component
public class BrandConverter extends AbstractConverter<Brand, BrandDto, BrandHistory> {


    public  BrandConverter(){
        super(Brand.class, BrandDto.class, BrandHistory.class);
    }

    @Override
    public Brand toItem(BrandDto dto) {
        if (dto == null) {
            return null;
        } else {
        Brand item = new Brand();
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
    public BrandDto toDto(Brand item) {
        if (item == null) {
            return null;
        } else {
            BrandDto dto = new BrandDto();
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
