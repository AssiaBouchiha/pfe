package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.Food;
import ma.sir.obs.bean.history.FoodHistory;
import ma.sir.obs.dao.criteria.core.FoodCriteria;
import ma.sir.obs.dao.criteria.history.FoodHistoryCriteria;
import ma.sir.obs.service.facade.admin.FoodAdminService;
import ma.sir.obs.ws.converter.FoodConverter;
import ma.sir.obs.ws.dto.FoodDto;
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

@Api("Manages food services")
@RestController
@RequestMapping("/api/admin/food/")
public class FoodRestAdmin  extends AbstractController<Food, FoodDto, FoodHistory, FoodCriteria, FoodHistoryCriteria, FoodAdminService, FoodConverter> {



    @ApiOperation("upload one food")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple foods")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all foods")
    @GetMapping("")
    public ResponseEntity<List<FoodDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all foods")
    @GetMapping("optimized")
    public ResponseEntity<List<FoodDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a food by id")
    @GetMapping("id/{id}")
    public ResponseEntity<FoodDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  food")
    @PostMapping("")
    public ResponseEntity<FoodDto> save(@RequestBody FoodDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  food")
    @PutMapping("")
    public ResponseEntity<FoodDto> update(@RequestBody FoodDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of food")
    @PostMapping("multiple")
    public ResponseEntity<List<FoodDto>> delete(@RequestBody List<FoodDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified food")
    @DeleteMapping("")
    public ResponseEntity<FoodDto> delete(@RequestBody FoodDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified food")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple foods by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by animalSpecie id")
    @GetMapping("animalSpecie/id/{id}")
    public List<Food> findByAnimalSpecieId(@PathVariable Long id){
        return service.findByAnimalSpecieId(id);
    }
    @ApiOperation("delete by animalSpecie id")
    @DeleteMapping("animalSpecie/id/{id}")
    public int deleteByAnimalSpecieId(@PathVariable Long id){
        return service.deleteByAnimalSpecieId(id);
    }
    @ApiOperation("find by marketCategory id")
    @GetMapping("marketCategory/id/{id}")
    public List<Food> findByMarketCategoryId(@PathVariable Long id){
        return service.findByMarketCategoryId(id);
    }
    @ApiOperation("delete by marketCategory id")
    @DeleteMapping("marketCategory/id/{id}")
    public int deleteByMarketCategoryId(@PathVariable Long id){
        return service.deleteByMarketCategoryId(id);
    }
    @ApiOperation("find by brand id")
    @GetMapping("brand/id/{id}")
    public List<Food> findByBrandId(@PathVariable Long id){
        return service.findByBrandId(id);
    }
    @ApiOperation("delete by brand id")
    @DeleteMapping("brand/id/{id}")
    public int deleteByBrandId(@PathVariable Long id){
        return service.deleteByBrandId(id);
    }
    @ApiOperation("Finds foods by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<FoodDto>> findByCriteria(@RequestBody FoodCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated foods by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FoodCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports foods by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody FoodCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets food data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody FoodCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets food history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets food paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FoodHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports food history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FoodHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets food history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FoodHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public FoodRestAdmin (FoodAdminService service, FoodConverter converter) {
        super(service, converter);
    }


}