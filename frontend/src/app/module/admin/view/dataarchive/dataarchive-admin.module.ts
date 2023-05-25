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

import { ReportCreateAdminComponent } from './report-admin/create-admin/report-create-admin.component';
import { ReportEditAdminComponent } from './report-admin/edit-admin/report-edit-admin.component';
import { ReportViewAdminComponent } from './report-admin/view-admin/report-view-admin.component';
import { ReportListAdminComponent } from './report-admin/list-admin/report-list-admin.component';
import { DataArchiveCreateAdminComponent } from './data-archive-admin/create-admin/data-archive-create-admin.component';
import { DataArchiveEditAdminComponent } from './data-archive-admin/edit-admin/data-archive-edit-admin.component';
import { DataArchiveViewAdminComponent } from './data-archive-admin/view-admin/data-archive-view-admin.component';
import { DataArchiveListAdminComponent } from './data-archive-admin/list-admin/data-archive-list-admin.component';

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

    ReportCreateAdminComponent,
    ReportListAdminComponent,
    ReportViewAdminComponent,
    ReportEditAdminComponent,
    DataArchiveCreateAdminComponent,
    DataArchiveListAdminComponent,
    DataArchiveViewAdminComponent,
    DataArchiveEditAdminComponent,
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
  ReportCreateAdminComponent,
  ReportListAdminComponent,
  ReportViewAdminComponent,
  ReportEditAdminComponent,
  DataArchiveCreateAdminComponent,
  DataArchiveListAdminComponent,
  DataArchiveViewAdminComponent,
  DataArchiveEditAdminComponent,
  ],
  entryComponents: [],
})
export class DataarchiveAdminModule { }