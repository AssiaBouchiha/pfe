package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.PlantHistory;
import ma.sir.obs.bean.core.Plant;
import ma.sir.obs.ws.dto.PlantDto;

@Component
public class PlantConverter extends AbstractConverter<Plant, PlantDto, PlantHistory> {

    @Autowired
    private GenderConverter genderConverter ;
    @Autowired
    private AgeCategoryConverter ageCategoryConverter ;
    private boolean gender;
    private boolean ageCategory;

    public  PlantConverter(){
        super(Plant.class, PlantDto.class, PlantHistory.class);
    }

    @Override
    public Plant toItem(PlantDto dto) {
        if (dto == null) {
            return null;
        } else {
        Plant item = new Plant();
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



        return item;
        }
    }

    @Override
    public PlantDto toDto(Plant item) {
        if (item == null) {
            return null;
        } else {
            PlantDto dto = new PlantDto();
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


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.gender = value;
        this.ageCategory = value;
    }


    public GenderConverter getGenderConverter(){
        return this.genderConverter;
    }
    public void setGenderConverter(GenderConverter genderConverter ){
        this.genderConverter = genderConverter;
    }
    public AgeCategoryConverter getAgeCategoryConverter(){
        return this.ageCategoryConverter;
    }
    public void setAgeCategoryConverter(AgeCategoryConverter ageCategoryConverter ){
        this.ageCategoryConverter = ageCategoryConverter;
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
}
