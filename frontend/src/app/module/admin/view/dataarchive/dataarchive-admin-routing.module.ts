
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { ReportListAdminComponent } from './report-admin/list-admin/report-list-admin.component';
import { DataArchiveListAdminComponent } from './data-archive-admin/list-admin/data-archive-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'report',
                            children: [
                                {
                                    path: 'list',
                                    component: ReportListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'data-archive',
                            children: [
                                {
                                    path: 'list',
                                    component: DataArchiveListAdminComponent ,
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
export class DataarchiveAdminRoutingModule { }
