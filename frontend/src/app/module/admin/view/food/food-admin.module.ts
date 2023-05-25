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
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {CalendarModule} from 'primeng/calendar';
import {PanelModule} from 'primeng/panel';
import {InputNumberModule} from 'primeng/inputnumber';
import {BadgeModule} from 'primeng/badge';
import { MultiSelectModule } from 'primeng/multiselect';
import {TranslateModule} from '@ngx-translate/core';
import {FileUploadModule} from "primeng/fileupload";

import { FoodCreateAdminComponent } from './food-admin/create-admin/food-create-admin.component';
import { FoodEditAdminComponent } from './food-admin/edit-admin/food-edit-admin.component';
import { FoodViewAdminComponent } from './food-admin/view-admin/food-view-admin.component';
import { FoodListAdminComponent } from './food-admin/list-admin/food-list-admin.component';
import { BrandCreateAdminComponent } from './brand-admin/create-admin/brand-create-admin.component';
import { BrandEditAdminComponent } from './brand-admin/edit-admin/brand-edit-admin.component';
import { BrandViewAdminComponent } from './brand-admin/view-admin/brand-view-admin.component';
import { BrandListAdminComponent } from './brand-admin/list-admin/brand-list-admin.component';
import { InstitutionCreateAdminComponent } from './institution-admin/create-admin/institution-create-admin.component';
import { InstitutionEditAdminComponent } from './institution-admin/edit-admin/institution-edit-admin.component';
import { InstitutionViewAdminComponent } from './institution-admin/view-admin/institution-view-admin.component';
import { InstitutionListAdminComponent } from './institution-admin/list-admin/institution-list-admin.component';

import { PasswordModule } from 'primeng/password';
import { InputTextModule } from 'primeng/inputtext';
import {ButtonModule} from 'primeng/button';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import {TabViewModule} from 'primeng/tabview';
import { SplitButtonModule } from 'primeng/splitbutton';
import { MessageModule } from 'primeng/message';
import {MessagesModule} from 'primeng/messages';
import {PaginatorModule} from 'primeng/paginator';



@NgModule({
  declarations: [

    FoodCreateAdminComponent,
    FoodListAdminComponent,
    FoodViewAdminComponent,
    FoodEditAdminComponent,
    BrandCreateAdminComponent,
    BrandListAdminComponent,
    BrandViewAdminComponent,
    BrandEditAdminComponent,
    InstitutionCreateAdminComponent,
    InstitutionListAdminComponent,
    InstitutionViewAdminComponent,
    InstitutionEditAdminComponent,
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
    PaginatorModule,
    TranslateModule,
    FileUploadModule,
  ],
  exports: [
  FoodCreateAdminComponent,
  FoodListAdminComponent,
  FoodViewAdminComponent,
  FoodEditAdminComponent,
  BrandCreateAdminComponent,
  BrandListAdminComponent,
  BrandViewAdminComponent,
  BrandEditAdminComponent,
  InstitutionCreateAdminComponent,
  InstitutionListAdminComponent,
  InstitutionViewAdminComponent,
  InstitutionEditAdminComponent,
  ],
  entryComponents: [],
})
export class FoodAdminModule { }