import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {AnimalTypeDto} from '../model/AnimalType.model';
import {AnimalTypeCriteria} from '../criteria/AnimalTypeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class AnimalTypeService extends AbstractService<AnimalTypeDto, AnimalTypeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/animalType/');
    }

    public constrcutDto(): AnimalTypeDto {
        return new AnimalTypeDto();
    }

    public constrcutCriteria(): AnimalTypeCriteria {
        return new AnimalTypeCriteria();
    }
}
