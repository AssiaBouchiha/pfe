package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.DataImportExportHistory;
import ma.sir.labo.bean.core.DataImportExport;
import ma.sir.labo.ws.dto.DataImportExportDto;

@Component
public class DataImportExportConverter extends AbstractConverter<DataImportExport, DataImportExportDto, DataImportExportHistory> {

    @Autowired
    private MicrobiologyConverter microbiologyConverter ;
    @Autowired
    private SpecimenConverter specimenConverter ;
    @Autowired
    private LocationDataConverter locationDataConverter ;
    private boolean locationData;
    private boolean specimen;
    private boolean microbiology;

    public  DataImportExportConverter(){
        super(DataImportExport.class, DataImportExportDto.class, DataImportExportHistory.class);
    }

    @Override
    public DataImportExport toItem(DataImportExportDto dto) {
        if (dto == null) {
            return null;
        } else {
        DataImportExport item = new DataImportExport();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(this.locationData && dto.getLocationData()!=null)
                item.setLocationData(locationDataConverter.toItem(dto.getLocationData())) ;

            if(this.specimen && dto.getSpecimen()!=null)
                item.setSpecimen(specimenConverter.toItem(dto.getSpecimen())) ;

            if(this.microbiology && dto.getMicrobiology()!=null)
                item.setMicrobiology(microbiologyConverter.toItem(dto.getMicrobiology())) ;



        return item;
        }
    }

    @Override
    public DataImportExportDto toDto(DataImportExport item) {
        if (item == null) {
            return null;
        } else {
            DataImportExportDto dto = new DataImportExportDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
        if(this.locationData && item.getLocationData()!=null) {
            locationDataConverter.setDataImportExport(false);
            dto.setLocationData(locationDataConverter.toDto(item.getLocationData())) ;
            locationDataConverter.setDataImportExport(true);
        }
        if(this.specimen && item.getSpecimen()!=null) {
            specimenConverter.setDataImportExport(false);
            dto.setSpecimen(specimenConverter.toDto(item.getSpecimen())) ;
            specimenConverter.setDataImportExport(true);
        }
        if(this.microbiology && item.getMicrobiology()!=null) {
            microbiologyConverter.setDataImportExport(false);
            dto.setMicrobiology(microbiologyConverter.toDto(item.getMicrobiology())) ;
            microbiologyConverter.setDataImportExport(true);
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.locationData = value;
        this.specimen = value;
        this.microbiology = value;
    }


    public MicrobiologyConverter getMicrobiologyConverter(){
        return this.microbiologyConverter;
    }
    public void setMicrobiologyConverter(MicrobiologyConverter microbiologyConverter ){
        this.microbiologyConverter = microbiologyConverter;
    }
    public SpecimenConverter getSpecimenConverter(){
        return this.specimenConverter;
    }
    public void setSpecimenConverter(SpecimenConverter specimenConverter ){
        this.specimenConverter = specimenConverter;
    }
    public LocationDataConverter getLocationDataConverter(){
        return this.locationDataConverter;
    }
    public void setLocationDataConverter(LocationDataConverter locationDataConverter ){
        this.locationDataConverter = locationDataConverter;
    }
    public boolean  isLocationData(){
        return this.locationData;
    }
    public void  setLocationData(boolean locationData){
        this.locationData = locationData;
    }
    public boolean  isSpecimen(){
        return this.specimen;
    }
    public void  setSpecimen(boolean specimen){
        this.specimen = specimen;
    }
    public boolean  isMicrobiology(){
        return this.microbiology;
    }
    public void  setMicrobiology(boolean microbiology){
        this.microbiology = microbiology;
    }
}
