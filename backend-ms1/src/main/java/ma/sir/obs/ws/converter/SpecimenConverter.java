package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.SpecimenHistory;
import ma.sir.obs.bean.core.Specimen;
import ma.sir.obs.ws.dto.SpecimenDto;

@Component
public class SpecimenConverter extends AbstractConverter<Specimen, SpecimenDto, SpecimenHistory> {

    @Autowired
    private ReasonConverter reasonConverter ;
    private boolean reason;

    public  SpecimenConverter(){
        super(Specimen.class, SpecimenDto.class, SpecimenHistory.class);
    }

    @Override
    public Specimen toItem(SpecimenDto dto) {
        if (dto == null) {
            return null;
        } else {
        Specimen item = new Specimen();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDate()))
                item.setDate(DateUtil.stringEnToDate(dto.getDate()));
            if(StringUtil.isNotEmpty(dto.getType()))
                item.setType(dto.getType());
            if(this.reason && dto.getReason()!=null)
                item.setReason(reasonConverter.toItem(dto.getReason())) ;



        return item;
        }
    }

    @Override
    public SpecimenDto toDto(Specimen item) {
        if (item == null) {
            return null;
        } else {
            SpecimenDto dto = new SpecimenDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(item.getDate()!=null)
                dto.setDate(DateUtil.dateTimeToString(item.getDate()));
            if(StringUtil.isNotEmpty(item.getType()))
                dto.setType(item.getType());
        if(this.reason && item.getReason()!=null) {
            dto.setReason(reasonConverter.toDto(item.getReason())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.reason = value;
    }


    public ReasonConverter getReasonConverter(){
        return this.reasonConverter;
    }
    public void setReasonConverter(ReasonConverter reasonConverter ){
        this.reasonConverter = reasonConverter;
    }
    public boolean  isReason(){
        return this.reason;
    }
    public void  setReason(boolean reason){
        this.reason = reason;
    }
}
