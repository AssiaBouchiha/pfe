package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.LocationData;
import ma.sir.obs.bean.history.LocationDataHistory;
import ma.sir.obs.dao.criteria.core.LocationDataCriteria;
import ma.sir.obs.dao.criteria.history.LocationDataHistoryCriteria;
import ma.sir.obs.service.facade.admin.LocationDataAdminService;
import ma.sir.obs.ws.converter.LocationDataConverter;
import ma.sir.obs.ws.dto.LocationDataDto;
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

@Api("Manages locationData services")
@RestController
@RequestMapping("/api/admin/locationData/")
public class LocationDataRestAdmin  extends AbstractController<LocationData, LocationDataDto, LocationDataHistory, LocationDataCriteria, LocationDataHistoryCriteria, LocationDataAdminService, LocationDataConverter> {



    @ApiOperation("upload one locationData")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple locationDatas")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all locationDatas")
    @GetMapping("")
    public ResponseEntity<List<LocationDataDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all locationDatas")
    @GetMapping("optimized")
    public ResponseEntity<List<LocationDataDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a locationData by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LocationDataDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  locationData")
    @PostMapping("")
    public ResponseEntity<LocationDataDto> save(@RequestBody LocationDataDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  locationData")
    @PutMapping("")
    public ResponseEntity<LocationDataDto> update(@RequestBody LocationDataDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of locationData")
    @PostMapping("multiple")
    public ResponseEntity<List<LocationDataDto>> delete(@RequestBody List<LocationDataDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified locationData")
    @DeleteMapping("")
    public ResponseEntity<LocationDataDto> delete(@RequestBody LocationDataDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified locationData")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple locationDatas by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by institution id")
    @GetMapping("institution/id/{id}")
    public List<LocationData> findByInstitutionId(@PathVariable Long id){
        return service.findByInstitutionId(id);
    }
    @ApiOperation("delete by institution id")
    @DeleteMapping("institution/id/{id}")
    public int deleteByInstitutionId(@PathVariable Long id){
        return service.deleteByInstitutionId(id);
    }
    @ApiOperation("find by department id")
    @GetMapping("department/id/{id}")
    public List<LocationData> findByDepartmentId(@PathVariable Long id){
        return service.findByDepartmentId(id);
    }
    @ApiOperation("delete by department id")
    @DeleteMapping("department/id/{id}")
    public int deleteByDepartmentId(@PathVariable Long id){
        return service.deleteByDepartmentId(id);
    }
    @ApiOperation("find by locationType id")
    @GetMapping("locationType/id/{id}")
    public List<LocationData> findByLocationTypeId(@PathVariable Long id){
        return service.findByLocationTypeId(id);
    }
    @ApiOperation("delete by locationType id")
    @DeleteMapping("locationType/id/{id}")
    public int deleteByLocationTypeId(@PathVariable Long id){
        return service.deleteByLocationTypeId(id);
    }
    @ApiOperation("Finds locationDatas by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LocationDataDto>> findByCriteria(@RequestBody LocationDataCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated locationDatas by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LocationDataCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locationDatas by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LocationDataCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets locationData data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LocationDataCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets locationData history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets locationData paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LocationDataHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locationData history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LocationDataHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets locationData history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LocationDataHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LocationDataRestAdmin (LocationDataAdminService service, LocationDataConverter converter) {
        super(service, converter);
    }


}