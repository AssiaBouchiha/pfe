package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Report;
import ma.sir.labo.bean.history.ReportHistory;
import ma.sir.labo.dao.criteria.core.ReportCriteria;
import ma.sir.labo.dao.criteria.history.ReportHistoryCriteria;
import ma.sir.labo.service.facade.admin.ReportAdminService;
import ma.sir.labo.ws.converter.ReportConverter;
import ma.sir.labo.ws.dto.ReportDto;
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

@Api("Manages report services")
@RestController
@RequestMapping("/api/admin/report/")
public class ReportRestAdmin  extends AbstractController<Report, ReportDto, ReportHistory, ReportCriteria, ReportHistoryCriteria, ReportAdminService, ReportConverter> {


    @ApiOperation("upload one report")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple reports")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all reports")
    @GetMapping("")
    public ResponseEntity<List<ReportDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all reports")
    @GetMapping("optimized")
    public ResponseEntity<List<ReportDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a report by id")
    @GetMapping("id/{id}")
    public ResponseEntity<ReportDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  report")
    @PostMapping("")
    public ResponseEntity<ReportDto> save(@RequestBody ReportDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  report")
    @PutMapping("")
    public ResponseEntity<ReportDto> update(@RequestBody ReportDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of report")
    @PostMapping("multiple")
    public ResponseEntity<List<ReportDto>> delete(@RequestBody List<ReportDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified report")
    @DeleteMapping("")
    public ResponseEntity<ReportDto> delete(@RequestBody ReportDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified report")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple reports by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<Report> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("Finds reports by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<ReportDto>> findByCriteria(@RequestBody ReportCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated reports by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ReportCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports reports by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody ReportCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets report data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody ReportCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets report history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets report paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ReportHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports report history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ReportHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets report history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ReportHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public ReportRestAdmin (ReportAdminService service, ReportConverter converter) {
        super(service, converter);
    }


}