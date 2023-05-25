package  ma.sir.labo.ws.dto;

import ma.sir.labo.zynerator.audit.Log;
import ma.sir.labo.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaboratoryDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;
    private Boolean bloqued  ;
    private String city  ;

    private LocationDto location ;
    private DataImportExportDto dataImportExport ;
    private DataAnalysisDto dataanalysis ;
    private DataArchiveDto dataarchive ;
    private ReportDto report ;

    private List<AntibioticDto> antibiotic ;
    private List<AlertDto> alerts ;
    private List<NotificationDto> notifications ;


    public LaboratoryDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public Boolean getBloqued(){
        return this.bloqued;
    }
    public void setBloqued(Boolean bloqued){
        this.bloqued = bloqued;
    }

    @Log
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }


    public LocationDto getLocation(){
        return this.location;
    }

    public void setLocation(LocationDto location){
        this.location = location;
    }
    public DataImportExportDto getDataImportExport(){
        return this.dataImportExport;
    }

    public void setDataImportExport(DataImportExportDto dataImportExport){
        this.dataImportExport = dataImportExport;
    }
    public DataAnalysisDto getDataanalysis(){
        return this.dataanalysis;
    }

    public void setDataanalysis(DataAnalysisDto dataanalysis){
        this.dataanalysis = dataanalysis;
    }
    public DataArchiveDto getDataarchive(){
        return this.dataarchive;
    }

    public void setDataarchive(DataArchiveDto dataarchive){
        this.dataarchive = dataarchive;
    }
    public ReportDto getReport(){
        return this.report;
    }

    public void setReport(ReportDto report){
        this.report = report;
    }



    public List<AntibioticDto> getAntibiotic(){
        return this.antibiotic;
    }

    public void setAntibiotic(List<AntibioticDto> antibiotic){
        this.antibiotic = antibiotic;
    }
    public List<AlertDto> getAlerts(){
        return this.alerts;
    }

    public void setAlerts(List<AlertDto> alerts){
        this.alerts = alerts;
    }
    public List<NotificationDto> getNotifications(){
        return this.notifications;
    }

    public void setNotifications(List<NotificationDto> notifications){
        this.notifications = notifications;
    }

}
