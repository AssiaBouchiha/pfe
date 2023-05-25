package  ma.sir.labo.dao.criteria.core;


import ma.sir.labo.zynerator.criteria.BaseCriteria;
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
    private DataImportExportCriteria dataImportExport ;
    private List<DataImportExportCriteria> dataImportExports ;
    private DataAnalysisCriteria dataanalysis ;
    private List<DataAnalysisCriteria> dataanalysiss ;
    private DataArchiveCriteria dataarchive ;
    private List<DataArchiveCriteria> dataarchives ;
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
    public DataImportExportCriteria getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportCriteria dataImportExport){
        this.dataImportExport = dataImportExport;
    }
    public List<DataImportExportCriteria> getDataImportExports(){
        return this.dataImportExports;
    }

    public void setDataImportExports(List<DataImportExportCriteria> dataImportExports){
        this.dataImportExports = dataImportExports;
    }
    public DataAnalysisCriteria getDataanalysis(){
        return this.dataanalysis;
    }

    public void setDataanalysis(DataAnalysisCriteria dataanalysis){
        this.dataanalysis = dataanalysis;
    }
    public List<DataAnalysisCriteria> getDataanalysiss(){
        return this.dataanalysiss;
    }

    public void setDataanalysiss(List<DataAnalysisCriteria> dataanalysiss){
        this.dataanalysiss = dataanalysiss;
    }
    public DataArchiveCriteria getDataarchive(){
        return this.dataarchive;
    }

    public void setDataarchive(DataArchiveCriteria dataarchive){
        this.dataarchive = dataarchive;
    }
    public List<DataArchiveCriteria> getDataarchives(){
        return this.dataarchives;
    }

    public void setDataarchives(List<DataArchiveCriteria> dataarchives){
        this.dataarchives = dataarchives;
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
