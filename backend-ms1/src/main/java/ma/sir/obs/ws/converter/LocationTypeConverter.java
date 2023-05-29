package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.LocationTypeHistory;
import ma.sir.obs.bean.core.LocationType;
import ma.sir.obs.ws.dto.LocationTypeDto;

@Component
public class LocationTypeConverter extends AbstractConverter<LocationType, LocationTypeDto, LocationTypeHistory> {


    public  LocationTypeConverter(){
        super(LocationType.class, LocationTypeDto.class, LocationTypeHistory.class);
    }

    @Override
    public LocationType toItem(LocationTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        LocationType item = new LocationType();
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
    public LocationTypeDto toDto(LocationType item) {
        if (item == null) {
            return null;
        } else {
            LocationTypeDto dto = new LocationTypeDto();
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
