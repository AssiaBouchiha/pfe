import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {DataImportExportDto} from '../model/DataImportExport.model';
import {DataImportExportCriteria} from '../criteria/DataImportExportCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {LocationDataDto} from '../model/LocationData.model';
import {MicrobiologyDto} from '../model/Microbiology.model';
import {SpecimenDto} from '../model/Specimen.model';

@Injectable({
  providedIn: 'root'
})
export class DataImportExportService extends AbstractService<DataImportExportDto, DataImportExportCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/dataImportExport/');
    }

    public constrcutDto(): DataImportExportDto {
        return new DataImportExportDto();
    }

    public constrcutCriteria(): DataImportExportCriteria {
        return new DataImportExportCriteria();
    }
}
