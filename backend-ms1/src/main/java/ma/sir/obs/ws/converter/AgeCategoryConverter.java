package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AgeCategoryHistory;
import ma.sir.obs.bean.core.AgeCategory;
import ma.sir.obs.ws.dto.AgeCategoryDto;

@Component
public class AgeCategoryConverter extends AbstractConverter<AgeCategory, AgeCategoryDto, AgeCategoryHistory> {


    public  AgeCategoryConverter(){
        super(AgeCategory.class, AgeCategoryDto.class, AgeCategoryHistory.class);
    }

    @Override
    public AgeCategory toItem(AgeCategoryDto dto) {
        if (dto == null) {
            return null;
        } else {
        AgeCategory item = new AgeCategory();
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
    public AgeCategoryDto toDto(AgeCategory item) {
        if (item == null) {
            return null;
        } else {
            AgeCategoryDto dto = new AgeCategoryDto();
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
