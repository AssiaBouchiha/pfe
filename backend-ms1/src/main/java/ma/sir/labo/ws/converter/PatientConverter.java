package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.PatientHistory;
import ma.sir.labo.bean.core.Patient;
import ma.sir.labo.ws.dto.PatientDto;

@Component
public class PatientConverter extends AbstractConverter<Patient, PatientDto, PatientHistory> {

    @Autowired
    private AgeCategoryConverter ageCategoryConverter ;
    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private GenderConverter genderConverter ;
    private boolean gender;
    private boolean ageCategory;
    private boolean dataImportExport;

    public  PatientConverter(){
        super(Patient.class, PatientDto.class, PatientHistory.class);
    }

    @Override
    public Patient toItem(PatientDto dto) {
        if (dto == null) {
            return null;
        } else {
        Patient item = new Patient();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLastname()))
                item.setLastname(dto.getLastname());
            if(StringUtil.isNotEmpty(dto.getFirstname()))
                item.setFirstname(dto.getFirstname());
            if(StringUtil.isNotEmpty(dto.getDateofbirth()))
                item.setDateofbirth(DateUtil.stringEnToDate(dto.getDateofbirth()));
            if(StringUtil.isNotEmpty(dto.getAge()))
                item.setAge(dto.getAge());
            if(this.gender && dto.getGender()!=null)
                item.setGender(genderConverter.toItem(dto.getGender())) ;

            if(this.ageCategory && dto.getAgeCategory()!=null)
                item.setAgeCategory(ageCategoryConverter.toItem(dto.getAgeCategory())) ;

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;



        return item;
        }
    }

    @Override
    public PatientDto toDto(Patient item) {
        if (item == null) {
            return null;
        } else {
            PatientDto dto = new PatientDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLastname()))
                dto.setLastname(item.getLastname());
            if(StringUtil.isNotEmpty(item.getFirstname()))
                dto.setFirstname(item.getFirstname());
            if(item.getDateofbirth()!=null)
                dto.setDateofbirth(DateUtil.dateTimeToString(item.getDateofbirth()));
            if(StringUtil.isNotEmpty(item.getAge()))
                dto.setAge(item.getAge());
        if(this.gender && item.getGender()!=null) {
            dto.setGender(genderConverter.toDto(item.getGender())) ;
        }
        if(this.ageCategory && item.getAgeCategory()!=null) {
            dto.setAgeCategory(ageCategoryConverter.toDto(item.getAgeCategory())) ;
        }
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.gender = value;
        this.ageCategory = value;
        this.dataImportExport = value;
    }


    public AgeCategoryConverter getAgeCategoryConverter(){
        return this.ageCategoryConverter;
    }
    public void setAgeCategoryConverter(AgeCategoryConverter ageCategoryConverter ){
        this.ageCategoryConverter = ageCategoryConverter;
    }
    public DataImportExportConverter getDataImportExportConverter(){
        return this.dataImportExportConverter;
    }
    public void setDataImportExportConverter(DataImportExportConverter dataImportExportConverter ){
        this.dataImportExportConverter = dataImportExportConverter;
    }
    public GenderConverter getGenderConverter(){
        return this.genderConverter;
    }
    public void setGenderConverter(GenderConverter genderConverter ){
        this.genderConverter = genderConverter;
    }
    public boolean  isGender(){
        return this.gender;
    }
    public void  setGender(boolean gender){
        this.gender = gender;
    }
    public boolean  isAgeCategory(){
        return this.ageCategory;
    }
    public void  setAgeCategory(boolean ageCategory){
        this.ageCategory = ageCategory;
    }
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
}
