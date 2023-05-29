package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.obs.bean.core.Laboratory;

import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.LocationHistory;
import ma.sir.obs.bean.core.Location;
import ma.sir.obs.ws.dto.LocationDto;

@Component
public class LocationConverter extends AbstractConverter<Location, LocationDto, LocationHistory> {

    @Autowired
    private LaboratoryConverter laboratoryConverter ;
    @Autowired
    private InstitutionConverter institutionConverter ;
    @Autowired
    private LocationTypeConverter locationTypeConverter ;
    @Autowired
    private DepartmentConverter departmentConverter ;
    private boolean institution;
    private boolean department;
    private boolean locationType;
    private boolean laboratory;

    public  LocationConverter(){
        super(Location.class, LocationDto.class, LocationHistory.class);
    }

    @Override
    public Location toItem(LocationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Location item = new Location();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());
            if(this.institution && dto.getInstitution()!=null)
                item.setInstitution(institutionConverter.toItem(dto.getInstitution())) ;

            if(this.department && dto.getDepartment()!=null)
                item.setDepartment(departmentConverter.toItem(dto.getDepartment())) ;

            if(this.locationType && dto.getLocationType()!=null)
                item.setLocationType(locationTypeConverter.toItem(dto.getLocationType())) ;

            if(dto.getLaboratory() != null && dto.getLaboratory().getId() != null){
                item.setLaboratory(new Laboratory());
                item.getLaboratory().setId(dto.getLaboratory().getId());
            }



        return item;
        }
    }

    @Override
    public LocationDto toDto(Location item) {
        if (item == null) {
            return null;
        } else {
            LocationDto dto = new LocationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());
        if(this.institution && item.getInstitution()!=null) {
            dto.setInstitution(institutionConverter.toDto(item.getInstitution())) ;
        }
        if(this.department && item.getDepartment()!=null) {
            dto.setDepartment(departmentConverter.toDto(item.getDepartment())) ;
        }
        if(this.locationType && item.getLocationType()!=null) {
            dto.setLocationType(locationTypeConverter.toDto(item.getLocationType())) ;
        }
        if(this.laboratory && item.getLaboratory()!=null) {
            laboratoryConverter.setLocation(false);
            dto.setLaboratory(laboratoryConverter.toDto(item.getLaboratory())) ;
            laboratoryConverter.setLocation(true);
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.institution = value;
        this.department = value;
        this.locationType = value;
        this.laboratory = value;
    }


    public LaboratoryConverter getLaboratoryConverter(){
        return this.laboratoryConverter;
    }
    public void setLaboratoryConverter(LaboratoryConverter laboratoryConverter ){
        this.laboratoryConverter = laboratoryConverter;
    }
    public InstitutionConverter getInstitutionConverter(){
        return this.institutionConverter;
    }
    public void setInstitutionConverter(InstitutionConverter institutionConverter ){
        this.institutionConverter = institutionConverter;
    }
    public LocationTypeConverter getLocationTypeConverter(){
        return this.locationTypeConverter;
    }
    public void setLocationTypeConverter(LocationTypeConverter locationTypeConverter ){
        this.locationTypeConverter = locationTypeConverter;
    }
    public DepartmentConverter getDepartmentConverter(){
        return this.departmentConverter;
    }
    public void setDepartmentConverter(DepartmentConverter departmentConverter ){
        this.departmentConverter = departmentConverter;
    }
    public boolean  isInstitution(){
        return this.institution;
    }
    public void  setInstitution(boolean institution){
        this.institution = institution;
    }
    public boolean  isDepartment(){
        return this.department;
    }
    public void  setDepartment(boolean department){
        this.department = department;
    }
    public boolean  isLocationType(){
        return this.locationType;
    }
    public void  setLocationType(boolean locationType){
        this.locationType = locationType;
    }
    public boolean  isLaboratory(){
        return this.laboratory;
    }
    public void  setLaboratory(boolean laboratory){
        this.laboratory = laboratory;
    }
}
