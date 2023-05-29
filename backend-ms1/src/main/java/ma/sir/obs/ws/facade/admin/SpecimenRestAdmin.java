package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.Specimen;
import ma.sir.obs.bean.history.SpecimenHistory;
import ma.sir.obs.dao.criteria.core.SpecimenCriteria;
import ma.sir.obs.dao.criteria.history.SpecimenHistoryCriteria;
import ma.sir.obs.service.facade.admin.SpecimenAdminService;
import ma.sir.obs.ws.converter.SpecimenConverter;
import ma.sir.obs.ws.dto.SpecimenDto;
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

@Api("Manages specimen services")
@RestController
@RequestMapping("/api/admin/specimen/")
public class SpecimenRestAdmin  extends AbstractController<Specimen, SpecimenDto, SpecimenHistory, SpecimenCriteria, SpecimenHistoryCriteria, SpecimenAdminService, SpecimenConverter> {



    @ApiOperation("upload one specimen")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple specimens")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all specimens")
    @GetMapping("")
    public ResponseEntity<List<SpecimenDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all specimens")
    @GetMapping("optimized")
    public ResponseEntity<List<SpecimenDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a specimen by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SpecimenDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  specimen")
    @PostMapping("")
    public ResponseEntity<SpecimenDto> save(@RequestBody SpecimenDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  specimen")
    @PutMapping("")
    public ResponseEntity<SpecimenDto> update(@RequestBody SpecimenDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of specimen")
    @PostMapping("multiple")
    public ResponseEntity<List<SpecimenDto>> delete(@RequestBody List<SpecimenDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified specimen")
    @DeleteMapping("")
    public ResponseEntity<SpecimenDto> delete(@RequestBody SpecimenDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified specimen")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple specimens by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by reason id")
    @GetMapping("reason/id/{id}")
    public List<Specimen> findByReasonId(@PathVariable Long id){
        return service.findByReasonId(id);
    }
    @ApiOperation("delete by reason id")
    @DeleteMapping("reason/id/{id}")
    public int deleteByReasonId(@PathVariable Long id){
        return service.deleteByReasonId(id);
    }
    @ApiOperation("Finds specimens by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SpecimenDto>> findByCriteria(@RequestBody SpecimenCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated specimens by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SpecimenCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports specimens by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SpecimenCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets specimen data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SpecimenCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets specimen history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets specimen paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SpecimenHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports specimen history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SpecimenHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets specimen history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SpecimenHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SpecimenRestAdmin (SpecimenAdminService service, SpecimenConverter converter) {
        super(service, converter);
    }


}