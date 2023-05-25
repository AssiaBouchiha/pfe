package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Animal;
import ma.sir.labo.bean.history.AnimalHistory;
import ma.sir.labo.dao.criteria.core.AnimalCriteria;
import ma.sir.labo.dao.criteria.history.AnimalHistoryCriteria;
import ma.sir.labo.service.facade.admin.AnimalAdminService;
import ma.sir.labo.ws.converter.AnimalConverter;
import ma.sir.labo.ws.dto.AnimalDto;
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

@Api("Manages animal services")
@RestController
@RequestMapping("/api/admin/animal/")
public class AnimalRestAdmin  extends AbstractController<Animal, AnimalDto, AnimalHistory, AnimalCriteria, AnimalHistoryCriteria, AnimalAdminService, AnimalConverter> {


    @ApiOperation("upload one animal")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple animals")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all animals")
    @GetMapping("")
    public ResponseEntity<List<AnimalDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all animals")
    @GetMapping("optimized")
    public ResponseEntity<List<AnimalDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a animal by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AnimalDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  animal")
    @PostMapping("")
    public ResponseEntity<AnimalDto> save(@RequestBody AnimalDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  animal")
    @PutMapping("")
    public ResponseEntity<AnimalDto> update(@RequestBody AnimalDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of animal")
    @PostMapping("multiple")
    public ResponseEntity<List<AnimalDto>> delete(@RequestBody List<AnimalDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified animal")
    @DeleteMapping("")
    public ResponseEntity<AnimalDto> delete(@RequestBody AnimalDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified animal")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple animals by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by gender id")
    @GetMapping("gender/id/{id}")
    public List<Animal> findByGenderId(@PathVariable Long id){
        return service.findByGenderId(id);
    }
    @ApiOperation("delete by gender id")
    @DeleteMapping("gender/id/{id}")
    public int deleteByGenderId(@PathVariable Long id){
        return service.deleteByGenderId(id);
    }
    @ApiOperation("find by ageCategory id")
    @GetMapping("ageCategory/id/{id}")
    public List<Animal> findByAgeCategoryId(@PathVariable Long id){
        return service.findByAgeCategoryId(id);
    }
    @ApiOperation("delete by ageCategory id")
    @DeleteMapping("ageCategory/id/{id}")
    public int deleteByAgeCategoryId(@PathVariable Long id){
        return service.deleteByAgeCategoryId(id);
    }
    @ApiOperation("find by animalSpecie id")
    @GetMapping("animalSpecie/id/{id}")
    public List<Animal> findByAnimalSpecieId(@PathVariable Long id){
        return service.findByAnimalSpecieId(id);
    }
    @ApiOperation("delete by animalSpecie id")
    @DeleteMapping("animalSpecie/id/{id}")
    public int deleteByAnimalSpecieId(@PathVariable Long id){
        return service.deleteByAnimalSpecieId(id);
    }
    @ApiOperation("find by animalType id")
    @GetMapping("animalType/id/{id}")
    public List<Animal> findByAnimalTypeId(@PathVariable Long id){
        return service.findByAnimalTypeId(id);
    }
    @ApiOperation("delete by animalType id")
    @DeleteMapping("animalType/id/{id}")
    public int deleteByAnimalTypeId(@PathVariable Long id){
        return service.deleteByAnimalTypeId(id);
    }
    @ApiOperation("find by marketCategory id")
    @GetMapping("marketCategory/id/{id}")
    public List<Animal> findByMarketCategoryId(@PathVariable Long id){
        return service.findByMarketCategoryId(id);
    }
    @ApiOperation("delete by marketCategory id")
    @DeleteMapping("marketCategory/id/{id}")
    public int deleteByMarketCategoryId(@PathVariable Long id){
        return service.deleteByMarketCategoryId(id);
    }
    @ApiOperation("find by dataImportExport id")
    @GetMapping("dataImportExport/id/{id}")
    public List<Animal> findByDataImportExportId(@PathVariable Long id){
        return service.findByDataImportExportId(id);
    }
    @ApiOperation("delete by dataImportExport id")
    @DeleteMapping("dataImportExport/id/{id}")
    public int deleteByDataImportExportId(@PathVariable Long id){
        return service.deleteByDataImportExportId(id);
    }
    @ApiOperation("Finds animals by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AnimalDto>> findByCriteria(@RequestBody AnimalCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated animals by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AnimalCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports animals by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AnimalCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets animal data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AnimalCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets animal history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets animal paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AnimalHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports animal history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AnimalHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets animal history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AnimalHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AnimalRestAdmin (AnimalAdminService service, AnimalConverter converter) {
        super(service, converter);
    }


}