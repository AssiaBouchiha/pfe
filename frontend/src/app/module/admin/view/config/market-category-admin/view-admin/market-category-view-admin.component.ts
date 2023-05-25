import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {MarketCategoryService} from 'src/app/controller/service/MarketCategory.service';
import {MarketCategoryDto} from 'src/app/controller/model/MarketCategory.model';
import {MarketCategoryCriteria} from 'src/app/controller/criteria/MarketCategoryCriteria.model';

@Component({
  selector: 'app-market-category-view-admin',
  templateUrl: './market-category-view-admin.component.html'
})
export class MarketCategoryViewAdminComponent extends AbstractViewController<MarketCategoryDto, MarketCategoryCriteria, MarketCategoryService> implements OnInit {


    constructor(private marketCategoryService: MarketCategoryService){
        super(marketCategoryService);
    }

    ngOnInit(): void {
    }




}
