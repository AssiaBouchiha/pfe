package  ma.sir.obs.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.obs.zynerator.util.ListUtil;


import ma.sir.obs.zynerator.util.StringUtil;
import ma.sir.obs.zynerator.converter.AbstractConverter;
import ma.sir.obs.zynerator.util.DateUtil;
import ma.sir.obs.bean.history.LaboratoryHistory;
import ma.sir.obs.bean.core.Laboratory;
import ma.sir.obs.ws.dto.LaboratoryDto;

@Component
public class LaboratoryConverter extends AbstractConverter<Laboratory, LaboratoryDto, LaboratoryHistory> {

    @Autowired
    private LocationConverter locationConverter ;
    @Autowired
    private NotificationConverter notificationConverter ;
    @Autowired
    private AlertConverter alertConverter ;
    @Autowired
    private DataArchiveConverter dataArchiveConverter ;
    @Autowired
    private LaboratoryAntibioticConverter laboratoryAntibioticConverter ;
    @Autowired
    private DataAnalysisConverter dataAnalysisConverter ;
    @Autowired
    private ReportConverter reportConverter ;
    @Autowired
    private AntibioticConverter antibioticConverter ;
    private boolean location;
    private boolean dataAnalysis;
    private boolean dataArchive;
    private boolean report;
    private boolean laboratoryAntibiotics;
    private boolean alerts;
    private boolean notifications;

    public  LaboratoryConverter(){
        super(Laboratory.class, LaboratoryDto.class, LaboratoryHistory.class);
        init(true);
    }

    @Override
    public Laboratory toItem(LaboratoryDto dto) {
        if (dto == null) {
            return null;
        } else {
        Laboratory item = new Laboratory();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(dto.getBloqued() != null)
                item.setBloqued(dto.getBloqued());
            if(StringUtil.isNotEmpty(dto.getCity()))
                item.setCity(dto.getCity());
            if(this.location && dto.getLocation()!=null)
                item.setLocation(locationConverter.toItem(dto.getLocation())) ;

            if(this.dataAnalysis && dto.getDataAnalysis()!=null)
                item.setDataAnalysis(dataAnalysisConverter.toItem(dto.getDataAnalysis())) ;

            if(this.dataArchive && dto.getDataArchive()!=null)
                item.setDataArchive(dataArchiveConverter.toItem(dto.getDataArchive())) ;

            if(this.report && dto.getReport()!=null)
                item.setReport(reportConverter.toItem(dto.getReport())) ;


            if(this.laboratoryAntibiotics && ListUtil.isNotEmpty(dto.getLaboratoryAntibiotics()))
                item.setLaboratoryAntibiotics(laboratoryAntibioticConverter.toItem(dto.getLaboratoryAntibiotics()));
            if(this.alerts && ListUtil.isNotEmpty(dto.getAlerts()))
                item.setAlerts(alertConverter.toItem(dto.getAlerts()));
            if(this.notifications && ListUtil.isNotEmpty(dto.getNotifications()))
                item.setNotifications(notificationConverter.toItem(dto.getNotifications()));

        return item;
        }
    }

    @Override
    public LaboratoryDto toDto(Laboratory item) {
        if (item == null) {
            return null;
        } else {
            LaboratoryDto dto = new LaboratoryDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
                dto.setBloqued(item.getBloqued());
            if(StringUtil.isNotEmpty(item.getCity()))
                dto.setCity(item.getCity());
        if(this.location && item.getLocation()!=null) {
            locationConverter.setLaboratory(false);
            dto.setLocation(locationConverter.toDto(item.getLocation())) ;
            locationConverter.setLaboratory(true);
        }
        if(this.dataAnalysis && item.getDataAnalysis()!=null) {
            dataAnalysisConverter.setLaboratory(false);
            dto.setDataAnalysis(dataAnalysisConverter.toDto(item.getDataAnalysis())) ;
            dataAnalysisConverter.setLaboratory(true);
        }
        if(this.dataArchive && item.getDataArchive()!=null) {
            dataArchiveConverter.setLaboratory(false);
            dto.setDataArchive(dataArchiveConverter.toDto(item.getDataArchive())) ;
            dataArchiveConverter.setLaboratory(true);
        }
        if(this.report && item.getReport()!=null) {
            reportConverter.setLaboratory(false);
            dto.setReport(reportConverter.toDto(item.getReport())) ;
            reportConverter.setLaboratory(true);
        }
        if(this.laboratoryAntibiotics && ListUtil.isNotEmpty(item.getLaboratoryAntibiotics())){
            laboratoryAntibioticConverter.init(true);
            laboratoryAntibioticConverter.setLaboratory(false);
            dto.setLaboratoryAntibiotics(laboratoryAntibioticConverter.toDto(item.getLaboratoryAntibiotics()));
            laboratoryAntibioticConverter.setLaboratory(true);

        }
        if(this.alerts && ListUtil.isNotEmpty(item.getAlerts())){
            alertConverter.init(true);
            alertConverter.setLaboratory(false);
            dto.setAlerts(alertConverter.toDto(item.getAlerts()));
            alertConverter.setLaboratory(true);

        }
        if(this.notifications && ListUtil.isNotEmpty(item.getNotifications())){
            notificationConverter.init(true);
            notificationConverter.setLaboratory(false);
            dto.setNotifications(notificationConverter.toDto(item.getNotifications()));
            notificationConverter.setLaboratory(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.laboratoryAntibiotics = value;
        this.alerts = value;
        this.notifications = value;
    }

    public void initObject(boolean value) {
        this.location = value;
        this.dataAnalysis = value;
        this.dataArchive = value;
        this.report = value;
    }


    public LocationConverter getLocationConverter(){
        return this.locationConverter;
    }
    public void setLocationConverter(LocationConverter locationConverter ){
        this.locationConverter = locationConverter;
    }
    public NotificationConverter getNotificationConverter(){
        return this.notificationConverter;
    }
    public void setNotificationConverter(NotificationConverter notificationConverter ){
        this.notificationConverter = notificationConverter;
    }
    public AlertConverter getAlertConverter(){
        return this.alertConverter;
    }
    public void setAlertConverter(AlertConverter alertConverter ){
        this.alertConverter = alertConverter;
    }
    public DataArchiveConverter getDataArchiveConverter(){
        return this.dataArchiveConverter;
    }
    public void setDataArchiveConverter(DataArchiveConverter dataArchiveConverter ){
        this.dataArchiveConverter = dataArchiveConverter;
    }
    public LaboratoryAntibioticConverter getLaboratoryAntibioticConverter(){
        return this.laboratoryAntibioticConverter;
    }
    public void setLaboratoryAntibioticConverter(LaboratoryAntibioticConverter laboratoryAntibioticConverter ){
        this.laboratoryAntibioticConverter = laboratoryAntibioticConverter;
    }
    public DataAnalysisConverter getDataAnalysisConverter(){
        return this.dataAnalysisConverter;
    }
    public void setDataAnalysisConverter(DataAnalysisConverter dataAnalysisConverter ){
        this.dataAnalysisConverter = dataAnalysisConverter;
    }
    public ReportConverter getReportConverter(){
        return this.reportConverter;
    }
    public void setReportConverter(ReportConverter reportConverter ){
        this.reportConverter = reportConverter;
    }
    public AntibioticConverter getAntibioticConverter(){
        return this.antibioticConverter;
    }
    public void setAntibioticConverter(AntibioticConverter antibioticConverter ){
        this.antibioticConverter = antibioticConverter;
    }
    public boolean  isLocation(){
        return this.location;
    }
    public void  setLocation(boolean location){
        this.location = location;
    }
    public boolean  isDataAnalysis(){
        return this.dataAnalysis;
    }
    public void  setDataAnalysis(boolean dataAnalysis){
        this.dataAnalysis = dataAnalysis;
    }
    public boolean  isDataArchive(){
        return this.dataArchive;
    }
    public void  setDataArchive(boolean dataArchive){
        this.dataArchive = dataArchive;
    }
    public boolean  isReport(){
        return this.report;
    }
    public void  setReport(boolean report){
        this.report = report;
    }
    public boolean  isLaboratoryAntibiotics(){
        return this.laboratoryAntibiotics ;
    }
    public void  setLaboratoryAntibiotics(boolean laboratoryAntibiotics ){
        this.laboratoryAntibiotics  = laboratoryAntibiotics ;
    }
    public boolean  isAlerts(){
        return this.alerts ;
    }
    public void  setAlerts(boolean alerts ){
        this.alerts  = alerts ;
    }
    public boolean  isNotifications(){
        return this.notifications ;
    }
    public void  setNotifications(boolean notifications ){
        this.notifications  = notifications ;
    }
}
