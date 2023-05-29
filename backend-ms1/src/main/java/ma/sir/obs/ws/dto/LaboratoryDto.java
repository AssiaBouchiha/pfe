package  ma.sir.obs.ws.dto;

import ma.sir.obs.zynerator.audit.Log;
import ma.sir.obs.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaboratoryDto  extends AuditBaseDto {

    private String code  ;
    private String nom  ;
    private Boolean bloqued  ;
    private String city  ;

    private LocationDto location ;
    private DataAnalysisDto dataAnalysis ;
    private DataArchiveDto dataArchive ;
    private ReportDto report ;

    private List<LaboratoryAntibioticDto> laboratoryAntibiotics ;
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
    public DataAnalysisDto getDataAnalysis(){
        return this.dataAnalysis;
    }

    public void setDataAnalysis(DataAnalysisDto dataAnalysis){
        this.dataAnalysis = dataAnalysis;
    }
    public DataArchiveDto getDataArchive(){
        return this.dataArchive;
    }

    public void setDataArchive(DataArchiveDto dataArchive){
        this.dataArchive = dataArchive;
    }
    public ReportDto getReport(){
        return this.report;
    }

    public void setReport(ReportDto report){
        this.report = report;
    }



    public List<LaboratoryAntibioticDto> getLaboratoryAntibiotics(){
        return this.laboratoryAntibiotics;
    }

    public void setLaboratoryAntibiotics(List<LaboratoryAntibioticDto> laboratoryAntibiotics){
        this.laboratoryAntibiotics = laboratoryAntibiotics;
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
