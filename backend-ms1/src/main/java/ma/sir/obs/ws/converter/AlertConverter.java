package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AlertHistory;
import ma.sir.obs.bean.core.Alert;
import ma.sir.obs.ws.dto.AlertDto;

@Component
public class AlertConverter extends AbstractConverter<Alert, AlertDto, AlertHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    private boolean laboratory;

    public  AlertConverter(){
        super(Alert.class, AlertDto.class, AlertHistory.class);
    }

    @Override
    public Alert toItem(AlertDto dto) {
        if (dto == null) {
            return null;
        } else {
        Alert item = new Alert();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(dto.getLaboratory() != null && dto.getLaboratory().getId() != null){
                item.setLaboratory(new Laboratory());
                item.getLaboratory().setId(dto.getLaboratory().getId());
            }



        return item;
        }
    }

    @Override
    public AlertDto toDto(Alert item) {
        if (item == null) {
            return null;
        } else {
            AlertDto dto = new AlertDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
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
