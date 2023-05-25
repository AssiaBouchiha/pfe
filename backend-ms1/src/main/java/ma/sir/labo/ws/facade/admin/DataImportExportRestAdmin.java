package  ma.sir.labo.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.sir.labo.bean.core.DataImportExport;
import ma.sir.labo.bean.history.DataImportExportHistory;
import ma.sir.labo.dao.criteria.core.DataImportExportCriteria;
import ma.sir.labo.dao.criteria.history.DataImportExportHistoryCriteria;
import ma.sir.labo.service.facade.admin.DataImportExportAdminService;
import ma.sir.labo.ws.converter.DataImportExportConverter;
import ma.sir.labo.ws.dto.DataImportExportDto;
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

@Api("Manages dataImportExport services")
@RestController
@RequestMapping("/api/admin/dataImportExport/")
public class DataImportExportRestAdmin  extends AbstractController<DataImportExport, DataImportExportDto, DataImportExportHistory, DataImportExportCriteria, DataImportExportHistoryCriteria, DataImportExportAdminService, DataImportExportConverter> {


    @ApiOperation("upload one dataImportExport")
    @RequestMapping(value = "upload", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<FileTempDto> uploadFileAndGetChecksum(@RequestBody MultipartFile file) throws Exception {
        return super.uploadFileAndGetChecksum(file);
    }
    @ApiOperation("upload multiple dataImportExports")
    @RequestMapping(value = "upload-multiple", method = RequestMethod.POST, consumes = "multipart/form-data")
    public ResponseEntity<List<FileTempDto>> uploadMultipleFileAndGetChecksum(@RequestBody MultipartFile[] files) throws Exception {
        return super.uploadMultipleFileAndGetChecksum(files);
    }

    @ApiOperation("Finds a list of all dataImportExports")
    @GetMapping("")
    public ResponseEntity<List<DataImportExportDto>> findAll() throws Exception {
        return super.findAll();
    }

    @ApiOperation("Finds an optimized list of all dataImportExports")
    @GetMapping("optimized")
    public ResponseEntity<List<DataImportExportDto>> findAllOptimized() throws Exception {
        return super.findAllOptimized();
    }

    @ApiOperation("Finds a dataImportExport by id")
    @GetMapping("id/{id}")
    public ResponseEntity<DataImportExportDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }
    @ApiOperation("Saves the specified  dataImportExport")
    @PostMapping("")
    public ResponseEntity<DataImportExportDto> save(@RequestBody DataImportExportDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Updates the specified  dataImportExport")
    @PutMapping("")
    public ResponseEntity<DataImportExportDto> update(@RequestBody DataImportExportDto dto) throws Exception {
        return super.update(dto);
    }

    @ApiOperation("Delete list of dataImportExport")
    @PostMapping("multiple")
    public ResponseEntity<List<DataImportExportDto>> delete(@RequestBody List<DataImportExportDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }
    @ApiOperation("Delete the specified dataImportExport")
    @DeleteMapping("")
    public ResponseEntity<DataImportExportDto> delete(@RequestBody DataImportExportDto dto) throws Exception {
            return super.delete(dto);
    }

    @ApiOperation("Delete the specified dataImportExport")
    @DeleteMapping("id/{id}")
    public ResponseEntity<Long> deleteById(@PathVariable Long id) throws Exception {
        return super.deleteById(id);
    }
    @ApiOperation("Delete multiple dataImportExports by ids")
    @DeleteMapping("multiple/id")
    public ResponseEntity<List<Long>> deleteByIdIn(@RequestBody List<Long> ids) throws Exception {
            return super.deleteByIdIn(ids);
     }


    @ApiOperation("find by locationData id")
    @GetMapping("locationData/id/{id}")
    public List<DataImportExport> findByLocationDataId(@PathVariable Long id){
        return service.findByLocationDataId(id);
    }
    @ApiOperation("delete by locationData id")
    @DeleteMapping("locationData/id/{id}")
    public int deleteByLocationDataId(@PathVariable Long id){
        return service.deleteByLocationDataId(id);
    }
    @ApiOperation("find by specimen id")
    @GetMapping("specimen/id/{id}")
    public List<DataImportExport> findBySpecimenId(@PathVariable Long id){
        return service.findBySpecimenId(id);
    }
    @ApiOperation("delete by specimen id")
    @DeleteMapping("specimen/id/{id}")
    public int deleteBySpecimenId(@PathVariable Long id){
        return service.deleteBySpecimenId(id);
    }
    @ApiOperation("find by microbiology id")
    @GetMapping("microbiology/id/{id}")
    public List<DataImportExport> findByMicrobiologyId(@PathVariable Long id){
        return service.findByMicrobiologyId(id);
    }
    @ApiOperation("delete by microbiology id")
    @DeleteMapping("microbiology/id/{id}")
    public int deleteByMicrobiologyId(@PathVariable Long id){
        return service.deleteByMicrobiologyId(id);
    }
    @ApiOperation("Finds dataImportExports by criteria")
    @PostMapping("find-by-criteria")
    public ResponseEntity<List<DataImportExportDto>> findByCriteria(@RequestBody DataImportExportCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @ApiOperation("Finds paginated dataImportExports by criteria")
    @PostMapping("find-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DataImportExportCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataImportExports by criteria")
    @PostMapping("export")
    public ResponseEntity<InputStreamResource> export(@RequestBody DataImportExportCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @ApiOperation("Gets dataImportExport data size by criteria")
    @PostMapping("data-size-by-criteria")
    public ResponseEntity<Integer> getDataSize(@RequestBody DataImportExportCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @ApiOperation("Gets dataImportExport history by id")
    @GetMapping("history/id/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }

    @ApiOperation("Gets dataImportExport paginated history by criteria")
    @PostMapping("history-paginated-by-criteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DataImportExportHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }

    @ApiOperation("Exports dataImportExport history by criteria")
    @PostMapping("export-history")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DataImportExportHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }

    @ApiOperation("Gets dataImportExport history data size by criteria")
    @PostMapping("history-data-size")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DataImportExportHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }
    public DataImportExportRestAdmin (DataImportExportAdminService service, DataImportExportConverter converter) {
        super(service, converter);
    }


}