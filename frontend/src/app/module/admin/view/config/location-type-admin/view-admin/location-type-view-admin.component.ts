import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {LocationTypeService} from 'src/app/controller/service/LocationType.service';
import {LocationTypeDto} from 'src/app/controller/model/LocationType.model';
import {LocationTypeCriteria} from 'src/app/controller/criteria/LocationTypeCriteria.model';

@Component({
  selector: 'app-location-type-view-admin',
  templateUrl: './location-type-view-admin.component.html'
})
export class LocationTypeViewAdminComponent extends AbstractViewController<LocationTypeDto, LocationTypeCriteria, LocationTypeService> implements OnInit {


    constructor(private locationTypeService: LocationTypeService){
        super(locationTypeService);
    }

    ngOnInit(): void {
    }




}
