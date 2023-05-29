package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.DataAnalysisHistory;
import ma.sir.obs.bean.core.DataAnalysis;
import ma.sir.obs.ws.dto.DataAnalysisDto;

@Component
public class DataAnalysisConverter extends AbstractConverter<DataAnalysis, DataAnalysisDto, DataAnalysisHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    private boolean laboratory;

    public  DataAnalysisConverter(){
        super(DataAnalysis.class, DataAnalysisDto.class, DataAnalysisHistory.class);
    }

    @Override
    public DataAnalysis toItem(DataAnalysisDto dto) {
        if (dto == null) {
            return null;
        } else {
        DataAnalysis item = new DataAnalysis();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getFormat()))
                item.setFormat(dto.getFormat());
            if(dto.getLaboratory() != null && dto.getLaboratory().getId() != null){
                item.setLaboratory(new Laboratory());
                item.getLaboratory().setId(dto.getLaboratory().getId());
            }



        return item;
        }
    }

    @Override
    public DataAnalysisDto toDto(DataAnalysis item) {
        if (item == null) {
            return null;
        } else {
            DataAnalysisDto dto = new DataAnalysisDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getFormat()))
                dto.setFormat(item.getFormat());
        if(this.laboratory && item.getLaboratory()!=null) {
            laboratoryConverter.setDataAnalysis(false);
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
            laboratoryConverter.setDataAnalysis(true);
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
