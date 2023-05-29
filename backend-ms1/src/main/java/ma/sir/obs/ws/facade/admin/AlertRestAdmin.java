package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.Alert;
import ma.sir.obs.bean.history.AlertHistory;
import ma.sir.obs.dao.criteria.core.AlertCriteria;
import ma.sir.obs.dao.criteria.history.AlertHistoryCriteria;
import ma.sir.obs.service.facade.admin.AlertAdminService;
import ma.sir.obs.ws.converter.AlertConverter;
import ma.sir.obs.ws.dto.AlertDto;
import ma.sir.obs.zynerator.controller.AbstractController;
import ma.sir.obs.zynerator.dto.AuditEntityDto;
import ma.sir.obs.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.obs.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.obs.zynerator.dto.FileTempDto;

@Api("Manages alert services")
@RestController
@RequestMapping("/api/admin/alert/")
public class AlertRestAdmin  extends AbstractController<Alert, AlertDto, AlertHistory, AlertCriteria, AlertHistoryCriteria, AlertAdminService, AlertConverter> {



    @ApiOperation("upload one alert")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple alerts")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all alerts")
    @GetMapping("")
    public ResponseEntity<List<AlertDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all alerts")
    @GetMapping("optimized")
    public ResponseEntity<List<AlertDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a alert by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AlertDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  alert")
    @PostMapping("")
    public ResponseEntity<AlertDto> save(@RequestBody AlertDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  alert")
    @PutMapping("")
    public ResponseEntity<AlertDto> update(@RequestBody AlertDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of alert")
    @PostMapping("multiple")
    public ResponseEntity<List<AlertDto>> delete(@RequestBody List<AlertDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified alert")
    @DeleteMapping("")
    public ResponseEntity<AlertDto> delete(@RequestBody AlertDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified alert")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple alerts by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<Alert> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("Finds alerts by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AlertDto>> findByCriteria(@RequestBody AlertCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated alerts by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AlertCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports alerts by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AlertCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets alert data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AlertCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets alert history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets alert paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AlertHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports alert history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AlertHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets alert history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AlertHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AlertRestAdmin (AlertAdminService service, AlertConverter converter) {
        super(service, converter);
    }


}