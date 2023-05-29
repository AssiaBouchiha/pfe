import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {MicrobiologyDto} from '../model/Microbiology.model';
import {MicrobiologyCriteria} from '../criteria/MicrobiologyCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {OrganismDto} from '../model/Organism.model';
import {SeroTypeDto} from '../model/SeroType.model';
import {AntibioticDto} from '../model/Antibiotic.model';

@Injectable({
  providedIn: 'root'
})
export class MicrobiologyService extends AbstractService<MicrobiologyDto, MicrobiologyCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/microbiology/');
    }

    public constrcutDto(): MicrobiologyDto {
        return new MicrobiologyDto();
    }

    public constrcutCriteria(): MicrobiologyCriteria {
        return new MicrobiologyCriteria();
    }
}
