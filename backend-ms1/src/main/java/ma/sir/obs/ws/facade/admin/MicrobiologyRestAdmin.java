package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.Microbiology;
import ma.sir.obs.bean.history.MicrobiologyHistory;
import ma.sir.obs.dao.criteria.core.MicrobiologyCriteria;
import ma.sir.obs.dao.criteria.history.MicrobiologyHistoryCriteria;
import ma.sir.obs.service.facade.admin.MicrobiologyAdminService;
import ma.sir.obs.ws.converter.MicrobiologyConverter;
import ma.sir.obs.ws.dto.MicrobiologyDto;
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

@Api("Manages microbiology services")
@RestController
@RequestMapping("/api/admin/microbiology/")
public class MicrobiologyRestAdmin  extends AbstractController<Microbiology, MicrobiologyDto, MicrobiologyHistory, MicrobiologyCriteria, MicrobiologyHistoryCriteria, MicrobiologyAdminService, MicrobiologyConverter> {



    @ApiOperation("upload one microbiology")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple microbiologys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all microbiologys")
    @GetMapping("")
    public ResponseEntity<List<MicrobiologyDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all microbiologys")
    @GetMapping("optimized")
    public ResponseEntity<List<MicrobiologyDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a microbiology by id")
    @GetMapping("id/{id}")
    public ResponseEntity<MicrobiologyDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  microbiology")
    @PostMapping("")
    public ResponseEntity<MicrobiologyDto> save(@RequestBody MicrobiologyDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  microbiology")
    @PutMapping("")
    public ResponseEntity<MicrobiologyDto> update(@RequestBody MicrobiologyDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of microbiology")
    @PostMapping("multiple")
    public ResponseEntity<List<MicrobiologyDto>> delete(@RequestBody List<MicrobiologyDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified microbiology")
    @DeleteMapping("")
    public ResponseEntity<MicrobiologyDto> delete(@RequestBody MicrobiologyDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified microbiology")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple microbiologys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by organism id")
    @GetMapping("organism/id/{id}")
    public List<Microbiology> findByOrganismId(@PathVariable Long id){
        return service.findByOrganismId(id);
    }
    @ApiOperation("delete by organism id")
    @DeleteMapping("organism/id/{id}")
    public int deleteByOrganismId(@PathVariable Long id){
        return service.deleteByOrganismId(id);
    }
    @ApiOperation("find by seroType id")
    @GetMapping("seroType/id/{id}")
    public List<Microbiology> findBySeroTypeId(@PathVariable Long id){
        return service.findBySeroTypeId(id);
    }
    @ApiOperation("delete by seroType id")
    @DeleteMapping("seroType/id/{id}")
    public int deleteBySeroTypeId(@PathVariable Long id){
        return service.deleteBySeroTypeId(id);
    }
    @ApiOperation("find by antibiotic id")
    @GetMapping("antibiotic/id/{id}")
    public List<Microbiology> findByAntibioticId(@PathVariable Long id){
        return service.findByAntibioticId(id);
    }
    @ApiOperation("delete by antibiotic id")
    @DeleteMapping("antibiotic/id/{id}")
    public int deleteByAntibioticId(@PathVariable Long id){
        return service.deleteByAntibioticId(id);
    }
    @ApiOperation("Finds microbiologys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<MicrobiologyDto>> findByCriteria(@RequestBody MicrobiologyCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated microbiologys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody MicrobiologyCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports microbiologys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody MicrobiologyCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets microbiology data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody MicrobiologyCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets microbiology history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets microbiology paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody MicrobiologyHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports microbiology history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody MicrobiologyHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets microbiology history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody MicrobiologyHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public MicrobiologyRestAdmin (MicrobiologyAdminService service, MicrobiologyConverter converter) {
        super(service, converter);
    }


}