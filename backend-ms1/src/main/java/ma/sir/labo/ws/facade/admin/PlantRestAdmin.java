package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Plant;
import ma.sir.labo.bean.history.PlantHistory;
import ma.sir.labo.dao.criteria.core.PlantCriteria;
import ma.sir.labo.dao.criteria.history.PlantHistoryCriteria;
import ma.sir.labo.service.facade.admin.PlantAdminService;
import ma.sir.labo.ws.converter.PlantConverter;
import ma.sir.labo.ws.dto.PlantDto;
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

@Api("Manages plant services")
@RestController
@RequestMapping("/api/admin/plant/")
public class PlantRestAdmin  extends AbstractController<Plant, PlantDto, PlantHistory, PlantCriteria, PlantHistoryCriteria, PlantAdminService, PlantConverter> {


    @ApiOperation("upload one plant")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple plants")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all plants")
    @GetMapping("")
    public ResponseEntity<List<PlantDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all plants")
    @GetMapping("optimized")
    public ResponseEntity<List<PlantDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a plant by id")
    @GetMapping("id/{id}")
    public ResponseEntity<PlantDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  plant")
    @PostMapping("")
    public ResponseEntity<PlantDto> save(@RequestBody PlantDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  plant")
    @PutMapping("")
    public ResponseEntity<PlantDto> update(@RequestBody PlantDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of plant")
    @PostMapping("multiple")
    public ResponseEntity<List<PlantDto>> delete(@RequestBody List<PlantDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified plant")
    @DeleteMapping("")
    public ResponseEntity<PlantDto> delete(@RequestBody PlantDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified plant")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple plants by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by gender id")
    @GetMapping("gender/id/{id}")
    public List<Plant> findByGenderId(@PathVariable Long id){
        return service.findByGenderId(id);
    }
    @ApiOperation("delete by gender id")
    @DeleteMapping("gender/id/{id}")
    public int deleteByGenderId(@PathVariable Long id){
        return service.deleteByGenderId(id);
    }
    @ApiOperation("find by ageCategory id")
    @GetMapping("ageCategory/id/{id}")
    public List<Plant> findByAgeCategoryId(@PathVariable Long id){
        return service.findByAgeCategoryId(id);
    }
    @ApiOperation("delete by ageCategory id")
    @DeleteMapping("ageCategory/id/{id}")
    public int deleteByAgeCategoryId(@PathVariable Long id){
        return service.deleteByAgeCategoryId(id);
    }
    @ApiOperation("find by dataImportExport id")
    @GetMapping("dataImportExport/id/{id}")
    public List<Plant> findByDataImportExportId(@PathVariable Long id){
        return service.findByDataImportExportId(id);
    }
    @ApiOperation("delete by dataImportExport id")
    @DeleteMapping("dataImportExport/id/{id}")
    public int deleteByDataImportExportId(@PathVariable Long id){
        return service.deleteByDataImportExportId(id);
    }
    @ApiOperation("Finds plants by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<PlantDto>> findByCriteria(@RequestBody PlantCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated plants by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PlantCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports plants by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody PlantCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets plant data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody PlantCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets plant history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets plant paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PlantHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports plant history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PlantHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets plant history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PlantHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public PlantRestAdmin (PlantAdminService service, PlantConverter converter) {
        super(service, converter);
    }


}