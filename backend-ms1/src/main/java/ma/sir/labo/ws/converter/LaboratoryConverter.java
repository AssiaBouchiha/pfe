package  ma.sir.labo.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.labo.zynerator.util.ListUtil;


import ma.sir.labo.zynerator.util.StringUtil;
import ma.sir.labo.zynerator.converter.AbstractConverter;
import ma.sir.labo.zynerator.util.DateUtil;
import ma.sir.labo.bean.history.LaboratoryHistory;
import ma.sir.labo.bean.core.Laboratory;
import ma.sir.labo.ws.dto.LaboratoryDto;

@Component
public class LaboratoryConverter extends AbstractConverter<Laboratory, LaboratoryDto, LaboratoryHistory> {

    @Autowired
    private DataImportExportConverter dataImportExportConverter ;
    @Autowired
    private LaboratoryAntibioticConverter laboratoryAntibioticConverter ;
    @Autowired
    private DataAnalysisConverter dataAnalysisConverter ;
    @Autowired
    private MicrobiologyConverter microbiologyConverter ;
    @Autowired
    private ReportConverter reportConverter ;
    @Autowired
    private AlertConverter alertConverter ;
    @Autowired
    private NotificationConverter notificationConverter ;
    @Autowired
    private LocationConverter locationConverter ;
    @Autowired
    private DataArchiveConverter dataArchiveConverter ;
    @Autowired
    private AntibioticConverter antibioticConverter ;
    private boolean location;
    private boolean dataImportExport;
    private boolean dataanalysis;
    private boolean dataarchive;
    private boolean report;
    private boolean antibiotic;
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

            if(this.dataImportExport && dto.getDataImportExport()!=null)
                item.setDataImportExport(dataImportExportConverter.toItem(dto.getDataImportExport())) ;

            if(this.dataanalysis && dto.getDataanalysis()!=null)
                item.setDataanalysis(dataAnalysisConverter.toItem(dto.getDataanalysis())) ;

            if(this.dataarchive && dto.getDataarchive()!=null)
                item.setDataarchive(dataArchiveConverter.toItem(dto.getDataarchive())) ;

            if(this.report && dto.getReport()!=null)
                item.setReport(reportConverter.toItem(dto.getReport())) ;


            if(this.antibiotic && ListUtil.isNotEmpty(dto.getAntibiotic()))
                item.setAntibiotic(antibioticConverter.toItem(dto.getAntibiotic()));
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
        if(this.dataImportExport && item.getDataImportExport()!=null) {
            dto.setDataImportExport(dataImportExportConverter.toDto(item.getDataImportExport())) ;
        }
        if(this.dataanalysis && item.getDataanalysis()!=null) {
            dataAnalysisConverter.setLaboratory(false);
            dto.setDataanalysis(dataAnalysisConverter.toDto(item.getDataanalysis())) ;
            dataAnalysisConverter.setLaboratory(true);
        }
        if(this.dataarchive && item.getDataarchive()!=null) {
            dataArchiveConverter.setLaboratory(false);
            dto.setDataarchive(dataArchiveConverter.toDto(item.getDataarchive())) ;
            dataArchiveConverter.setLaboratory(true);
        }
        if(this.report && item.getReport()!=null) {
            reportConverter.setLaboratory(false);
            dto.setReport(reportConverter.toDto(item.getReport())) ;
            reportConverter.setLaboratory(true);
        }
        if(this.antibiotic && ListUtil.isNotEmpty(item.getAntibiotic())){
            antibioticConverter.init(true);
            antibioticConverter.setLaboratory(false);
            dto.setAntibiotic(antibioticConverter.toDto(item.getAntibiotic()));
            antibioticConverter.setLaboratory(true);

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
        this.antibiotic = value;
        this.alerts = value;
        this.notifications = value;
    }

    public void initObject(boolean value) {
        this.location = value;
        this.dataImportExport = value;
        this.dataanalysis = value;
        this.dataarchive = value;
        this.report = value;
    }


    public DataImportExportConverter getDataImportExportConverter(){
        return this.dataImportExportConverter;
    }
    public void setDataImportExportConverter(DataImportExportConverter dataImportExportConverter ){
        this.dataImportExportConverter = dataImportExportConverter;
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
    public MicrobiologyConverter getMicrobiologyConverter(){
        return this.microbiologyConverter;
    }
    public void setMicrobiologyConverter(MicrobiologyConverter microbiologyConverter ){
        this.microbiologyConverter = microbiologyConverter;
    }
    public ReportConverter getReportConverter(){
        return this.reportConverter;
    }
    public void setReportConverter(ReportConverter reportConverter ){
        this.reportConverter = reportConverter;
    }
    public AlertConverter getAlertConverter(){
        return this.alertConverter;
    }
    public void setAlertConverter(AlertConverter alertConverter ){
        this.alertConverter = alertConverter;
    }
    public NotificationConverter getNotificationConverter(){
        return this.notificationConverter;
    }
    public void setNotificationConverter(NotificationConverter notificationConverter ){
        this.notificationConverter = notificationConverter;
    }
    public LocationConverter getLocationConverter(){
        return this.locationConverter;
    }
    public void setLocationConverter(LocationConverter locationConverter ){
        this.locationConverter = locationConverter;
    }
    public DataArchiveConverter getDataArchiveConverter(){
        return this.dataArchiveConverter;
    }
    public void setDataArchiveConverter(DataArchiveConverter dataArchiveConverter ){
        this.dataArchiveConverter = dataArchiveConverter;
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
    public boolean  isDataImportExport(){
        return this.dataImportExport;
    }
    public void  setDataImportExport(boolean dataImportExport){
        this.dataImportExport = dataImportExport;
    }
    public boolean  isDataanalysis(){
        return this.dataanalysis;
    }
    public void  setDataanalysis(boolean dataanalysis){
        this.dataanalysis = dataanalysis;
    }
    public boolean  isDataarchive(){
        return this.dataarchive;
    }
    public void  setDataarchive(boolean dataarchive){
        this.dataarchive = dataarchive;
    }
    public boolean  isReport(){
        return this.report;
    }
    public void  setReport(boolean report){
        this.report = report;
    }
    public boolean  isAntibiotic(){
        return this.antibiotic ;
    }
    public void  setAntibiotic(boolean antibiotic ){
        this.antibiotic  = antibiotic ;
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
