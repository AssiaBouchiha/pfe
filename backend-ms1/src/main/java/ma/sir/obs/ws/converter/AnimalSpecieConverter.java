package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AnimalSpecieHistory;
import ma.sir.obs.bean.core.AnimalSpecie;
import ma.sir.obs.ws.dto.AnimalSpecieDto;

@Component
public class AnimalSpecieConverter extends AbstractConverter<AnimalSpecie, AnimalSpecieDto, AnimalSpecieHistory> {


    public  AnimalSpecieConverter(){
        super(AnimalSpecie.class, AnimalSpecieDto.class, AnimalSpecieHistory.class);
    }

    @Override
    public AnimalSpecie toItem(AnimalSpecieDto dto) {
        if (dto == null) {
            return null;
        } else {
        AnimalSpecie item = new AnimalSpecie();
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
    public AnimalSpecieDto toDto(AnimalSpecie item) {
        if (item == null) {
            return null;
        } else {
            AnimalSpecieDto dto = new AnimalSpecieDto();
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
