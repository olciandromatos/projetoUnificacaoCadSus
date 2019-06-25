import { CadastrarPacienteComponent } from './../paciente/cadastrar-paciente/cadastrar-paciente.component';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { PanelModule } from 'primeng/panel';
import { DataTableModule } from 'primeng/components/datatable/datatable';
import { InputMaskModule } from 'primeng/components/inputmask/inputmask';
import { DropdownModule } from 'primeng/components/dropdown/dropdown';

import { ListarMedicoComponent } from './listar-medico/listar-medico.component';
import { CadastrarMedicoComponent } from './cadastrar-medico/cadastrar-medico.component';

@NgModule({
  declarations: [
    ListarMedicoComponent,
    CadastrarPacienteComponent,
    CadastrarMedicoComponent
  ],
  imports: [
    BrowserModule,
    CommonModule,
    PanelModule,
    DataTableModule,
    FormsModule,
    ReactiveFormsModule,
    BrowserAnimationsModule,
    InputMaskModule,
    DropdownModule
  ]
})
export class MedicoModuleModule { }
