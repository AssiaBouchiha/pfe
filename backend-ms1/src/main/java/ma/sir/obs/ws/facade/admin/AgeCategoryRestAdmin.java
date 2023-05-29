package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.AgeCategory;
import ma.sir.obs.bean.history.AgeCategoryHistory;
import ma.sir.obs.dao.criteria.core.AgeCategoryCriteria;
import ma.sir.obs.dao.criteria.history.AgeCategoryHistoryCriteria;
import ma.sir.obs.service.facade.admin.AgeCategoryAdminService;
import ma.sir.obs.ws.converter.AgeCategoryConverter;
import ma.sir.obs.ws.dto.AgeCategoryDto;
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

@Api("Manages ageCategory services")
@RestController
@RequestMapping("/api/admin/ageCategory/")
public class AgeCategoryRestAdmin  extends AbstractController<AgeCategory, AgeCategoryDto, AgeCategoryHistory, AgeCategoryCriteria, AgeCategoryHistoryCriteria, AgeCategoryAdminService, AgeCategoryConverter> {



    @ApiOperation("upload one ageCategory")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple ageCategorys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all ageCategorys")
    @GetMapping("")
    public ResponseEntity<List<AgeCategoryDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all ageCategorys")
    @GetMapping("optimized")
    public ResponseEntity<List<AgeCategoryDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a ageCategory by id")
    @GetMapping("id/{id}")
    public ResponseEntity<AgeCategoryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  ageCategory")
    @PostMapping("")
    public ResponseEntity<AgeCategoryDto> save(@RequestBody AgeCategoryDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  ageCategory")
    @PutMapping("")
    public ResponseEntity<AgeCategoryDto> update(@RequestBody AgeCategoryDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of ageCategory")
    @PostMapping("multiple")
    public ResponseEntity<List<AgeCategoryDto>> delete(@RequestBody List<AgeCategoryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified ageCategory")
    @DeleteMapping("")
    public ResponseEntity<AgeCategoryDto> delete(@RequestBody AgeCategoryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified ageCategory")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple ageCategorys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds ageCategorys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<AgeCategoryDto>> findByCriteria(@RequestBody AgeCategoryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated ageCategorys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody AgeCategoryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports ageCategorys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody AgeCategoryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets ageCategory data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody AgeCategoryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets ageCategory history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets ageCategory paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody AgeCategoryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports ageCategory history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody AgeCategoryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets ageCategory history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody AgeCategoryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public AgeCategoryRestAdmin (AgeCategoryAdminService service, AgeCategoryConverter converter) {
        super(service, converter);
    }


}