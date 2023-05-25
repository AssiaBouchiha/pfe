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

import { AnimalCreateAdminComponent } from './animal-admin/create-admin/animal-create-admin.component';
import { AnimalEditAdminComponent } from './animal-admin/edit-admin/animal-edit-admin.component';
import { AnimalViewAdminComponent } from './animal-admin/view-admin/animal-view-admin.component';
import { AnimalListAdminComponent } from './animal-admin/list-admin/animal-list-admin.component';
import { AnimalTypeCreateAdminComponent } from './animal-type-admin/create-admin/animal-type-create-admin.component';
import { AnimalTypeEditAdminComponent } from './animal-type-admin/edit-admin/animal-type-edit-admin.component';
import { AnimalTypeViewAdminComponent } from './animal-type-admin/view-admin/animal-type-view-admin.component';
import { AnimalTypeListAdminComponent } from './animal-type-admin/list-admin/animal-type-list-admin.component';
import { AnimalSpecieCreateAdminComponent } from './animal-specie-admin/create-admin/animal-specie-create-admin.component';
import { AnimalSpecieEditAdminComponent } from './animal-specie-admin/edit-admin/animal-specie-edit-admin.component';
import { AnimalSpecieViewAdminComponent } from './animal-specie-admin/view-admin/animal-specie-view-admin.component';
import { AnimalSpecieListAdminComponent } from './animal-specie-admin/list-admin/animal-specie-list-admin.component';

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

    AnimalCreateAdminComponent,
    AnimalListAdminComponent,
    AnimalViewAdminComponent,
    AnimalEditAdminComponent,
    AnimalTypeCreateAdminComponent,
    AnimalTypeListAdminComponent,
    AnimalTypeViewAdminComponent,
    AnimalTypeEditAdminComponent,
    AnimalSpecieCreateAdminComponent,
    AnimalSpecieListAdminComponent,
    AnimalSpecieViewAdminComponent,
    AnimalSpecieEditAdminComponent,
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
  AnimalCreateAdminComponent,
  AnimalListAdminComponent,
  AnimalViewAdminComponent,
  AnimalEditAdminComponent,
  AnimalTypeCreateAdminComponent,
  AnimalTypeListAdminComponent,
  AnimalTypeViewAdminComponent,
  AnimalTypeEditAdminComponent,
  AnimalSpecieCreateAdminComponent,
  AnimalSpecieListAdminComponent,
  AnimalSpecieViewAdminComponent,
  AnimalSpecieEditAdminComponent,
  ],
  entryComponents: [],
})
export class AnimalAdminModule { }