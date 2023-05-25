package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.DataAnalysis;
import ma.sir.labo.bean.history.DataAnalysisHistory;
import ma.sir.labo.dao.criteria.core.DataAnalysisCriteria;
import ma.sir.labo.dao.criteria.history.DataAnalysisHistoryCriteria;
import ma.sir.labo.service.facade.admin.DataAnalysisAdminService;
import ma.sir.labo.ws.converter.DataAnalysisConverter;
import ma.sir.labo.ws.dto.DataAnalysisDto;
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

@Api("Manages dataAnalysis services")
@RestController
@RequestMapping("/api/admin/dataAnalysis/")
public class DataAnalysisRestAdmin  extends AbstractController<DataAnalysis, DataAnalysisDto, DataAnalysisHistory, DataAnalysisCriteria, DataAnalysisHistoryCriteria, DataAnalysisAdminService, DataAnalysisConverter> {


    @ApiOperation("upload one dataAnalysis")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple dataAnalysiss")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all dataAnalysiss")
    @GetMapping("")
    public ResponseEntity<List<DataAnalysisDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all dataAnalysiss")
    @GetMapping("optimized")
    public ResponseEntity<List<DataAnalysisDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a dataAnalysis by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DataAnalysisDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  dataAnalysis")
    @PostMapping("")
    public ResponseEntity<DataAnalysisDto> save(@RequestBody DataAnalysisDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  dataAnalysis")
    @PutMapping("")
    public ResponseEntity<DataAnalysisDto> update(@RequestBody DataAnalysisDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of dataAnalysis")
    @PostMapping("multiple")
    public ResponseEntity<List<DataAnalysisDto>> delete(@RequestBody List<DataAnalysisDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified dataAnalysis")
    @DeleteMapping("")
    public ResponseEntity<DataAnalysisDto> delete(@RequestBody DataAnalysisDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified dataAnalysis")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple dataAnalysiss by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<DataAnalysis> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("Finds dataAnalysiss by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DataAnalysisDto>> findByCriteria(@RequestBody DataAnalysisCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated dataAnalysiss by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DataAnalysisCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataAnalysiss by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DataAnalysisCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets dataAnalysis data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DataAnalysisCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets dataAnalysis history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets dataAnalysis paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DataAnalysisHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataAnalysis history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DataAnalysisHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets dataAnalysis history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DataAnalysisHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DataAnalysisRestAdmin (DataAnalysisAdminService service, DataAnalysisConverter converter) {
        super(service, converter);
    }


}