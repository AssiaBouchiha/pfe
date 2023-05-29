package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.SeroType;
import ma.sir.obs.bean.history.SeroTypeHistory;
import ma.sir.obs.dao.criteria.core.SeroTypeCriteria;
import ma.sir.obs.dao.criteria.history.SeroTypeHistoryCriteria;
import ma.sir.obs.service.facade.admin.SeroTypeAdminService;
import ma.sir.obs.ws.converter.SeroTypeConverter;
import ma.sir.obs.ws.dto.SeroTypeDto;
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

@Api("Manages seroType services")
@RestController
@RequestMapping("/api/admin/seroType/")
public class SeroTypeRestAdmin  extends AbstractController<SeroType, SeroTypeDto, SeroTypeHistory, SeroTypeCriteria, SeroTypeHistoryCriteria, SeroTypeAdminService, SeroTypeConverter> {



    @ApiOperation("upload one seroType")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple seroTypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all seroTypes")
    @GetMapping("")
    public ResponseEntity<List<SeroTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all seroTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<SeroTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a seroType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SeroTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  seroType")
    @PostMapping("")
    public ResponseEntity<SeroTypeDto> save(@RequestBody SeroTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  seroType")
    @PutMapping("")
    public ResponseEntity<SeroTypeDto> update(@RequestBody SeroTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of seroType")
    @PostMapping("multiple")
    public ResponseEntity<List<SeroTypeDto>> delete(@RequestBody List<SeroTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified seroType")
    @DeleteMapping("")
    public ResponseEntity<SeroTypeDto> delete(@RequestBody SeroTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified seroType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple seroTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds seroTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SeroTypeDto>> findByCriteria(@RequestBody SeroTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated seroTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SeroTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports seroTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SeroTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets seroType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SeroTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets seroType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets seroType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SeroTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports seroType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SeroTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets seroType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SeroTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SeroTypeRestAdmin (SeroTypeAdminService service, SeroTypeConverter converter) {
        super(service, converter);
    }


}