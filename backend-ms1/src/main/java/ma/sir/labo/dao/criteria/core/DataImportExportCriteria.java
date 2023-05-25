package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
import java.util.List;

public class DataImportExportCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;

    private LocationDataCriteria locationData ;
    private List<LocationDataCriteria> locationDatas ;
    private SpecimenCriteria specimen ;
    private List<SpecimenCriteria> specimens ;
    private MicrobiologyCriteria microbiology ;
    private List<MicrobiologyCriteria> microbiologys ;


    public DataImportExportCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }


    public LocationDataCriteria getLocationData(){
        return this.locationData;
    }

    public void setLocationData(LocationDataCriteria locationData){
        this.locationData = locationData;
    }
    public List<LocationDataCriteria> getLocationDatas(){
        return this.locationDatas;
    }

    public void setLocationDatas(List<LocationDataCriteria> locationDatas){
        this.locationDatas = locationDatas;
    }
    public SpecimenCriteria getSpecimen(){
        return this.specimen;
    }

    public void setSpecimen(SpecimenCriteria specimen){
        this.specimen = specimen;
    }
    public List<SpecimenCriteria> getSpecimens(){
        return this.specimens;
    }

    public void setSpecimens(List<SpecimenCriteria> specimens){
        this.specimens = specimens;
    }
    public MicrobiologyCriteria getMicrobiology(){
        return this.microbiology;
    }

    public void setMicrobiology(MicrobiologyCriteria microbiology){
        this.microbiology = microbiology;
    }
    public List<MicrobiologyCriteria> getMicrobiologys(){
        return this.microbiologys;
    }

    public void setMicrobiologys(List<MicrobiologyCriteria> microbiologys){
        this.microbiologys = microbiologys;
    }
}
