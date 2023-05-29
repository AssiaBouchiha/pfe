package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.Environment;
import ma.sir.obs.bean.history.EnvironmentHistory;
import ma.sir.obs.dao.criteria.core.EnvironmentCriteria;
import ma.sir.obs.dao.criteria.history.EnvironmentHistoryCriteria;
import ma.sir.obs.service.facade.admin.EnvironmentAdminService;
import ma.sir.obs.ws.converter.EnvironmentConverter;
import ma.sir.obs.ws.dto.EnvironmentDto;
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

@Api("Manages environment services")
@RestController
@RequestMapping("/api/admin/environment/")
public class EnvironmentRestAdmin  extends AbstractController<Environment, EnvironmentDto, EnvironmentHistory, EnvironmentCriteria, EnvironmentHistoryCriteria, EnvironmentAdminService, EnvironmentConverter> {



    @ApiOperation("upload one environment")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple environments")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all environments")
    @GetMapping("")
    public ResponseEntity<List<EnvironmentDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all environments")
    @GetMapping("optimized")
    public ResponseEntity<List<EnvironmentDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a environment by id")
    @GetMapping("id/{id}")
    public ResponseEntity<EnvironmentDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  environment")
    @PostMapping("")
    public ResponseEntity<EnvironmentDto> save(@RequestBody EnvironmentDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  environment")
    @PutMapping("")
    public ResponseEntity<EnvironmentDto> update(@RequestBody EnvironmentDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of environment")
    @PostMapping("multiple")
    public ResponseEntity<List<EnvironmentDto>> delete(@RequestBody List<EnvironmentDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified environment")
    @DeleteMapping("")
    public ResponseEntity<EnvironmentDto> delete(@RequestBody EnvironmentDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified environment")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple environments by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by gender id")
    @GetMapping("gender/id/{id}")
    public List<Environment> findByGenderId(@PathVariable Long id){
        return service.findByGenderId(id);
    }
    @ApiOperation("delete by gender id")
    @DeleteMapping("gender/id/{id}")
    public int deleteByGenderId(@PathVariable Long id){
        return service.deleteByGenderId(id);
    }
    @ApiOperation("find by ageCategory id")
    @GetMapping("ageCategory/id/{id}")
    public List<Environment> findByAgeCategoryId(@PathVariable Long id){
        return service.findByAgeCategoryId(id);
    }
    @ApiOperation("delete by ageCategory id")
    @DeleteMapping("ageCategory/id/{id}")
    public int deleteByAgeCategoryId(@PathVariable Long id){
        return service.deleteByAgeCategoryId(id);
    }
    @ApiOperation("Finds environments by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<EnvironmentDto>> findByCriteria(@RequestBody EnvironmentCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated environments by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody EnvironmentCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports environments by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody EnvironmentCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets environment data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody EnvironmentCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets environment history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets environment paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody EnvironmentHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports environment history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody EnvironmentHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets environment history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody EnvironmentHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public EnvironmentRestAdmin (EnvironmentAdminService service, EnvironmentConverter converter) {
        super(service, converter);
    }


}