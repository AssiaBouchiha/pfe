package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AnimalTypeHistory;
import ma.sir.obs.bean.core.AnimalType;
import ma.sir.obs.ws.dto.AnimalTypeDto;

@Component
public class AnimalTypeConverter extends AbstractConverter<AnimalType, AnimalTypeDto, AnimalTypeHistory> {


    public  AnimalTypeConverter(){
        super(AnimalType.class, AnimalTypeDto.class, AnimalTypeHistory.class);
    }

    @Override
    public AnimalType toItem(AnimalTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        AnimalType item = new AnimalType();
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
    public AnimalTypeDto toDto(AnimalType item) {
        if (item == null) {
            return null;
        } else {
            AnimalTypeDto dto = new AnimalTypeDto();
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
