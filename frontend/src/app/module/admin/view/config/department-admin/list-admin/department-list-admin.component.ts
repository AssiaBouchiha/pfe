import {Component, OnInit} from '@angular/core';
import {DepartmentService} from 'src/app/controller/service/Department.service';
import {DepartmentDto} from 'src/app/controller/model/Department.model';
import {DepartmentCriteria} from 'src/app/controller/criteria/DepartmentCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-department-list-admin',
  templateUrl: './department-list-admin.component.html'
})
export class DepartmentListAdminComponent extends AbstractListController<DepartmentDto, DepartmentCriteria, DepartmentService>  implements OnInit {

    fileName = 'Department';

  
    constructor(departmentService: DepartmentService) {
        super(departmentService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadDepartments(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Department', 'list');
        isPermistted ? this.service.findAll().subscribe(departments => this.items = departments,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: DepartmentDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Code': e.code ,
                 'Libelle': e.libelle ,
            }
        });

        this.criteriaData = [{
            'Code': this.criteria.code ? this.criteria.code : environment.emptyForExport ,
            'Libelle': this.criteria.libelle ? this.criteria.libelle : environment.emptyForExport ,
        }];
      }
}
