import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {PlantDto} from '../model/Plant.model';
import {PlantCriteria} from '../criteria/PlantCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DataImportExportDto} from '../model/DataImportExport.model';
import {AgeCategoryDto} from '../model/AgeCategory.model';
import {GenderDto} from '../model/Gender.model';

@Injectable({
  providedIn: 'root'
})
export class PlantService extends AbstractService<PlantDto, PlantCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/plant/');
    }

    public constrcutDto(): PlantDto {
        return new PlantDto();
    }

    public constrcutCriteria(): PlantCriteria {
        return new PlantCriteria();
    }
}
