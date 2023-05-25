
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { SpecimenListAdminComponent } from './specimen-admin/list-admin/specimen-list-admin.component';
import { ReasonListAdminComponent } from './reason-admin/list-admin/reason-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'specimen',
                            children: [
                                {
                                    path: 'list',
                                    component: SpecimenListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'reason',
                            children: [
                                {
                                    path: 'list',
                                    component: ReasonListAdminComponent ,
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
export class SpecimenAdminRoutingModule { }
