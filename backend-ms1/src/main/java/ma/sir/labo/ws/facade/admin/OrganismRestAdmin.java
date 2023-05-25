package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Organism;
import ma.sir.labo.bean.history.OrganismHistory;
import ma.sir.labo.dao.criteria.core.OrganismCriteria;
import ma.sir.labo.dao.criteria.history.OrganismHistoryCriteria;
import ma.sir.labo.service.facade.admin.OrganismAdminService;
import ma.sir.labo.ws.converter.OrganismConverter;
import ma.sir.labo.ws.dto.OrganismDto;
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

@Api("Manages organism services")
@RestController
@RequestMapping("/api/admin/organism/")
public class OrganismRestAdmin  extends AbstractController<Organism, OrganismDto, OrganismHistory, OrganismCriteria, OrganismHistoryCriteria, OrganismAdminService, OrganismConverter> {


    @ApiOperation("upload one organism")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple organisms")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all organisms")
    @GetMapping("")
    public ResponseEntity<List<OrganismDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all organisms")
    @GetMapping("optimized")
    public ResponseEntity<List<OrganismDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a organism by id")
    @GetMapping("id/{id}")
    public ResponseEntity<OrganismDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  organism")
    @PostMapping("")
    public ResponseEntity<OrganismDto> save(@RequestBody OrganismDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  organism")
    @PutMapping("")
    public ResponseEntity<OrganismDto> update(@RequestBody OrganismDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of organism")
    @PostMapping("multiple")
    public ResponseEntity<List<OrganismDto>> delete(@RequestBody List<OrganismDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified organism")
    @DeleteMapping("")
    public ResponseEntity<OrganismDto> delete(@RequestBody OrganismDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified organism")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple organisms by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds organisms by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<OrganismDto>> findByCriteria(@RequestBody OrganismCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated organisms by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody OrganismCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports organisms by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody OrganismCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets organism data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody OrganismCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets organism history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets organism paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody OrganismHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports organism history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody OrganismHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets organism history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody OrganismHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public OrganismRestAdmin (OrganismAdminService service, OrganismConverter converter) {
        super(service, converter);
    }


}