import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { PanelModule } from 'primeng/panel';
import { DataTableModule } from 'primeng/components/datatable/datatable';

import { ListarMedicoComponent } from './listar-medico/listar-medico.component';

@NgModule({
  declarations: [
    ListarMedicoComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    PanelModule,
    DataTableModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ]
})
export class MedicoModuleModule { }