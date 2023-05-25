package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.ReasonHistory;
import ma.sir.labo.bean.core.Reason;
import ma.sir.labo.ws.dto.ReasonDto;

@Component
public class ReasonConverter extends AbstractConverter<Reason, ReasonDto, ReasonHistory> {


    public  ReasonConverter(){
        super(Reason.class, ReasonDto.class, ReasonHistory.class);
    }

    @Override
    public Reason toItem(ReasonDto dto) {
        if (dto == null) {
            return null;
        } else {
        Reason item = new Reason();
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
    public ReasonDto toDto(Reason item) {
        if (item == null) {
            return null;
        } else {
            ReasonDto dto = new ReasonDto();
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
