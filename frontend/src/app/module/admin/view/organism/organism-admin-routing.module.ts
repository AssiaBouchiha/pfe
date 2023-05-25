
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { SeroTypeListAdminComponent } from './sero-type-admin/list-admin/sero-type-list-admin.component';
import { OrganismListAdminComponent } from './organism-admin/list-admin/organism-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'sero-type',
                            children: [
                                {
                                    path: 'list',
                                    component: SeroTypeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'organism',
                            children: [
                                {
                                    path: 'list',
                                    component: OrganismListAdminComponent ,
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
export class OrganismAdminRoutingModule { }
