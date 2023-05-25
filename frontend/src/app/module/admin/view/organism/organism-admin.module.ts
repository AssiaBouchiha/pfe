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

import { SeroTypeCreateAdminComponent } from './sero-type-admin/create-admin/sero-type-create-admin.component';
import { SeroTypeEditAdminComponent } from './sero-type-admin/edit-admin/sero-type-edit-admin.component';
import { SeroTypeViewAdminComponent } from './sero-type-admin/view-admin/sero-type-view-admin.component';
import { SeroTypeListAdminComponent } from './sero-type-admin/list-admin/sero-type-list-admin.component';
import { OrganismCreateAdminComponent } from './organism-admin/create-admin/organism-create-admin.component';
import { OrganismEditAdminComponent } from './organism-admin/edit-admin/organism-edit-admin.component';
import { OrganismViewAdminComponent } from './organism-admin/view-admin/organism-view-admin.component';
import { OrganismListAdminComponent } from './organism-admin/list-admin/organism-list-admin.component';

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

    SeroTypeCreateAdminComponent,
    SeroTypeListAdminComponent,
    SeroTypeViewAdminComponent,
    SeroTypeEditAdminComponent,
    OrganismCreateAdminComponent,
    OrganismListAdminComponent,
    OrganismViewAdminComponent,
    OrganismEditAdminComponent,
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
  SeroTypeCreateAdminComponent,
  SeroTypeListAdminComponent,
  SeroTypeViewAdminComponent,
  SeroTypeEditAdminComponent,
  OrganismCreateAdminComponent,
  OrganismListAdminComponent,
  OrganismViewAdminComponent,
  OrganismEditAdminComponent,
  ],
  entryComponents: [],
})
export class OrganismAdminModule { }