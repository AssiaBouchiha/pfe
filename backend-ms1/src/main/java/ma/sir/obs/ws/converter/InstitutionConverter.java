package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.InstitutionHistory;
import ma.sir.obs.bean.core.Institution;
import ma.sir.obs.ws.dto.InstitutionDto;

@Component
public class InstitutionConverter extends AbstractConverter<Institution, InstitutionDto, InstitutionHistory> {


    public  InstitutionConverter(){
        super(Institution.class, InstitutionDto.class, InstitutionHistory.class);
    }

    @Override
    public Institution toItem(InstitutionDto dto) {
        if (dto == null) {
            return null;
        } else {
        Institution item = new Institution();
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
    public InstitutionDto toDto(Institution item) {
        if (item == null) {
            return null;
        } else {
            InstitutionDto dto = new InstitutionDto();
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
