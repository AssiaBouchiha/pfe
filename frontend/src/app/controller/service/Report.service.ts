import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {ReportDto} from '../model/Report.model';
import {ReportCriteria} from '../criteria/ReportCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {LaboratoryDto} from '../model/Laboratory.model';

@Injectable({
  providedIn: 'root'
})
export class ReportService extends AbstractService<ReportDto, ReportCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/report/');
    }

    public constrcutDto(): ReportDto {
        return new ReportDto();
    }

    public constrcutCriteria(): ReportCriteria {
        return new ReportCriteria();
    }
}
