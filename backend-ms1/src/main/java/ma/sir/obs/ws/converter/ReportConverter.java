package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.ReportHistory;
import ma.sir.obs.bean.core.Report;
import ma.sir.obs.ws.dto.ReportDto;

@Component
public class ReportConverter extends AbstractConverter<Report, ReportDto, ReportHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    private boolean laboratory;

    public  ReportConverter(){
        super(Report.class, ReportDto.class, ReportHistory.class);
    }

    @Override
    public Report toItem(ReportDto dto) {
        if (dto == null) {
            return null;
        } else {
        Report item = new Report();
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
    public ReportDto toDto(Report item) {
        if (item == null) {
            return null;
        } else {
            ReportDto dto = new ReportDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
        if(this.laboratory && item.getLaboratory()!=null) {
            laboratoryConverter.setReport(false);
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
            laboratoryConverter.setReport(true);
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
