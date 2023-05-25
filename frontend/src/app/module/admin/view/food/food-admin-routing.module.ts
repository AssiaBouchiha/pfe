
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { FoodListAdminComponent } from './food-admin/list-admin/food-list-admin.component';
import { BrandListAdminComponent } from './brand-admin/list-admin/brand-list-admin.component';
import { InstitutionListAdminComponent } from './institution-admin/list-admin/institution-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'food',
                            children: [
                                {
                                    path: 'list',
                                    component: FoodListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'brand',
                            children: [
                                {
                                    path: 'list',
                                    component: BrandListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'institution',
                            children: [
                                {
                                    path: 'list',
                                    component: InstitutionListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class FoodAdminRoutingModule { }
