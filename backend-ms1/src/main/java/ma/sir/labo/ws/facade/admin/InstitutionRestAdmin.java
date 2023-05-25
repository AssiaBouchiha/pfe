package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Institution;
import ma.sir.labo.bean.history.InstitutionHistory;
import ma.sir.labo.dao.criteria.core.InstitutionCriteria;
import ma.sir.labo.dao.criteria.history.InstitutionHistoryCriteria;
import ma.sir.labo.service.facade.admin.InstitutionAdminService;
import ma.sir.labo.ws.converter.InstitutionConverter;
import ma.sir.labo.ws.dto.InstitutionDto;
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

@Api("Manages institution services")
@RestController
@RequestMapping("/api/admin/institution/")
public class InstitutionRestAdmin  extends AbstractController<Institution, InstitutionDto, InstitutionHistory, InstitutionCriteria, InstitutionHistoryCriteria, InstitutionAdminService, InstitutionConverter> {


    @ApiOperation("upload one institution")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple institutions")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all institutions")
    @GetMapping("")
    public ResponseEntity<List<InstitutionDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all institutions")
    @GetMapping("optimized")
    public ResponseEntity<List<InstitutionDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a institution by id")
    @GetMapping("id/{id}")
    public ResponseEntity<InstitutionDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  institution")
    @PostMapping("")
    public ResponseEntity<InstitutionDto> save(@RequestBody InstitutionDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  institution")
    @PutMapping("")
    public ResponseEntity<InstitutionDto> update(@RequestBody InstitutionDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of institution")
    @PostMapping("multiple")
    public ResponseEntity<List<InstitutionDto>> delete(@RequestBody List<InstitutionDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified institution")
    @DeleteMapping("")
    public ResponseEntity<InstitutionDto> delete(@RequestBody InstitutionDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified institution")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple institutions by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds institutions by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<InstitutionDto>> findByCriteria(@RequestBody InstitutionCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated institutions by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody InstitutionCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports institutions by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody InstitutionCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets institution data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody InstitutionCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets institution history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets institution paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody InstitutionHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports institution history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody InstitutionHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets institution history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody InstitutionHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public InstitutionRestAdmin (InstitutionAdminService service, InstitutionConverter converter) {
        super(service, converter);
    }


}