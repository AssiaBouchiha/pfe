package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.NotificationHistory;
import ma.sir.obs.bean.core.Notification;
import ma.sir.obs.ws.dto.NotificationDto;

@Component
public class NotificationConverter extends AbstractConverter<Notification, NotificationDto, NotificationHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    private boolean laboratory;

    public  NotificationConverter(){
        super(Notification.class, NotificationDto.class, NotificationHistory.class);
    }

    @Override
    public Notification toItem(NotificationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Notification item = new Notification();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(dto.getLaboratory() != null && dto.getLaboratory().getId() != null){
                item.setLaboratory(new Laboratory());
                item.getLaboratory().setId(dto.getLaboratory().getId());
            }



        return item;
        }
    }

    @Override
    public NotificationDto toDto(Notification item) {
        if (item == null) {
            return null;
        } else {
            NotificationDto dto = new NotificationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.laboratory && item.getLaboratory()!=null) {
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.laboratory = value;
    }


    public LaboratoryConverter getLaboratoryConverter(){
        return this.laboratoryConverter;
    }
    public void setLaboratoryConverter(LaboratoryConverter laboratoryConverter ){
        this.laboratoryConverter = laboratoryConverter;
    }
    public boolean  isLaboratory(){
        return this.laboratory;
    }
    public void  setLaboratory(boolean laboratory){
        this.laboratory = laboratory;
    }
}
