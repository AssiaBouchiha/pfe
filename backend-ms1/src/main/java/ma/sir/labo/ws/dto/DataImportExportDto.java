package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataImportExportDto  extends AuditBaseDto {

    private String code  ;

    private LocationDataDto locationData ;
    private SpecimenDto specimen ;
    private MicrobiologyDto microbiology ;



    public DataImportExportDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }


    public LocationDataDto getLocationData(){
        return this.locationData;
    }

    public void setLocationData(LocationDataDto locationData){
        this.locationData = locationData;
    }
    public SpecimenDto getSpecimen(){
        return this.specimen;
    }

    public void setSpecimen(SpecimenDto specimen){
        this.specimen = specimen;
    }
    public MicrobiologyDto getMicrobiology(){
        return this.microbiology;
    }

    public void setMicrobiology(MicrobiologyDto microbiology){
        this.microbiology = microbiology;
    }




}
