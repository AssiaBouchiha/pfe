package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.OrganismHistory;
import ma.sir.obs.bean.core.Organism;
import ma.sir.obs.ws.dto.OrganismDto;

@Component
public class OrganismConverter extends AbstractConverter<Organism, OrganismDto, OrganismHistory> {


    public  OrganismConverter(){
        super(Organism.class, OrganismDto.class, OrganismHistory.class);
    }

    @Override
    public Organism toItem(OrganismDto dto) {
        if (dto == null) {
            return null;
        } else {
        Organism item = new Organism();
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
    public OrganismDto toDto(Organism item) {
        if (item == null) {
            return null;
        } else {
            OrganismDto dto = new OrganismDto();
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
