import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {SerotypeDto} from '../model/Serotype.model';
import {SerotypeCriteria} from '../criteria/SerotypeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class SerotypeService extends AbstractService<SerotypeDto, SerotypeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/serotype/');
    }

    public constrcutDto(): SerotypeDto {
        return new SerotypeDto();
    }

    public constrcutCriteria(): SerotypeCriteria {
        return new SerotypeCriteria();
    }
}
