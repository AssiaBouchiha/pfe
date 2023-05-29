import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LocationDataDto} from '../model/LocationData.model';
import {LocationDataCriteria} from '../criteria/LocationDataCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DepartmentDto} from '../model/Department.model';
import {InstitutionDto} from '../model/Institution.model';
import {LocationTypeDto} from '../model/LocationType.model';

@Injectable({
  providedIn: 'root'
})
export class LocationDataService extends AbstractService<LocationDataDto, LocationDataCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/locationData/');
    }

    public constrcutDto(): LocationDataDto {
        return new LocationDataDto();
    }

    public constrcutCriteria(): LocationDataCriteria {
        return new LocationDataCriteria();
    }
}
