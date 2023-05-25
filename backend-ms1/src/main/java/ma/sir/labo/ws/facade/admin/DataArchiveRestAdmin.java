package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.DataArchive;
import ma.sir.labo.bean.history.DataArchiveHistory;
import ma.sir.labo.dao.criteria.core.DataArchiveCriteria;
import ma.sir.labo.dao.criteria.history.DataArchiveHistoryCriteria;
import ma.sir.labo.service.facade.admin.DataArchiveAdminService;
import ma.sir.labo.ws.converter.DataArchiveConverter;
import ma.sir.labo.ws.dto.DataArchiveDto;
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

@Api("Manages dataArchive services")
@RestController
@RequestMapping("/api/admin/dataArchive/")
public class DataArchiveRestAdmin  extends AbstractController<DataArchive, DataArchiveDto, DataArchiveHistory, DataArchiveCriteria, DataArchiveHistoryCriteria, DataArchiveAdminService, DataArchiveConverter> {


    @ApiOperation("upload one dataArchive")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple dataArchives")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all dataArchives")
    @GetMapping("")
    public ResponseEntity<List<DataArchiveDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all dataArchives")
    @GetMapping("optimized")
    public ResponseEntity<List<DataArchiveDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a dataArchive by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DataArchiveDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  dataArchive")
    @PostMapping("")
    public ResponseEntity<DataArchiveDto> save(@RequestBody DataArchiveDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  dataArchive")
    @PutMapping("")
    public ResponseEntity<DataArchiveDto> update(@RequestBody DataArchiveDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of dataArchive")
    @PostMapping("multiple")
    public ResponseEntity<List<DataArchiveDto>> delete(@RequestBody List<DataArchiveDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified dataArchive")
    @DeleteMapping("")
    public ResponseEntity<DataArchiveDto> delete(@RequestBody DataArchiveDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified dataArchive")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple dataArchives by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<DataArchive> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("Finds dataArchives by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DataArchiveDto>> findByCriteria(@RequestBody DataArchiveCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated dataArchives by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DataArchiveCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataArchives by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DataArchiveCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets dataArchive data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DataArchiveCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets dataArchive history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets dataArchive paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DataArchiveHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataArchive history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DataArchiveHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets dataArchive history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DataArchiveHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DataArchiveRestAdmin (DataArchiveAdminService service, DataArchiveConverter converter) {
        super(service, converter);
    }


}