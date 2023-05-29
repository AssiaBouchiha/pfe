package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.AntibioticHistory;
import ma.sir.obs.bean.core.Antibiotic;
import ma.sir.obs.ws.dto.AntibioticDto;

@Component
public class AntibioticConverter extends AbstractConverter<Antibiotic, AntibioticDto, AntibioticHistory> {

    @Autowired
    private MicrobiologyConverter microbiologyConverter ;
    private boolean microbiology;

    public  AntibioticConverter(){
        super(Antibiotic.class, AntibioticDto.class, AntibioticHistory.class);
    }

    @Override
    public Antibiotic toItem(AntibioticDto dto) {
        if (dto == null) {
            return null;
        } else {
        Antibiotic item = new Antibiotic();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(this.microbiology && dto.getMicrobiology()!=null)
                item.setMicrobiology(microbiologyConverter.toItem(dto.getMicrobiology())) ;



        return item;
        }
    }

    @Override
    public AntibioticDto toDto(Antibiotic item) {
        if (item == null) {
            return null;
        } else {
            AntibioticDto dto = new AntibioticDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
        if(this.microbiology && item.getMicrobiology()!=null) {
            microbiologyConverter.setAntibiotic(false);
            dto.setMicrobiology(microbiologyConverter.toDto(item.getMicrobiology())) ;
            microbiologyConverter.setAntibiotic(true);
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.microbiology = value;
    }


    public MicrobiologyConverter getMicrobiologyConverter(){
        return this.microbiologyConverter;
    }
    public void setMicrobiologyConverter(MicrobiologyConverter microbiologyConverter ){
        this.microbiologyConverter = microbiologyConverter;
    }
    public boolean  isMicrobiology(){
        return this.microbiology;
    }
    public void  setMicrobiology(boolean microbiology){
        this.microbiology = microbiology;
    }
}
