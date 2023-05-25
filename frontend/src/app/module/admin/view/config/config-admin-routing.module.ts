
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { GenderListAdminComponent } from './gender-admin/list-admin/gender-list-admin.component';
import { DepartmentListAdminComponent } from './department-admin/list-admin/department-list-admin.component';
import { AgeCategoryListAdminComponent } from './age-category-admin/list-admin/age-category-list-admin.component';
import { LocationTypeListAdminComponent } from './location-type-admin/list-admin/location-type-list-admin.component';
import { MarketCategoryListAdminComponent } from './market-category-admin/list-admin/market-category-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'gender',
                            children: [
                                {
                                    path: 'list',
                                    component: GenderListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'department',
                            children: [
                                {
                                    path: 'list',
                                    component: DepartmentListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'age-category',
                            children: [
                                {
                                    path: 'list',
                                    component: AgeCategoryListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'location-type',
                            children: [
                                {
                                    path: 'list',
                                    component: LocationTypeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'market-category',
                            children: [
                                {
                                    path: 'list',
                                    component: MarketCategoryListAdminComponent ,
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
export class ConfigAdminRoutingModule { }
