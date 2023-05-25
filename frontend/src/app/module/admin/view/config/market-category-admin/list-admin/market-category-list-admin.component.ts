import {Component, OnInit} from '@angular/core';
import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryCriteria} from 'src/app/controller/criteria/MarketCategoryCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-market-category-list-admin',
  templateUrl: './market-category-list-admin.component.html'
})
export class MarketCategoryListAdminComponent extends AbstractListController<MarketCategoryDto, MarketCategoryCriteria, MarketCategoryService>  implements OnInit {

    fileName = 'MarketCategory';

  
    constructor(marketCategoryService: MarketCategoryService) {
        super(marketCategoryService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadMarketCategorys(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('MarketCategory', 'list');
        isPermistted ? this.service.findAll().subscribe(marketCategorys => this.items = marketCategorys,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'code', header: 'Code'},
            {field: 'libelle', header: 'Libelle'},
        ];
    }



	public initDuplicate(res: MarketCategoryDto) {
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
