package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.SpecimenHistory;
import ma.sir.labo.bean.core.Specimen;
import ma.sir.labo.ws.dto.SpecimenDto;

@Component
public class SpecimenConverter extends AbstractConverter<Specimen, SpecimenDto, SpecimenHistory> {

    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private ReasonConverter reasonConverter ;
    private boolean reason;
    private boolean dataImportExport;

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

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;



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
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dataImportExportConverter.setSpecimen(false);
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
            dataImportExportConverter.setSpecimen(true);
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.reason = value;
        this.dataImportExport = value;
    }


    public DataImportExportConverter getDataImportExportConverter(){
        return this.dataImportExportConverter;
    }
    public void setDataImportExportConverter(DataImportExportConverter dataImportExportConverter ){
        this.dataImportExportConverter = dataImportExportConverter;
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
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
}
