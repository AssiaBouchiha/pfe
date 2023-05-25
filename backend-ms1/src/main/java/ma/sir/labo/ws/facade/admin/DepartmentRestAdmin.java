package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.Department;
import ma.sir.labo.bean.history.DepartmentHistory;
import ma.sir.labo.dao.criteria.core.DepartmentCriteria;
import ma.sir.labo.dao.criteria.history.DepartmentHistoryCriteria;
import ma.sir.labo.service.facade.admin.DepartmentAdminService;
import ma.sir.labo.ws.converter.DepartmentConverter;
import ma.sir.labo.ws.dto.DepartmentDto;
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

@Api("Manages department services")
@RestController
@RequestMapping("/api/admin/department/")
public class DepartmentRestAdmin  extends AbstractController<Department, DepartmentDto, DepartmentHistory, DepartmentCriteria, DepartmentHistoryCriteria, DepartmentAdminService, DepartmentConverter> {


    @ApiOperation("upload one department")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple departments")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all departments")
    @GetMapping("")
    public ResponseEntity<List<DepartmentDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all departments")
    @GetMapping("optimized")
    public ResponseEntity<List<DepartmentDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a department by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DepartmentDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  department")
    @PostMapping("")
    public ResponseEntity<DepartmentDto> save(@RequestBody DepartmentDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  department")
    @PutMapping("")
    public ResponseEntity<DepartmentDto> update(@RequestBody DepartmentDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of department")
    @PostMapping("multiple")
    public ResponseEntity<List<DepartmentDto>> delete(@RequestBody List<DepartmentDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified department")
    @DeleteMapping("")
    public ResponseEntity<DepartmentDto> delete(@RequestBody DepartmentDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified department")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple departments by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("Finds departments by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DepartmentDto>> findByCriteria(@RequestBody DepartmentCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated departments by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DepartmentCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports departments by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DepartmentCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets department data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DepartmentCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets department history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets department paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DepartmentHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports department history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DepartmentHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets department history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DepartmentHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DepartmentRestAdmin (DepartmentAdminService service, DepartmentConverter converter) {
        super(service, converter);
    }


}