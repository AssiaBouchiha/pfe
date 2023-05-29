import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {LocationDataService} from 'src/app/controller/service/LocationData.service';
import {LocationDataDto} from 'src/app/controller/model/LocationData.model';
import {LocationDataCriteria} from 'src/app/controller/criteria/LocationDataCriteria.model';

import {InstitutionDto} from 'src/app/controller/model/Institution.model';
import {InstitutionService} from 'src/app/controller/service/Institution.service';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';
import {LocationTypeService} from 'src/app/controller/service/LocationType.service';
import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DepartmentService} from 'src/app/controller/service/Department.service';
@Component({
  selector: 'app-location-data-view-admin',
  templateUrl: './location-data-view-admin.component.html'
})
export class LocationDataViewAdminComponent extends AbstractViewController<LocationDataDto, LocationDataCriteria, LocationDataService> implements OnInit {


    constructor(private locationDataService: LocationDataService, private institutionService: InstitutionService, private locationTypeService: LocationTypeService, private departmentService: DepartmentService){
        super(locationDataService);
    }

    ngOnInit(): void {
        this.institution = new InstitutionDto();
        this.institutionService.findAll().subscribe((data) => this.institutions = data);
        this.department = new DepartmentDto();
        this.departmentService.findAll().subscribe((data) => this.departments = data);
        this.locationType = new LocationTypeDto();
        this.locationTypeService.findAll().subscribe((data) => this.locationTypes = data);
    }


    get locationType(): LocationTypeDto {
       return this.locationTypeService.item;
    }
    set locationType(value: LocationTypeDto) {
        this.locationTypeService.item = value;
    }
    get locationTypes():Array<LocationTypeDto> {
       return this.locationTypeService.items;
    }
    set locationTypes(value: Array<LocationTypeDto>) {
        this.locationTypeService.items = value;
    }
    get department(): DepartmentDto {
       return this.departmentService.item;
    }
    set department(value: DepartmentDto) {
        this.departmentService.item = value;
    }
    get departments():Array<DepartmentDto> {
       return this.departmentService.items;
    }
    set departments(value: Array<DepartmentDto>) {
        this.departmentService.items = value;
    }
    get institution(): InstitutionDto {
       return this.institutionService.item;
    }
    set institution(value: InstitutionDto) {
        this.institutionService.item = value;
    }
    get institutions():Array<InstitutionDto> {
       return this.institutionService.items;
    }
    set institutions(value: Array<InstitutionDto>) {
        this.institutionService.items = value;
    }


}
