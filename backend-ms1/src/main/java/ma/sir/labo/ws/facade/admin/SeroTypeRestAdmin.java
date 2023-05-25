package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Serotype;
import ma.sir.labo.bean.history.SerotypeHistory;
import ma.sir.labo.dao.criteria.core.SerotypeCriteria;
import ma.sir.labo.dao.criteria.history.SerotypeHistoryCriteria;
import ma.sir.labo.service.facade.admin.SerotypeAdminService;
import ma.sir.labo.ws.converter.SerotypeConverter;
import ma.sir.labo.ws.dto.SerotypeDto;
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

@Api("Manages serotype services")
@RestController
@RequestMapping("/api/admin/serotype/")
public class SerotypeRestAdmin  extends AbstractController<Serotype, SerotypeDto, SerotypeHistory, SerotypeCriteria, SerotypeHistoryCriteria, SerotypeAdminService, SerotypeConverter> {


    @ApiOperation("upload one serotype")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple serotypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all serotypes")
    @GetMapping("")
    public ResponseEntity<List<SerotypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all serotypes")
    @GetMapping("optimized")
    public ResponseEntity<List<SerotypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a serotype by id")
    @GetMapping("id/{id}")
    public ResponseEntity<SerotypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  serotype")
    @PostMapping("")
    public ResponseEntity<SerotypeDto> save(@RequestBody SerotypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  serotype")
    @PutMapping("")
    public ResponseEntity<SerotypeDto> update(@RequestBody SerotypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of serotype")
    @PostMapping("multiple")
    public ResponseEntity<List<SerotypeDto>> delete(@RequestBody List<SerotypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified serotype")
    @DeleteMapping("")
    public ResponseEntity<SerotypeDto> delete(@RequestBody SerotypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified serotype")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple serotypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds serotypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<SerotypeDto>> findByCriteria(@RequestBody SerotypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated serotypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SerotypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports serotypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody SerotypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets serotype data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody SerotypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets serotype history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets serotype paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SerotypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports serotype history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SerotypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets serotype history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SerotypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public SerotypeRestAdmin (SerotypeAdminService service, SerotypeConverter converter) {
        super(service, converter);
    }


}