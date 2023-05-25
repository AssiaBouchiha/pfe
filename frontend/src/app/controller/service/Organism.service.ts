import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {OrganismDto} from '../model/Organism.model';
import {OrganismCriteria} from '../criteria/OrganismCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class OrganismService extends AbstractService<OrganismDto, OrganismCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/organism/');
    }

    public constrcutDto(): OrganismDto {
        return new OrganismDto();
    }

    public constrcutCriteria(): OrganismCriteria {
        return new OrganismCriteria();
    }
}
