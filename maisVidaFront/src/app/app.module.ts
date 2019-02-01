import { MessageService } from 'primeng/components/common/messageservice';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { PanelModule } from 'primeng/panel';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { TooltipModule } from 'primeng/components/tooltip/tooltip';
import { DataTableModule } from 'primeng/components/datatable/datatable';
import { PaginatorModule } from 'primeng/components/paginator/paginator';
import { DialogModule } from 'primeng/components/dialog/dialog';
import { InputTextModule } from 'primeng/components/inputtext/inputtext';
import { DropdownModule } from 'primeng/components/dropdown/dropdown';
import { InputMaskModule } from 'primeng/components/inputmask/inputmask';
import { ButtonModule } from 'primeng/components/button/button';
import { ToolbarModule } from 'primeng/components/toolbar/toolbar';
import { ToastModule } from 'primeng/toast';


import { AppComponent } from './app.component';
import { PainelComponent } from './painel/painel.component';
import { NgdataTableComponent } from './data-table/ngdata-table.component';
import { NgmodalComponent } from './modal/ngmodal.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { FiltroComponent } from './filtro/filtro.component';


@NgModule({
  declarations: [
    AppComponent,
    PainelComponent,
    NgdataTableComponent,
    NgmodalComponent,
    ToolbarComponent,
    FiltroComponent,
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    NgbModule,
    PanelModule,
    BrowserAnimationsModule,
    TooltipModule,
    DataTableModule,
    PaginatorModule,
    DialogModule,
    InputTextModule,
    DropdownModule,
    InputMaskModule,
    ButtonModule,
    ToolbarModule,
    ReactiveFormsModule,
    ToastModule

  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }
