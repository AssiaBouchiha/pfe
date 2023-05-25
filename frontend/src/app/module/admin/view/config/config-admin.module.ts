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

import { GenderCreateAdminComponent } from './gender-admin/create-admin/gender-create-admin.component';
import { GenderEditAdminComponent } from './gender-admin/edit-admin/gender-edit-admin.component';
import { GenderViewAdminComponent } from './gender-admin/view-admin/gender-view-admin.component';
import { GenderListAdminComponent } from './gender-admin/list-admin/gender-list-admin.component';
import { DepartmentCreateAdminComponent } from './department-admin/create-admin/department-create-admin.component';
import { DepartmentEditAdminComponent } from './department-admin/edit-admin/department-edit-admin.component';
import { DepartmentViewAdminComponent } from './department-admin/view-admin/department-view-admin.component';
import { DepartmentListAdminComponent } from './department-admin/list-admin/department-list-admin.component';
import { AgeCategoryCreateAdminComponent } from './age-category-admin/create-admin/age-category-create-admin.component';
import { AgeCategoryEditAdminComponent } from './age-category-admin/edit-admin/age-category-edit-admin.component';
import { AgeCategoryViewAdminComponent } from './age-category-admin/view-admin/age-category-view-admin.component';
import { AgeCategoryListAdminComponent } from './age-category-admin/list-admin/age-category-list-admin.component';
import { LocationTypeCreateAdminComponent } from './location-type-admin/create-admin/location-type-create-admin.component';
import { LocationTypeEditAdminComponent } from './location-type-admin/edit-admin/location-type-edit-admin.component';
import { LocationTypeViewAdminComponent } from './location-type-admin/view-admin/location-type-view-admin.component';
import { LocationTypeListAdminComponent } from './location-type-admin/list-admin/location-type-list-admin.component';
import { MarketCategoryCreateAdminComponent } from './market-category-admin/create-admin/market-category-create-admin.component';
import { MarketCategoryEditAdminComponent } from './market-category-admin/edit-admin/market-category-edit-admin.component';
import { MarketCategoryViewAdminComponent } from './market-category-admin/view-admin/market-category-view-admin.component';
import { MarketCategoryListAdminComponent } from './market-category-admin/list-admin/market-category-list-admin.component';

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

    GenderCreateAdminComponent,
    GenderListAdminComponent,
    GenderViewAdminComponent,
    GenderEditAdminComponent,
    DepartmentCreateAdminComponent,
    DepartmentListAdminComponent,
    DepartmentViewAdminComponent,
    DepartmentEditAdminComponent,
    AgeCategoryCreateAdminComponent,
    AgeCategoryListAdminComponent,
    AgeCategoryViewAdminComponent,
    AgeCategoryEditAdminComponent,
    LocationTypeCreateAdminComponent,
    LocationTypeListAdminComponent,
    LocationTypeViewAdminComponent,
    LocationTypeEditAdminComponent,
    MarketCategoryCreateAdminComponent,
    MarketCategoryListAdminComponent,
    MarketCategoryViewAdminComponent,
    MarketCategoryEditAdminComponent,
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
  GenderCreateAdminComponent,
  GenderListAdminComponent,
  GenderViewAdminComponent,
  GenderEditAdminComponent,
  DepartmentCreateAdminComponent,
  DepartmentListAdminComponent,
  DepartmentViewAdminComponent,
  DepartmentEditAdminComponent,
  AgeCategoryCreateAdminComponent,
  AgeCategoryListAdminComponent,
  AgeCategoryViewAdminComponent,
  AgeCategoryEditAdminComponent,
  LocationTypeCreateAdminComponent,
  LocationTypeListAdminComponent,
  LocationTypeViewAdminComponent,
  LocationTypeEditAdminComponent,
  MarketCategoryCreateAdminComponent,
  MarketCategoryListAdminComponent,
  MarketCategoryViewAdminComponent,
  MarketCategoryEditAdminComponent,
  ],
  entryComponents: [],
})
export class ConfigAdminModule { }