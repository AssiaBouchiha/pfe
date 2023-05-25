import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {SpecimenDto} from '../model/Specimen.model';
import {SpecimenCriteria} from '../criteria/SpecimenCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DataImportExportDto} from '../model/DataImportExport.model';
import {ReasonDto} from '../model/Reason.model';

@Injectable({
  providedIn: 'root'
})
export class SpecimenService extends AbstractService<SpecimenDto, SpecimenCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/specimen/');
    }

    public constrcutDto(): SpecimenDto {
        return new SpecimenDto();
    }

    public constrcutCriteria(): SpecimenCriteria {
        return new SpecimenCriteria();
    }
}
