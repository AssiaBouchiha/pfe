package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.DataArchiveHistory;
import ma.sir.obs.bean.core.DataArchive;
import ma.sir.obs.ws.dto.DataArchiveDto;

@Component
public class DataArchiveConverter extends AbstractConverter<DataArchive, DataArchiveDto, DataArchiveHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    private boolean laboratory;

    public  DataArchiveConverter(){
        super(DataArchive.class, DataArchiveDto.class, DataArchiveHistory.class);
    }

    @Override
    public DataArchive toItem(DataArchiveDto dto) {
        if (dto == null) {
            return null;
        } else {
        DataArchive item = new DataArchive();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
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
    public DataArchiveDto toDto(DataArchive item) {
        if (item == null) {
            return null;
        } else {
            DataArchiveDto dto = new DataArchiveDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
        if(this.laboratory && item.getLaboratory()!=null) {
            laboratoryConverter.setDataArchive(false);
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
            laboratoryConverter.setDataArchive(true);
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
