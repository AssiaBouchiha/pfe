package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.labo.bean.core.Antibiotic;

import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.MicrobiologyHistory;
import ma.sir.labo.bean.core.Microbiology;
import ma.sir.labo.ws.dto.MicrobiologyDto;

@Component
public class MicrobiologyConverter extends AbstractConverter<Microbiology, MicrobiologyDto, MicrobiologyHistory> {

    @Autowired
    private SeroTypeConverter seroTypeConverter ;
    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private AntibioticConverter antibioticConverter ;
    @Autowired
    private OrganismConverter organismConverter ;
    private boolean organism;
    private boolean seroType;
    private boolean antibiotic;
    private boolean dataImportExport;

    public  MicrobiologyConverter(){
        super(Microbiology.class, MicrobiologyDto.class, MicrobiologyHistory.class);
    }

    @Override
    public Microbiology toItem(MicrobiologyDto dto) {
        if (dto == null) {
            return null;
        } else {
        Microbiology item = new Microbiology();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getBetalactamase()))
                item.setBetalactamase(dto.getBetalactamase());
            if(StringUtil.isNotEmpty(dto.getEsbl()))
                item.setEsbl(dto.getEsbl());
            if(StringUtil.isNotEmpty(dto.getCarbapenemase()))
                item.setCarbapenemase(dto.getCarbapenemase());
            if(StringUtil.isNotEmpty(dto.getMrsa()))
                item.setMrsa(dto.getMrsa());
            if(StringUtil.isNotEmpty(dto.getInducibleClindamycinResistance()))
                item.setInducibleClindamycinResistance(dto.getInducibleClindamycinResistance());
            if(this.organism && dto.getOrganism()!=null)
                item.setOrganism(organismConverter.toItem(dto.getOrganism())) ;

            if(this.seroType && dto.getSeroType()!=null)
                item.setSeroType(seroTypeConverter.toItem(dto.getSeroType())) ;

            if(dto.getAntibiotic() != null && dto.getAntibiotic().getId() != null){
                item.setAntibiotic(new Antibiotic());
                item.getAntibiotic().setId(dto.getAntibiotic().getId());
            }

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;



        return item;
        }
    }

    @Override
    public MicrobiologyDto toDto(Microbiology item) {
        if (item == null) {
            return null;
        } else {
            MicrobiologyDto dto = new MicrobiologyDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getBetalactamase()))
                dto.setBetalactamase(item.getBetalactamase());
            if(StringUtil.isNotEmpty(item.getEsbl()))
                dto.setEsbl(item.getEsbl());
            if(StringUtil.isNotEmpty(item.getCarbapenemase()))
                dto.setCarbapenemase(item.getCarbapenemase());
            if(StringUtil.isNotEmpty(item.getMrsa()))
                dto.setMrsa(item.getMrsa());
            if(StringUtil.isNotEmpty(item.getInducibleClindamycinResistance()))
                dto.setInducibleClindamycinResistance(item.getInducibleClindamycinResistance());
        if(this.organism && item.getOrganism()!=null) {
            dto.setOrganism(organismConverter.toDto(item.getOrganism())) ;
        }
        if(this.seroType && item.getSeroType()!=null) {
            dto.setSeroType(seroTypeConverter.toDto(item.getSeroType())) ;
        }
        if(this.antibiotic && item.getAntibiotic()!=null) {
            antibioticConverter.setMicrobiology(false);
            dto.setAntibiotic(antibioticConverter.toDto(item.getAntibiotic())) ;
            antibioticConverter.setMicrobiology(true);
        }
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dataImportExportConverter.setMicrobiology(false);
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
            dataImportExportConverter.setMicrobiology(true);
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.organism = value;
        this.seroType = value;
        this.antibiotic = value;
        this.dataImportExport = value;
    }


    public SeroTypeConverter getSeroTypeConverter(){
        return this.seroTypeConverter;
    }
    public void setSeroTypeConverter(SeroTypeConverter seroTypeConverter ){
        this.seroTypeConverter = seroTypeConverter;
    }
    public DataImportExportConverter getDataImportExportConverter(){
        return this.dataImportExportConverter;
    }
    public void setDataImportExportConverter(DataImportExportConverter dataImportExportConverter ){
        this.dataImportExportConverter = dataImportExportConverter;
    }
    public AntibioticConverter getAntibioticConverter(){
        return this.antibioticConverter;
    }
    public void setAntibioticConverter(AntibioticConverter antibioticConverter ){
        this.antibioticConverter = antibioticConverter;
    }
    public OrganismConverter getOrganismConverter(){
        return this.organismConverter;
    }
    public void setOrganismConverter(OrganismConverter organismConverter ){
        this.organismConverter = organismConverter;
    }
    public boolean  isOrganism(){
        return this.organism;
    }
    public void  setOrganism(boolean organism){
        this.organism = organism;
    }
    public boolean  isSeroType(){
        return this.seroType;
    }
    public void  setSeroType(boolean seroType){
        this.seroType = seroType;
    }
    public boolean  isAntibiotic(){
        return this.antibiotic;
    }
    public void  setAntibiotic(boolean antibiotic){
        this.antibiotic = antibiotic;
    }
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
}
