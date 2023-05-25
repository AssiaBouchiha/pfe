import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {OrganismService} from 'src/app/controller/service/Organism.service';
import {OrganismDto} from 'src/app/controller/model/Organism.model';
import {OrganismCriteria} from 'src/app/controller/criteria/OrganismCriteria.model';

@Component({
  selector: 'app-organism-view-admin',
  templateUrl: './organism-view-admin.component.html'
})
export class OrganismViewAdminComponent extends AbstractViewController<OrganismDto, OrganismCriteria, OrganismService> implements OnInit {


    constructor(private organismService: OrganismService){
        super(organismService);
    }

    ngOnInit(): void {
    }




}
