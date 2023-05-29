package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.LaboratoryAntibioticHistory;
import ma.sir.obs.bean.core.LaboratoryAntibiotic;
import ma.sir.obs.ws.dto.LaboratoryAntibioticDto;

@Component
public class LaboratoryAntibioticConverter extends AbstractConverter<LaboratoryAntibiotic, LaboratoryAntibioticDto, LaboratoryAntibioticHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    @Autowired
    private AntibioticConverter antibioticConverter ;
    private boolean laboratory;
    private boolean antibiotic;

    public  LaboratoryAntibioticConverter(){
        super(LaboratoryAntibiotic.class, LaboratoryAntibioticDto.class, LaboratoryAntibioticHistory.class);
    }

    @Override
    public LaboratoryAntibiotic toItem(LaboratoryAntibioticDto dto) {
        if (dto == null) {
            return null;
        } else {
        LaboratoryAntibiotic item = new LaboratoryAntibiotic();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getLaboratory() != null && dto.getLaboratory().getId() != null){
                item.setLaboratory(new Laboratory());
                item.getLaboratory().setId(dto.getLaboratory().getId());
            }

            if(this.antibiotic && dto.getAntibiotic()!=null)
                item.setAntibiotic(antibioticConverter.toItem(dto.getAntibiotic())) ;



        return item;
        }
    }

    @Override
    public LaboratoryAntibioticDto toDto(LaboratoryAntibiotic item) {
        if (item == null) {
            return null;
        } else {
            LaboratoryAntibioticDto dto = new LaboratoryAntibioticDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.laboratory && item.getLaboratory()!=null) {
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
        }
        if(this.antibiotic && item.getAntibiotic()!=null) {
            dto.setAntibiotic(antibioticConverter.toDto(item.getAntibiotic())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.laboratory = value;
        this.antibiotic = value;
    }


    public LaboratoryConverter getLaboratoryConverter(){
        return this.laboratoryConverter;
    }
    public void setLaboratoryConverter(LaboratoryConverter laboratoryConverter ){
        this.laboratoryConverter = laboratoryConverter;
    }
    public AntibioticConverter getAntibioticConverter(){
        return this.antibioticConverter;
    }
    public void setAntibioticConverter(AntibioticConverter antibioticConverter ){
        this.antibioticConverter = antibioticConverter;
    }
    public boolean  isLaboratory(){
        return this.laboratory;
    }
    public void  setLaboratory(boolean laboratory){
        this.laboratory = laboratory;
    }
    public boolean  isAntibiotic(){
        return this.antibiotic;
    }
    public void  setAntibiotic(boolean antibiotic){
        this.antibiotic = antibiotic;
    }
}
