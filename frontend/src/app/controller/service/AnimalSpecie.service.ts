import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {AnimalSpecieDto} from '../model/AnimalSpecie.model';
import {AnimalSpecieCriteria} from '../criteria/AnimalSpecieCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';


@Injectable({
  providedIn: 'root'
})
export class AnimalSpecieService extends AbstractService<AnimalSpecieDto, AnimalSpecieCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/animalSpecie/');
    }

    public constrcutDto(): AnimalSpecieDto {
        return new AnimalSpecieDto();
    }

    public constrcutCriteria(): AnimalSpecieCriteria {
        return new AnimalSpecieCriteria();
    }
}
