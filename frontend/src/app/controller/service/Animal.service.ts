import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {AnimalDto} from '../model/Animal.model';
import {AnimalCriteria} from '../criteria/AnimalCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DataImportExportDto} from '../model/DataImportExport.model';
import {AnimalSpecieDto} from '../model/AnimalSpecie.model';
import {AnimalTypeDto} from '../model/AnimalType.model';
import {AgeCategoryDto} from '../model/AgeCategory.model';
import {GenderDto} from '../model/Gender.model';
import {MarketCategoryDto} from '../model/MarketCategory.model';

@Injectable({
  providedIn: 'root'
})
export class AnimalService extends AbstractService<AnimalDto, AnimalCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/animal/');
    }

    public constrcutDto(): AnimalDto {
        return new AnimalDto();
    }

    public constrcutCriteria(): AnimalCriteria {
        return new AnimalCriteria();
    }
}
