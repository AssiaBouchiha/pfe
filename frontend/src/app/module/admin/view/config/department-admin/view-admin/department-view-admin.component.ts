import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {DepartmentService} from 'src/app/controller/service/Department.service';
import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DepartmentCriteria} from 'src/app/controller/criteria/DepartmentCriteria.model';

@Component({
  selector: 'app-department-view-admin',
  templateUrl: './department-view-admin.component.html'
})
export class DepartmentViewAdminComponent extends AbstractViewController<DepartmentDto, DepartmentCriteria, DepartmentService> implements OnInit {


    constructor(private departmentService: DepartmentService){
        super(departmentService);
    }

    ngOnInit(): void {
    }




}
