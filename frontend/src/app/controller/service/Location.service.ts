import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LocationDto} from '../model/Location.model';
import {LocationCriteria} from '../criteria/LocationCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DepartmentDto} from '../model/Department.model';
import {InstitutionDto} from '../model/Institution.model';
import {LaboratoryDto} from '../model/Laboratory.model';
import {LocationTypeDto} from '../model/LocationType.model';

@Injectable({
  providedIn: 'root'
})
export class LocationService extends AbstractService<LocationDto, LocationCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/location/');
    }

    public constrcutDto(): LocationDto {
        return new LocationDto();
    }

    public constrcutCriteria(): LocationCriteria {
        return new LocationCriteria();
    }
}
