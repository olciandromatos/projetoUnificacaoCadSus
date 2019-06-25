import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { DataTableModule } from 'primeng/components/datatable/datatable';
import { HttpClientModule } from '@angular/common/http';
import { ButtonModule } from 'primeng/components/button/button';
import { TooltipModule } from 'primeng/components/tooltip/tooltip';
import { PanelModule } from 'primeng/panel';
import { DropdownModule } from 'primeng/components/dropdown/dropdown';
import { InputTextModule } from 'primeng/components/inputtext/inputtext';
import { InputMaskModule } from 'primeng/components/inputmask/inputmask';
import { MenubarModule } from 'primeng/components/menubar/menubar';
import { AutoCompleteModule } from 'primeng/components/autocomplete/autocomplete';

import { AppComponent } from './app.component';
import { ContainerComponent } from './container/container.component';
import { PacienteComponent } from './paciente/paciente.component';
import { MenuBarComponent } from './menu-bar/menu-bar.component';
import { ListarMedicoComponent } from './medico/listar-medico/listar-medico.component';
import { ListarPacienteComponent } from './paciente/listar-paciente/listar-paciente.component';

@NgModule({
  declarations: [
    AppComponent,
    ContainerComponent,
    PacienteComponent,
    MenuBarComponent,
    ListarMedicoComponent,
    ListarPacienteComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    HttpClientModule,
    DataTableModule,
    ButtonModule,
    TooltipModule,
    PanelModule,
    FormsModule,
    ReactiveFormsModule,
    DropdownModule,
    InputTextModule,
    InputMaskModule,
    MenubarModule,
    AutoCompleteModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
