package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Laboratory;
import ma.sir.labo.bean.history.LaboratoryHistory;
import ma.sir.labo.dao.criteria.core.LaboratoryCriteria;
import ma.sir.labo.dao.criteria.history.LaboratoryHistoryCriteria;
import ma.sir.labo.service.facade.admin.LaboratoryAdminService;
import ma.sir.labo.ws.converter.LaboratoryConverter;
import ma.sir.labo.ws.dto.LaboratoryDto;
import ma.sir.labo.zynerator.controller.AbstractController;
import ma.sir.labo.zynerator.dto.AuditEntityDto;
import ma.sir.labo.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.sir.labo.zynerator.process.Result;


import org.springframework.web.multipart.MultipartFile;
import ma.sir.labo.zynerator.dto.FileTempDto;

@Api("Manages laboratory services")
@RestController
@RequestMapping("/api/admin/laboratory/")
public class LaboratoryRestAdmin  extends AbstractController<Laboratory, LaboratoryDto, LaboratoryHistory, LaboratoryCriteria, LaboratoryHistoryCriteria, LaboratoryAdminService, LaboratoryConverter> {


    @ApiOperation("upload one laboratory")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple laboratorys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all laboratorys")
    @GetMapping("")
    public ResponseEntity<List<LaboratoryDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all laboratorys")
    @GetMapping("optimized")
    public ResponseEntity<List<LaboratoryDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a laboratory by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LaboratoryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  laboratory")
    @PostMapping("")
    public ResponseEntity<LaboratoryDto> save(@RequestBody LaboratoryDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  laboratory")
    @PutMapping("")
    public ResponseEntity<LaboratoryDto> update(@RequestBody LaboratoryDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of laboratory")
    @PostMapping("multiple")
    public ResponseEntity<List<LaboratoryDto>> delete(@RequestBody List<LaboratoryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified laboratory")
    @DeleteMapping("")
    public ResponseEntity<LaboratoryDto> delete(@RequestBody LaboratoryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified laboratory")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple laboratorys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by location id")
    @GetMapping("location/id/{id}")
    public List<Laboratory> findByLocationId(@PathVariable Long id){
        return service.findByLocationId(id);
    }
    @ApiOperation("delete by location id")
    @DeleteMapping("location/id/{id}")
    public int deleteByLocationId(@PathVariable Long id){
        return service.deleteByLocationId(id);
    }
    @ApiOperation("find by dataImportExport id")
    @GetMapping("dataImportExport/id/{id}")
    public List<Laboratory> findByDataImportExportId(@PathVariable Long id){
        return service.findByDataImportExportId(id);
    }
    @ApiOperation("delete by dataImportExport id")
    @DeleteMapping("dataImportExport/id/{id}")
    public int deleteByDataImportExportId(@PathVariable Long id){
        return service.deleteByDataImportExportId(id);
    }
    @ApiOperation("find by dataanalysis id")
    @GetMapping("dataanalysis/id/{id}")
    public List<Laboratory> findByDataanalysisId(@PathVariable Long id){
        return service.findByDataanalysisId(id);
    }
    @ApiOperation("delete by dataanalysis id")
    @DeleteMapping("dataanalysis/id/{id}")
    public int deleteByDataanalysisId(@PathVariable Long id){
        return service.deleteByDataanalysisId(id);
    }
    @ApiOperation("find by dataarchive id")
    @GetMapping("dataarchive/id/{id}")
    public List<Laboratory> findByDataarchiveId(@PathVariable Long id){
        return service.findByDataarchiveId(id);
    }
    @ApiOperation("delete by dataarchive id")
    @DeleteMapping("dataarchive/id/{id}")
    public int deleteByDataarchiveId(@PathVariable Long id){
        return service.deleteByDataarchiveId(id);
    }
    @ApiOperation("find by report id")
    @GetMapping("report/id/{id}")
    public List<Laboratory> findByReportId(@PathVariable Long id){
        return service.findByReportId(id);
    }
    @ApiOperation("delete by report id")
    @DeleteMapping("report/id/{id}")
    public int deleteByReportId(@PathVariable Long id){
        return service.deleteByReportId(id);
    }
    @ApiOperation("Finds a laboratory and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<LaboratoryDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds laboratorys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LaboratoryDto>> findByCriteria(@RequestBody LaboratoryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated laboratorys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LaboratoryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports laboratorys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LaboratoryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets laboratory data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LaboratoryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets laboratory history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets laboratory paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LaboratoryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports laboratory history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LaboratoryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets laboratory history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LaboratoryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LaboratoryRestAdmin (LaboratoryAdminService service, LaboratoryConverter converter) {
        super(service, converter);
    }


}