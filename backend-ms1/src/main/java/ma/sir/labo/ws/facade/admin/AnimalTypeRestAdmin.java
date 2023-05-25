package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.AnimalType;
import ma.sir.labo.bean.history.AnimalTypeHistory;
import ma.sir.labo.dao.criteria.core.AnimalTypeCriteria;
import ma.sir.labo.dao.criteria.history.AnimalTypeHistoryCriteria;
import ma.sir.labo.service.facade.admin.AnimalTypeAdminService;
import ma.sir.labo.ws.converter.AnimalTypeConverter;
import ma.sir.labo.ws.dto.AnimalTypeDto;
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

@Api("Manages animalType services")
@RestController
@RequestMapping("/api/admin/animalType/")
public class AnimalTypeRestAdmin  extends AbstractController<AnimalType, AnimalTypeDto, AnimalTypeHistory, AnimalTypeCriteria, AnimalTypeHistoryCriteria, AnimalTypeAdminService, AnimalTypeConverter> {


    @ApiOperation("upload one animalType")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple animalTypes")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all animalTypes")
    @GetMapping("")
    public ResponseEntity<List<AnimalTypeDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all animalTypes")
    @GetMapping("optimized")
    public ResponseEntity<List<AnimalTypeDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a animalType by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AnimalTypeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  animalType")
    @PostMapping("")
    public ResponseEntity<AnimalTypeDto> save(@RequestBody AnimalTypeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  animalType")
    @PutMapping("")
    public ResponseEntity<AnimalTypeDto> update(@RequestBody AnimalTypeDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of animalType")
    @PostMapping("multiple")
    public ResponseEntity<List<AnimalTypeDto>> delete(@RequestBody List<AnimalTypeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified animalType")
    @DeleteMapping("")
    public ResponseEntity<AnimalTypeDto> delete(@RequestBody AnimalTypeDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified animalType")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple animalTypes by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds animalTypes by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AnimalTypeDto>> findByCriteria(@RequestBody AnimalTypeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated animalTypes by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AnimalTypeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports animalTypes by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AnimalTypeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets animalType data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AnimalTypeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets animalType history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets animalType paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AnimalTypeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports animalType history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AnimalTypeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets animalType history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AnimalTypeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AnimalTypeRestAdmin (AnimalTypeAdminService service, AnimalTypeConverter converter) {
        super(service, converter);
    }


}