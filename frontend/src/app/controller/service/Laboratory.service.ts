import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {LaboratoryDto} from '../model/Laboratory.model';
import {LaboratoryCriteria} from '../criteria/LaboratoryCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {DataAnalysisDto} from '../model/DataAnalysis.model';
import {ReportDto} from '../model/Report.model';
import {LaboratoryAntibioticDto} from '../model/LaboratoryAntibiotic.model';
import {AlertDto} from '../model/Alert.model';
import {LocationDto} from '../model/Location.model';
import {DataArchiveDto} from '../model/DataArchive.model';
import {NotificationDto} from '../model/Notification.model';

@Injectable({
  providedIn: 'root'
})
export class LaboratoryService extends AbstractService<LaboratoryDto, LaboratoryCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/laboratory/');
    }

    public constrcutDto(): LaboratoryDto {
        return new LaboratoryDto();
    }

    public constrcutCriteria(): LaboratoryCriteria {
        return new LaboratoryCriteria();
    }
}
