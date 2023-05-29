package  ma.sir.obs.dao.criteria.core;


import ma.sir.obs.zynerator.criteria.BaseCriteria;
import java.util.List;

public class LaboratoryCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String nom;
    private String nomLike;
    private Boolean bloqued;
    private String city;
    private String cityLike;

    private LocationCriteria location ;
    private List<LocationCriteria> locations ;
    private DataAnalysisCriteria dataAnalysis ;
    private List<DataAnalysisCriteria> dataAnalysiss ;
    private DataArchiveCriteria dataArchive ;
    private List<DataArchiveCriteria> dataArchives ;
    private ReportCriteria report ;
    private List<ReportCriteria> reports ;


    public LaboratoryCriteria(){}

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

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public Boolean getBloqued(){
        return this.bloqued;
    }
    public void setBloqued(Boolean bloqued){
        this.bloqued = bloqued;
    }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCityLike(){
        return this.cityLike;
    }
    public void setCityLike(String cityLike){
        this.cityLike = cityLike;
    }


    public LocationCriteria getLocation(){
        return this.location;
    }

    public void setLocation(LocationCriteria location){
        this.location = location;
    }
    public List<LocationCriteria> getLocations(){
        return this.locations;
    }

    public void setLocations(List<LocationCriteria> locations){
        this.locations = locations;
    }
    public DataAnalysisCriteria getDataAnalysis(){
        return this.dataAnalysis;
    }

    public void setDataAnalysis(DataAnalysisCriteria dataAnalysis){
        this.dataAnalysis = dataAnalysis;
    }
    public List<DataAnalysisCriteria> getDataAnalysiss(){
        return this.dataAnalysiss;
    }

    public void setDataAnalysiss(List<DataAnalysisCriteria> dataAnalysiss){
        this.dataAnalysiss = dataAnalysiss;
    }
    public DataArchiveCriteria getDataArchive(){
        return this.dataArchive;
    }

    public void setDataArchive(DataArchiveCriteria dataArchive){
        this.dataArchive = dataArchive;
    }
    public List<DataArchiveCriteria> getDataArchives(){
        return this.dataArchives;
    }

    public void setDataArchives(List<DataArchiveCriteria> dataArchives){
        this.dataArchives = dataArchives;
    }
    public ReportCriteria getReport(){
        return this.report;
    }

    public void setReport(ReportCriteria report){
        this.report = report;
    }
    public List<ReportCriteria> getReports(){
        return this.reports;
    }

    public void setReports(List<ReportCriteria> reports){
        this.reports = reports;
    }
}
