package  ma.sir.obs.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.obs.bean.core.MarketCategory;
import ma.sir.obs.bean.history.MarketCategoryHistory;
import ma.sir.obs.dao.criteria.core.MarketCategoryCriteria;
import ma.sir.obs.dao.criteria.history.MarketCategoryHistoryCriteria;
import ma.sir.obs.service.facade.admin.MarketCategoryAdminService;
import ma.sir.obs.ws.converter.MarketCategoryConverter;
import ma.sir.obs.ws.dto.MarketCategoryDto;
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

@Api("Manages marketCategory services")
@RestController
@RequestMapping("/api/admin/marketCategory/")
public class MarketCategoryRestAdmin  extends AbstractController<MarketCategory, MarketCategoryDto, MarketCategoryHistory, MarketCategoryCriteria, MarketCategoryHistoryCriteria, MarketCategoryAdminService, MarketCategoryConverter> {



    @ApiOperation("upload one marketCategory")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple marketCategorys")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all marketCategorys")
    @GetMapping("")
    public ResponseEntity<List<MarketCategoryDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all marketCategorys")
    @GetMapping("optimized")
    public ResponseEntity<List<MarketCategoryDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a marketCategory by id")
    @GetMapping("id/{id}")
    public ResponseEntity<MarketCategoryDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  marketCategory")
    @PostMapping("")
    public ResponseEntity<MarketCategoryDto> save(@RequestBody MarketCategoryDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  marketCategory")
    @PutMapping("")
    public ResponseEntity<MarketCategoryDto> update(@RequestBody MarketCategoryDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of marketCategory")
    @PostMapping("multiple")
    public ResponseEntity<List<MarketCategoryDto>> delete(@RequestBody List<MarketCategoryDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified marketCategory")
    @DeleteMapping("")
    public ResponseEntity<MarketCategoryDto> delete(@RequestBody MarketCategoryDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified marketCategory")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple marketCategorys by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds marketCategorys by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<MarketCategoryDto>> findByCriteria(@RequestBody MarketCategoryCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated marketCategorys by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody MarketCategoryCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports marketCategorys by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody MarketCategoryCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets marketCategory data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody MarketCategoryCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets marketCategory history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets marketCategory paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody MarketCategoryHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports marketCategory history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody MarketCategoryHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets marketCategory history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody MarketCategoryHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public MarketCategoryRestAdmin (MarketCategoryAdminService service, MarketCategoryConverter converter) {
        super(service, converter);
    }


}