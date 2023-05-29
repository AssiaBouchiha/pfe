package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.LaboratoryAntibiotic;
import ma.sir.obs.bean.history.LaboratoryAntibioticHistory;
import ma.sir.obs.dao.criteria.core.LaboratoryAntibioticCriteria;
import ma.sir.obs.dao.criteria.history.LaboratoryAntibioticHistoryCriteria;
import ma.sir.obs.service.facade.admin.LaboratoryAntibioticAdminService;
import ma.sir.obs.ws.converter.LaboratoryAntibioticConverter;
import ma.sir.obs.ws.dto.LaboratoryAntibioticDto;
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

@Api("Manages laboratoryAntibiotic services")
@RestController
@RequestMapping("/api/admin/laboratoryAntibiotic/")
public class LaboratoryAntibioticRestAdmin  extends AbstractController<LaboratoryAntibiotic, LaboratoryAntibioticDto, LaboratoryAntibioticHistory, LaboratoryAntibioticCriteria, LaboratoryAntibioticHistoryCriteria, LaboratoryAntibioticAdminService, LaboratoryAntibioticConverter> {



    @ApiOperation("upload one laboratoryAntibiotic")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple laboratoryAntibiotics")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all laboratoryAntibiotics")
    @GetMapping("")
    public ResponseEntity<List<LaboratoryAntibioticDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Finds a laboratoryAntibiotic by id")
    @GetMapping("id/{id}")
    public ResponseEntity<LaboratoryAntibioticDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  laboratoryAntibiotic")
    @PostMapping("")
    public ResponseEntity<LaboratoryAntibioticDto> save(@RequestBody LaboratoryAntibioticDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  laboratoryAntibiotic")
    @PutMapping("")
    public ResponseEntity<LaboratoryAntibioticDto> update(@RequestBody LaboratoryAntibioticDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of laboratoryAntibiotic")
    @PostMapping("multiple")
    public ResponseEntity<List<LaboratoryAntibioticDto>> delete(@RequestBody List<LaboratoryAntibioticDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified laboratoryAntibiotic")
    @DeleteMapping("")
    public ResponseEntity<LaboratoryAntibioticDto> delete(@RequestBody LaboratoryAntibioticDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified laboratoryAntibiotic")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple laboratoryAntibiotics by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by laboratory id")
    @GetMapping("laboratory/id/{id}")
    public List<LaboratoryAntibiotic> findByLaboratoryId(@PathVariable Long id){
        return service.findByLaboratoryId(id);
    }
    @ApiOperation("delete by laboratory id")
    @DeleteMapping("laboratory/id/{id}")
    public int deleteByLaboratoryId(@PathVariable Long id){
        return service.deleteByLaboratoryId(id);
    }
    @ApiOperation("find by antibiotic id")
    @GetMapping("antibiotic/id/{id}")
    public List<LaboratoryAntibiotic> findByAntibioticId(@PathVariable Long id){
        return service.findByAntibioticId(id);
    }
    @ApiOperation("delete by antibiotic id")
    @DeleteMapping("antibiotic/id/{id}")
    public int deleteByAntibioticId(@PathVariable Long id){
        return service.deleteByAntibioticId(id);
    }
    @ApiOperation("Finds laboratoryAntibiotics by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<LaboratoryAntibioticDto>> findByCriteria(@RequestBody LaboratoryAntibioticCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated laboratoryAntibiotics by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody LaboratoryAntibioticCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports laboratoryAntibiotics by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody LaboratoryAntibioticCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets laboratoryAntibiotic data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody LaboratoryAntibioticCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets laboratoryAntibiotic history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets laboratoryAntibiotic paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody LaboratoryAntibioticHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports laboratoryAntibiotic history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody LaboratoryAntibioticHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets laboratoryAntibiotic history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody LaboratoryAntibioticHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public LaboratoryAntibioticRestAdmin (LaboratoryAntibioticAdminService service, LaboratoryAntibioticConverter converter) {
        super(service, converter);
    }


}