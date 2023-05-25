import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LaboratoryAntibioticDto} from '../model/LaboratoryAntibiotic.model';
import {LaboratoryAntibioticCriteria} from '../criteria/LaboratoryAntibioticCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {LaboratoryDto} from '../model/Laboratory.model';
import {AntibioticDto} from '../model/Antibiotic.model';

@Injectable({
  providedIn: 'root'
})
export class LaboratoryAntibioticService extends AbstractService<LaboratoryAntibioticDto, LaboratoryAntibioticCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/laboratoryAntibiotic/');
    }

    public constrcutDto(): LaboratoryAntibioticDto {
        return new LaboratoryAntibioticDto();
    }

    public constrcutCriteria(): LaboratoryAntibioticCriteria {
        return new LaboratoryAntibioticCriteria();
    }
}
