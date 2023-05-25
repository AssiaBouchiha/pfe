
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';



import { AnimalListAdminComponent } from './animal-admin/list-admin/animal-list-admin.component';
import { AnimalTypeListAdminComponent } from './animal-type-admin/list-admin/animal-type-list-admin.component';
import { AnimalSpecieListAdminComponent } from './animal-specie-admin/list-admin/animal-specie-list-admin.component';
@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [


                        {

                            path: 'animal',
                            children: [
                                {
                                    path: 'list',
                                    component: AnimalListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'animal-type',
                            children: [
                                {
                                    path: 'list',
                                    component: AnimalTypeListAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                            ]
                        },

                        {

                            path: 'animal-specie',
                            children: [
                                {
                                    path: 'list',
                                    component: AnimalSpecieListAdminComponent ,
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
export class AnimalAdminRoutingModule { }
