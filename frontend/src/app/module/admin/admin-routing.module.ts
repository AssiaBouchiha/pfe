
// const root = environment.rootAppUrl;

import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { AuthGuard } from 'src/app/controller/guards/auth.guard';

import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';

@NgModule({
    imports: [
        RouterModule.forChild(
            [
                {
                    path: '',
                    children: [
                        {
                            path: 'login',
                            children: [
                                {
                                    path: '',
                                    component: LoginAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {
                            path: 'register',
                            children: [
                                {
                                    path: '',
                                    component: RegisterAdminComponent ,
                                    canActivate: [AuthGuard]
                                }
                              ]
                        },
                        {

                            path: 'locationData',
                            loadChildren: () => import('./view/locationData/locationData-admin-routing.module').then(x=>x.LocationDataAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'organism',
                            loadChildren: () => import('./view/organism/organism-admin-routing.module').then(x=>x.OrganismAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'microbiology',
                            loadChildren: () => import('./view/microbiology/microbiology-admin-routing.module').then(x=>x.MicrobiologyAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'food',
                            loadChildren: () => import('./view/food/food-admin-routing.module').then(x=>x.FoodAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'antibiotic',
                            loadChildren: () => import('./view/antibiotic/antibiotic-admin-routing.module').then(x=>x.AntibioticAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'notification',
                            loadChildren: () => import('./view/notification/notification-admin-routing.module').then(x=>x.NotificationAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'dataarchive',
                            loadChildren: () => import('./view/dataarchive/dataarchive-admin-routing.module').then(x=>x.DataarchiveAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'alert',
                            loadChildren: () => import('./view/alert/alert-admin-routing.module').then(x=>x.AlertAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'environment',
                            loadChildren: () => import('./view/environment/environment-admin-routing.module').then(x=>x.EnvironmentAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'laboratory',
                            loadChildren: () => import('./view/laboratory/laboratory-admin-routing.module').then(x=>x.LaboratoryAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'dataanalysis',
                            loadChildren: () => import('./view/dataanalysis/dataanalysis-admin-routing.module').then(x=>x.DataanalysisAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'plant',
                            loadChildren: () => import('./view/plant/plant-admin-routing.module').then(x=>x.PlantAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'patient',
                            loadChildren: () => import('./view/patient/patient-admin-routing.module').then(x=>x.PatientAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'specimen',
                            loadChildren: () => import('./view/specimen/specimen-admin-routing.module').then(x=>x.SpecimenAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'dataImportexport',
                            loadChildren: () => import('./view/dataImportexport/dataImportexport-admin-routing.module').then(x=>x.DataImportexportAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'location',
                            loadChildren: () => import('./view/location/location-admin-routing.module').then(x=>x.LocationAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'dataImportExport',
                            loadChildren: () => import('./view/dataImportExport/dataImportExport-admin-routing.module').then(x=>x.DataImportExportAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'animal',
                            loadChildren: () => import('./view/animal/animal-admin-routing.module').then(x=>x.AnimalAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'config',
                            loadChildren: () => import('./view/config/config-admin-routing.module').then(x=>x.ConfigAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                        {

                            path: 'serotype',
                            loadChildren: () => import('./view/serotype/serotype-admin-routing.module').then(x=>x.SerotypeAdminRoutingModule),
                            canActivate: [AuthGuard],
                        },
                    ]
                },
            ]
        ),
    ],
    exports: [RouterModule],
})
export class AdminRoutingModule { }
