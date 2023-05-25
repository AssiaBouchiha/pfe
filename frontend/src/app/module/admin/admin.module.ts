import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import {ToastModule} from 'primeng/toast';
import {ToolbarModule} from 'primeng/toolbar';
import {TableModule} from 'primeng/table';
import {DropdownModule} from 'primeng/dropdown';
import {InputSwitchModule} from 'primeng/inputswitch';
import {InputTextareaModule} from 'primeng/inputtextarea';

import { ConfirmDialogModule } from 'primeng/confirmdialog';
import { DialogModule } from 'primeng/dialog';
import { LoginAdminComponent } from './login-admin/login-admin.component';
import { RegisterAdminComponent } from './register-admin/register-admin.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import { LocationDataAdminModule } from './view/locationData/locationData-admin.module';
import { LocationDataAdminRoutingModule } from './view/locationData/locationData-admin-routing.module';
import { OrganismAdminModule } from './view/organism/organism-admin.module';
import { OrganismAdminRoutingModule } from './view/organism/organism-admin-routing.module';
import { MicrobiologyAdminModule } from './view/microbiology/microbiology-admin.module';
import { MicrobiologyAdminRoutingModule } from './view/microbiology/microbiology-admin-routing.module';
import { FoodAdminModule } from './view/food/food-admin.module';
import { FoodAdminRoutingModule } from './view/food/food-admin-routing.module';
import { AntibioticAdminModule } from './view/antibiotic/antibiotic-admin.module';
import { AntibioticAdminRoutingModule } from './view/antibiotic/antibiotic-admin-routing.module';
import { NotificationAdminModule } from './view/notification/notification-admin.module';
import { NotificationAdminRoutingModule } from './view/notification/notification-admin-routing.module';
import { DataarchiveAdminModule } from './view/dataarchive/dataarchive-admin.module';
import { DataarchiveAdminRoutingModule } from './view/dataarchive/dataarchive-admin-routing.module';
import { AlertAdminModule } from './view/alert/alert-admin.module';
import { AlertAdminRoutingModule } from './view/alert/alert-admin-routing.module';
import { EnvironmentAdminModule } from './view/environment/environment-admin.module';
import { EnvironmentAdminRoutingModule } from './view/environment/environment-admin-routing.module';
import { LaboratoryAdminModule } from './view/laboratory/laboratory-admin.module';
import { LaboratoryAdminRoutingModule } from './view/laboratory/laboratory-admin-routing.module';
import { DataanalysisAdminModule } from './view/dataanalysis/dataanalysis-admin.module';
import { DataanalysisAdminRoutingModule } from './view/dataanalysis/dataanalysis-admin-routing.module';
import { PlantAdminModule } from './view/plant/plant-admin.module';
import { PlantAdminRoutingModule } from './view/plant/plant-admin-routing.module';
import { PatientAdminModule } from './view/patient/patient-admin.module';
import { PatientAdminRoutingModule } from './view/patient/patient-admin-routing.module';
import { SpecimenAdminModule } from './view/specimen/specimen-admin.module';
import { SpecimenAdminRoutingModule } from './view/specimen/specimen-admin-routing.module';
import { DataImportexportAdminModule } from './view/dataImportexport/dataImportexport-admin.module';
import { DataImportexportAdminRoutingModule } from './view/dataImportexport/dataImportexport-admin-routing.module';
import { LocationAdminModule } from './view/location/location-admin.module';
import { LocationAdminRoutingModule } from './view/location/location-admin-routing.module';
import { DataImportExportAdminModule } from './view/dataImportExport/dataImportExport-admin.module';
import { DataImportExportAdminRoutingModule } from './view/dataImportExport/dataImportExport-admin-routing.module';
import { AnimalAdminModule } from './view/animal/animal-admin.module';
import { AnimalAdminRoutingModule } from './view/animal/animal-admin-routing.module';
import { ConfigAdminModule } from './view/config/config-admin.module';
import { ConfigAdminRoutingModule } from './view/config/config-admin-routing.module';
import { SerotypeAdminModule } from './view/serotype/serotype-admin.module';
import { SerotypeAdminRoutingModule } from './view/serotype/serotype-admin-routing.module';


import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';


@NgModule({
  declarations: [
   LoginAdminComponent,
   RegisterAdminComponent
  ],
  imports: [
    CommonModule,
    ToastModule,
    ToolbarModule,
    TableModule,
    ConfirmDialogModule,
    DialogModule,
    PasswordModule,
    InputTextModule,
    ButtonModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    SplitButtonModule,
    BrowserAnimationsModule,
    DropdownModule,
    TabViewModule,
    InputSwitchModule,
    InputTextareaModule,
    CalendarModule,
    PanelModule,
    MessageModule,
    MessagesModule,
    InputNumberModule,
    BadgeModule,
    MultiSelectModule,
  LocationDataAdminModule,
  LocationDataAdminRoutingModule,
  OrganismAdminModule,
  OrganismAdminRoutingModule,
  MicrobiologyAdminModule,
  MicrobiologyAdminRoutingModule,
  FoodAdminModule,
  FoodAdminRoutingModule,
  AntibioticAdminModule,
  AntibioticAdminRoutingModule,
  NotificationAdminModule,
  NotificationAdminRoutingModule,
  DataarchiveAdminModule,
  DataarchiveAdminRoutingModule,
  AlertAdminModule,
  AlertAdminRoutingModule,
  EnvironmentAdminModule,
  EnvironmentAdminRoutingModule,
  LaboratoryAdminModule,
  LaboratoryAdminRoutingModule,
  DataanalysisAdminModule,
  DataanalysisAdminRoutingModule,
  PlantAdminModule,
  PlantAdminRoutingModule,
  PatientAdminModule,
  PatientAdminRoutingModule,
  SpecimenAdminModule,
  SpecimenAdminRoutingModule,
  DataImportexportAdminModule,
  DataImportexportAdminRoutingModule,
  LocationAdminModule,
  LocationAdminRoutingModule,
  DataImportExportAdminModule,
  DataImportExportAdminRoutingModule,
  AnimalAdminModule,
  AnimalAdminRoutingModule,
  ConfigAdminModule,
  ConfigAdminRoutingModule,
  SerotypeAdminModule,
  SerotypeAdminRoutingModule,
  ],
  exports: [
  LoginAdminComponent,
  RegisterAdminComponent,

    LocationDataAdminModule,
    OrganismAdminModule,
    MicrobiologyAdminModule,
    FoodAdminModule,
    AntibioticAdminModule,
    NotificationAdminModule,
    DataarchiveAdminModule,
    AlertAdminModule,
    EnvironmentAdminModule,
    LaboratoryAdminModule,
    DataanalysisAdminModule,
    PlantAdminModule,
    PatientAdminModule,
    SpecimenAdminModule,
    DataImportexportAdminModule,
    LocationAdminModule,
    DataImportExportAdminModule,
    AnimalAdminModule,
    ConfigAdminModule,
    SerotypeAdminModule,
  ],
  entryComponents: [],
})
export class AdminModule { }
