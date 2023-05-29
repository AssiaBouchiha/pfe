import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {FoodDto} from '../model/Food.model';
import {FoodCriteria} from '../criteria/FoodCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {BrandDto} from '../model/Brand.model';
import {AnimalSpecieDto} from '../model/AnimalSpecie.model';
import {MarketCategoryDto} from '../model/MarketCategory.model';

@Injectable({
  providedIn: 'root'
})
export class FoodService extends AbstractService<FoodDto, FoodCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/food/');
    }

    public constrcutDto(): FoodDto {
        return new FoodDto();
    }

    public constrcutCriteria(): FoodCriteria {
        return new FoodCriteria();
    }
}
