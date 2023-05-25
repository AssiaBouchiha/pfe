package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.labo.zynerator.util.ListUtil;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.AntibioticHistory;
import ma.sir.labo.bean.core.Antibiotic;
import ma.sir.labo.ws.dto.AntibioticDto;

@Component
public class AntibioticConverter extends AbstractConverter<Antibiotic, AntibioticDto, AntibioticHistory> {

    @Autowired
    private MicrobiologyConverter microbiologyConverter ;
    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    @Autowired
    private LaboratoryAntibioticConverter laboratoryAntibioticConverter ;
    private boolean microbiology;
    private boolean laboratoryAntibiotics;

    public  AntibioticConverter(){
        super(Antibiotic.class, AntibioticDto.class, AntibioticHistory.class);
        init(true);
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


            if(this.laboratoryAntibiotics && ListUtil.isNotEmpty(dto.getLaboratoryAntibiotics()))
                item.setLaboratoryAntibiotics(laboratoryAntibioticConverter.toItem(dto.getLaboratoryAntibiotics()));

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
        if(this.laboratoryAntibiotics && ListUtil.isNotEmpty(item.getLaboratoryAntibiotics())){
            laboratoryAntibioticConverter.init(true);
            laboratoryAntibioticConverter.setAntibiotic(false);
            dto.setLaboratoryAntibiotics(laboratoryAntibioticConverter.toDto(item.getLaboratoryAntibiotics()));
            laboratoryAntibioticConverter.setAntibiotic(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.laboratoryAntibiotics = value;
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
    public LaboratoryConverter getLaboratoryConverter(){
        return this.laboratoryConverter;
    }
    public void setLaboratoryConverter(LaboratoryConverter laboratoryConverter ){
        this.laboratoryConverter = laboratoryConverter;
    }
    public LaboratoryAntibioticConverter getLaboratoryAntibioticConverter(){
        return this.laboratoryAntibioticConverter;
    }
    public void setLaboratoryAntibioticConverter(LaboratoryAntibioticConverter laboratoryAntibioticConverter ){
        this.laboratoryAntibioticConverter = laboratoryAntibioticConverter;
    }
    public boolean  isMicrobiology(){
        return this.microbiology;
    }
    public void  setMicrobiology(boolean microbiology){
        this.microbiology = microbiology;
    }
    public boolean  isLaboratoryAntibiotics(){
        return this.laboratoryAntibiotics ;
    }
    public void  setLaboratoryAntibiotics(boolean laboratoryAntibiotics ){
        this.laboratoryAntibiotics  = laboratoryAntibiotics ;
    }
}
