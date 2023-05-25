import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LocationTypeDto} from '../model/LocationType.model';
import {LocationTypeCriteria} from '../criteria/LocationTypeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class LocationTypeService extends AbstractService<LocationTypeDto, LocationTypeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/locationType/');
    }

    public constrcutDto(): LocationTypeDto {
        return new LocationTypeDto();
    }

    public constrcutCriteria(): LocationTypeCriteria {
        return new LocationTypeCriteria();
    }
}
