import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {SerotypeService} from 'src/app/controller/service/Serotype.service';
import {SerotypeDto} from 'src/app/controller/model/Serotype.model';
import {SerotypeCriteria} from 'src/app/controller/criteria/SerotypeCriteria.model';

@Component({
  selector: 'app-serotype-view-admin',
  templateUrl: './serotype-view-admin.component.html'
})
export class SerotypeViewAdminComponent extends AbstractViewController<SerotypeDto, SerotypeCriteria, SerotypeService> implements OnInit {


    constructor(private serotypeService: SerotypeService){
        super(serotypeService);
    }

    ngOnInit(): void {
    }




}
