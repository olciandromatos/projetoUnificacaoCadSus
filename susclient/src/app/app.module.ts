import { routing } from './app.routing';
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
import { InputTextareaModule } from 'primeng/components/inputtextarea/inputtextarea';
import { CalendarModule } from 'primeng/components/calendar/calendar';

import { AppComponent } from './app.component';
import { PacienteComponent } from './paciente/paciente.component';
import { MenuBarComponent } from './menu-bar/menu-bar.component';
import { ListarMedicoComponent } from './medico/listar-medico/listar-medico.component';
import { ListarPacienteComponent } from './paciente/listar-paciente/listar-paciente.component';
import { CadastrarMedicamentoComponent } from './medicamento/cadastrar-medicamento/cadastrar-medicamento.component';
import { TriagemComponent } from './triagem/triagem.component';
import { CadastrarUnidadeSaudeComponent } from './unidadeSaude/cadastrar-unidade-saude/cadastrar-unidade-saude.component';
import { CadastrarEquipamentoComponent } from './equipamento/cadastrar-equipamento/cadastrar-equipamento.component';
import { CadastrarMedicoComponent } from './medico/cadastrar-medico/cadastrar-medico.component';
import { CadastrarPacienteComponent } from './paciente/cadastrar-paciente/cadastrar-paciente.component';
import { ConsultaComponent } from './consulta/consulta.component';
import { RelatorioPacienteComponent } from './relatorio/relatorio-paciente/relatorio-paciente.component';
import { RelatorioMedicoComponent } from './relatorio/relatorio-medico/relatorio-medico.component';
import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    PacienteComponent,
    MenuBarComponent,
    ListarMedicoComponent,
    ListarPacienteComponent,
    CadastrarPacienteComponent,
    CadastrarMedicamentoComponent,
    TriagemComponent,
    CadastrarUnidadeSaudeComponent,
    CadastrarEquipamentoComponent,
    CadastrarMedicoComponent,
    ConsultaComponent,
    RelatorioPacienteComponent,
    RelatorioMedicoComponent,
    LoginComponent,
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
    AutoCompleteModule,
    routing,
    InputTextareaModule,
    CalendarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
