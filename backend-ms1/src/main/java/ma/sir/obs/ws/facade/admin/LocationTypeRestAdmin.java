package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.LocationType;
import ma.sir.obs.bean.history.LocationTypeHistory;
import ma.sir.obs.dao.criteria.core.LocationTypeCriteria;
import ma.sir.obs.dao.criteria.history.LocationTypeHistoryCriteria;
import ma.sir.obs.service.facade.admin.LocationTypeAdminService;
import ma.sir.obs.ws.converter.LocationTypeConverter;
import ma.sir.obs.ws.dto.LocationTypeDto;
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

@Api("Manages locationType services")
@RestController
@RequestMapping("/api/admin/locationType/")
public class LocationTypeRestAdmin  extends AbstractController<LocationType, LocationTypeDto, LocationTypeHistory, LocationTypeCriteria, LocationTypeHistoryCriteria, LocationTypeAdminService, LocationTypeConverter> {



    @ApiOperation("upload one locationType")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple locationTypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all locationTypes")
    @GetMapping("")
    public ResponseEntity<List<LocationTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all locationTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<LocationTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a locationType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LocationTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  locationType")
    @PostMapping("")
    public ResponseEntity<LocationTypeDto> save(@RequestBody LocationTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  locationType")
    @PutMapping("")
    public ResponseEntity<LocationTypeDto> update(@RequestBody LocationTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of locationType")
    @PostMapping("multiple")
    public ResponseEntity<List<LocationTypeDto>> delete(@RequestBody List<LocationTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified locationType")
    @DeleteMapping("")
    public ResponseEntity<LocationTypeDto> delete(@RequestBody LocationTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified locationType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple locationTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds locationTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LocationTypeDto>> findByCriteria(@RequestBody LocationTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated locationTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LocationTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locationTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LocationTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets locationType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LocationTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets locationType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets locationType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LocationTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports locationType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LocationTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets locationType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LocationTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LocationTypeRestAdmin (LocationTypeAdminService service, LocationTypeConverter converter) {
        super(service, converter);
    }


}