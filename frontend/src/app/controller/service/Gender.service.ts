import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {GenderDto} from '../model/Gender.model';
import {GenderCriteria} from '../criteria/GenderCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class GenderService extends AbstractService<GenderDto, GenderCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/gender/');
    }

    public constrcutDto(): GenderDto {
        return new GenderDto();
    }

    public constrcutCriteria(): GenderCriteria {
        return new GenderCriteria();
    }
}
