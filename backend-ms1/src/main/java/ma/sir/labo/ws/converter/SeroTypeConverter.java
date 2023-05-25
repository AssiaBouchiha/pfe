package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.SerotypeHistory;
import ma.sir.labo.bean.core.Serotype;
import ma.sir.labo.ws.dto.SerotypeDto;

@Component
public class SerotypeConverter extends AbstractConverter<Serotype, SerotypeDto, SerotypeHistory> {


    public  SerotypeConverter(){
        super(Serotype.class, SerotypeDto.class, SerotypeHistory.class);
    }

    @Override
    public Serotype toItem(SerotypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Serotype item = new Serotype();
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
    public SerotypeDto toDto(Serotype item) {
        if (item == null) {
            return null;
        } else {
            SerotypeDto dto = new SerotypeDto();
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
