package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Antibiotic;
import ma.sir.labo.bean.history.AntibioticHistory;
import ma.sir.labo.dao.criteria.core.AntibioticCriteria;
import ma.sir.labo.dao.criteria.history.AntibioticHistoryCriteria;
import ma.sir.labo.service.facade.admin.AntibioticAdminService;
import ma.sir.labo.ws.converter.AntibioticConverter;
import ma.sir.labo.ws.dto.AntibioticDto;
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

@Api("Manages antibiotic services")
@RestController
@RequestMapping("/api/admin/antibiotic/")
public class AntibioticRestAdmin  extends AbstractController<Antibiotic, AntibioticDto, AntibioticHistory, AntibioticCriteria, AntibioticHistoryCriteria, AntibioticAdminService, AntibioticConverter> {


    @ApiOperation("upload one antibiotic")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple antibiotics")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all antibiotics")
    @GetMapping("")
    public ResponseEntity<List<AntibioticDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all antibiotics")
    @GetMapping("optimized")
    public ResponseEntity<List<AntibioticDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a antibiotic by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AntibioticDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  antibiotic")
    @PostMapping("")
    public ResponseEntity<AntibioticDto> save(@RequestBody AntibioticDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  antibiotic")
    @PutMapping("")
    public ResponseEntity<AntibioticDto> update(@RequestBody AntibioticDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of antibiotic")
    @PostMapping("multiple")
    public ResponseEntity<List<AntibioticDto>> delete(@RequestBody List<AntibioticDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified antibiotic")
    @DeleteMapping("")
    public ResponseEntity<AntibioticDto> delete(@RequestBody AntibioticDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified antibiotic")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple antibiotics by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by microbiology id")
    @GetMapping("microbiology/id/{id}")
    public List<Antibiotic> findByMicrobiologyId(@PathVariable Long id){
        return service.findByMicrobiologyId(id);
    }
    @ApiOperation("delete by microbiology id")
    @DeleteMapping("microbiology/id/{id}")
    public int deleteByMicrobiologyId(@PathVariable Long id){
        return service.deleteByMicrobiologyId(id);
    }
    @ApiOperation("Finds a antibiotic and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<AntibioticDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Finds antibiotics by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AntibioticDto>> findByCriteria(@RequestBody AntibioticCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated antibiotics by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AntibioticCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports antibiotics by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AntibioticCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets antibiotic data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AntibioticCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets antibiotic history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets antibiotic paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AntibioticHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports antibiotic history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AntibioticHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets antibiotic history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AntibioticHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AntibioticRestAdmin (AntibioticAdminService service, AntibioticConverter converter) {
        super(service, converter);
    }


}