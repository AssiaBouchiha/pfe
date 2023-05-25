package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Location;
import ma.sir.labo.bean.history.LocationHistory;
import ma.sir.labo.dao.criteria.core.LocationCriteria;
import ma.sir.labo.dao.criteria.history.LocationHistoryCriteria;
import ma.sir.labo.service.facade.admin.LocationAdminService;
import ma.sir.labo.ws.converter.LocationConverter;
import ma.sir.labo.ws.dto.LocationDto;
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

@Api("Manages location services")
@RestController
@RequestMapping("/api/admin/location/")
public class LocationRestAdmin  extends AbstractController<Location, LocationDto, LocationHistory, LocationCriteria, LocationHistoryCriteria, LocationAdminService, LocationConverter> {


    @ApiOperation("upload one location")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple locations")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all locations")
    @GetMapping("")
    public ResponseEntity<List<LocationDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all locations")
    @GetMapping("optimized")
    public ResponseEntity<List<LocationDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a location by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LocationDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  location")
    @PostMapping("")
    public ResponseEntity<LocationDto> save(@RequestBody LocationDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  location")
    @PutMapping("")
    public ResponseEntity<LocationDto> update(@RequestBody LocationDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of location")
    @PostMapping("multiple")
    public ResponseEntity<List<LocationDto>> delete(@RequestBody List<LocationDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified location")
    @DeleteMapping("")
    public ResponseEntity<LocationDto> delete(@RequestBody LocationDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified location")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple locations by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by institution id")
    @GetMapping("institution/id/{id}")
    public List<Location> findByInstitutionId(@PathVariable Long id){
        return service.findByInstitutionId(id);
    }
    @ApiOperation("delete by institution id")
    @DeleteMapping("institution/id/{id}")
    public int deleteByInstitutionId(@PathVariable Long id){
        return service.deleteByInstitutionId(id);
    }
    @ApiOperation("find by department id")
    @GetMapping("department/id/{id}")
    public List<Location> findByDepartmentId(@PathVariable Long id){
        return service.findByDepartmentId(id);
    }
    @ApiOperation("delete by department id")
    @DeleteMapping("department/id/{id}")
    public int deleteByDepartmentId(@PathVariable Long id){
        return service.deleteByDepartmentId(id);
    }
    @ApiOperation("find by locationType id")
    @GetMapping("locationType/id/{id}")
    public List<Location> findByLocationTypeId(@PathVariable Long id){
        return service.findByLocationTypeId(id);
    }
    @ApiOperation("delete by locationType id")
    @DeleteMapping("locationType/id/{id}")
    public int deleteByLocationTypeId(@PathVariable Long id){
        return service.deleteByLocationTypeId(id);
    }
    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<Location> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("Finds locations by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LocationDto>> findByCriteria(@RequestBody LocationCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated locations by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LocationCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locations by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LocationCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets location data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LocationCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets location history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets location paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LocationHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports location history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LocationHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets location history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LocationHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LocationRestAdmin (LocationAdminService service, LocationConverter converter) {
        super(service, converter);
    }


}