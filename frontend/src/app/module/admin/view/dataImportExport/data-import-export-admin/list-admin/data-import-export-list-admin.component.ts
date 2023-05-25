import {Component, OnInit} from '@angular/core';
import {DataImportExportService} from 'src/app/controller/service/DataImportExport.service';
import {DataImportExportDto} from 'src/app/controller/model/DataImportExport.model';
import {DataImportExportCriteria} from 'src/app/controller/criteria/DataImportExportCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { LocationDataService } from 'src/app/controller/service/LocationData.service';
import { SpecimenService } from 'src/app/controller/service/Specimen.service';
import { MicrobiologyService } from 'src/app/controller/service/Microbiology.service';

import {LocationDataDto} from 'src/app/controller/model/LocationData.model';
import {MicrobiologyDto} from 'src/app/controller/model/Microbiology.model';
import {SpecimenDto} from 'src/app/controller/model/Specimen.model';


@Component({
  selector: 'app-data-import-export-list-admin',
  templateUrl: './data-import-export-list-admin.component.html'
})
export class DataImportExportListAdminComponent extends AbstractListController<DataImportExportDto, DataImportExportCriteria, DataImportExportService>  implements OnInit {

    fileName = 'DataImportExport';

    locationDatas :Array<LocationDataDto>;
    specimens :Array<SpecimenDto>;
    microbiologys :Array<MicrobiologyDto>;
  
    constructor(dataImportExportService: DataImportExportService, private locationDataService: LocationDataService, private specimenService: SpecimenService, private microbiologyService: MicrobiologyService) {
        super(dataImportExportService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadLocationData();
      this.loadSpecimen();
      this.loadMicrobiology();
    }

    public async loadDataImportExports(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataImportExport', 'list');
        isPermistted ? this.service.findAll().subscribe(dataImportExports => this.items = dataImportExports,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'locationData?.code', header: 'Location data'},
            {field: 'specimen?.code', header: 'Specimen'},
            {field: 'microbiology?.code', header: 'Microbiology'},
        ];
    }


    public async loadLocationData(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataImportExport', 'list');
        isPermistted ? this.locationDataService.findAllOptimized().subscribe(locationDatas => this.locationDatas = locationDatas,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadSpecimen(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataImportExport', 'list');
        isPermistted ? this.specimenService.findAllOptimized().subscribe(specimens => this.specimens = specimens,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadMicrobiology(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('DataImportExport', 'list');
        isPermistted ? this.microbiologyService.findAllOptimized().subscribe(microbiologys => this.microbiologys = microbiologys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: DataImportExportDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                'Location data': e.locationData?.code ,
                'Specimen': e.specimen?.code ,
                'Microbiology': e.microbiology?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
        //'Location data': this.criteria.locationData?.code ? this.criteria.locationData?.code : environment.emptyForExport ,
        //'Specimen': this.criteria.specimen?.code ? this.criteria.specimen?.code : environment.emptyForExport ,
        //'Microbiology': this.criteria.microbiology?.code ? this.criteria.microbiology?.code : environment.emptyForExport ,
        }];
      }
}
