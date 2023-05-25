import {Component, OnInit} from '@angular/core';
import {LocationService} from 'src/app/controller/service/Location.service';
import {LocationDto} from 'src/app/controller/model/Location.model';
import {LocationCriteria} from 'src/app/controller/criteria/LocationCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { InstitutionService } from 'src/app/controller/service/Institution.service';
import { DepartmentService } from 'src/app/controller/service/Department.service';
import { LocationTypeService } from 'src/app/controller/service/LocationType.service';
import { LaboratoryService } from 'src/app/controller/service/Laboratory.service';

import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {LaboratoryDto} from 'src/app/controller/model/Laboratory.model';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';


@Component({
  selector: 'app-location-list-admin',
  templateUrl: './location-list-admin.component.html'
})
export class LocationListAdminComponent extends AbstractListController<LocationDto, LocationCriteria, LocationService>  implements OnInit {

    fileName = 'Location';

    institutions :Array<InstitutionDto>;
    departments :Array<DepartmentDto>;
    locationTypes :Array<LocationTypeDto>;
    laboratorys :Array<LaboratoryDto>;
  
    constructor(locationService: LocationService, private institutionService: InstitutionService, private departmentService: DepartmentService, private locationTypeService: LocationTypeService, private laboratoryService: LaboratoryService) {
        super(locationService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadInstitution();
      this.loadDepartment();
      this.loadLocationType();
      this.loadLaboratory();
    }

    public async loadLocations(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Location', 'list');
        isPermistted ? this.service.findAll().subscribe(locations => this.items = locations,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'institution?.libelle', header: 'Institution'},
            {field: 'department?.libelle', header: 'Department'},
            {field: 'locationType?.libelle', header: 'Location type'},
            {field: 'laboratory?.code', header: 'Laboratory'},
        ];
    }


    public async loadInstitution(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Location', 'list');
        isPermistted ? this.institutionService.findAllOptimized().subscribe(institutions => this.institutions = institutions,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadDepartment(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Location', 'list');
        isPermistted ? this.departmentService.findAllOptimized().subscribe(departments => this.departments = departments,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadLocationType(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Location', 'list');
        isPermistted ? this.locationTypeService.findAllOptimized().subscribe(locationTypes => this.locationTypes = locationTypes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }
    public async loadLaboratory(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Location', 'list');
        isPermistted ? this.laboratoryService.findAllOptimized().subscribe(laboratorys => this.laboratorys = laboratorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: LocationDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Description': e.description ,
                'Institution': e.institution?.libelle ,
                'Department': e.department?.libelle ,
                'Location type': e.locationType?.libelle ,
                'Laboratory': e.laboratory?.code ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Description': this.criteria.description ? this.criteria.description : environment.emptyForExport ,
        //'Institution': this.criteria.institution?.libelle ? this.criteria.institution?.libelle : environment.emptyForExport ,
        //'Department': this.criteria.department?.libelle ? this.criteria.department?.libelle : environment.emptyForExport ,
        //'Location type': this.criteria.locationType?.libelle ? this.criteria.locationType?.libelle : environment.emptyForExport ,
        //'Laboratory': this.criteria.laboratory?.code ? this.criteria.laboratory?.code : environment.emptyForExport ,
        }];
      }
}
