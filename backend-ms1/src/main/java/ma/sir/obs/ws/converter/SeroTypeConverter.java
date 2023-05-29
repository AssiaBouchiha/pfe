package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.SeroTypeHistory;
import ma.sir.obs.bean.core.SeroType;
import ma.sir.obs.ws.dto.SeroTypeDto;

@Component
public class SeroTypeConverter extends AbstractConverter<SeroType, SeroTypeDto, SeroTypeHistory> {


    public  SeroTypeConverter(){
        super(SeroType.class, SeroTypeDto.class, SeroTypeHistory.class);
    }

    @Override
    public SeroType toItem(SeroTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        SeroType item = new SeroType();
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
    public SeroTypeDto toDto(SeroType item) {
        if (item == null) {
            return null;
        } else {
            SeroTypeDto dto = new SeroTypeDto();
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
