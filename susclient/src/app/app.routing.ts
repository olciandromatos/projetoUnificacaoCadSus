import { CadastrarEquipamentoComponent } from './equipamento/cadastrar-equipamento/cadastrar-equipamento.component';
import { RelatorioMedicoComponent } from './relatorio/relatorio-medico/relatorio-medico.component';
import { CadastrarMedicamentoComponent } from './medicamento/cadastrar-medicamento/cadastrar-medicamento.component';
import { ConsultaComponent } from './consulta/consulta.component';
import { TriagemComponent } from './triagem/triagem.component';
import { CadastrarMedicoComponent } from './medico/cadastrar-medico/cadastrar-medico.component';
import { ListarPacienteComponent } from './paciente/listar-paciente/listar-paciente.component';
import { CadastrarPacienteComponent } from './paciente/cadastrar-paciente/cadastrar-paciente.component';
import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';
import { RelatorioPacienteComponent } from './relatorio/relatorio-paciente/relatorio-paciente.component';
import { LoginComponent } from './login/login.component';
import { UpdateEquipamentoComponent } from './equipamento/update-equipamento/update-equipamento.component';
import { DeleteComponentComponent } from './equipamento/delete-component/delete-component.component';
import { UpdateMedicoComponent } from './medico/update-medico/update-medico.component';
import { DeleteMedicoComponent } from './medico/delete-medico/delete-medico.component';

const APP_ROUTES: Routes = [
  { path: '', component: LoginComponent},
  { path: 'paciente', component: CadastrarPacienteComponent},
  { path: 'medico', component: CadastrarMedicoComponent},
  { path: 'triagem', component: TriagemComponent},
  { path: 'consulta', component: ConsultaComponent},
  { path: 'medicamento', component: CadastrarMedicamentoComponent},
  { path: 'relatorio-paciente', component: RelatorioPacienteComponent},
  { path: 'relatorio-medico', component: RelatorioMedicoComponent},
  { path: 'equipamento', component: CadastrarEquipamentoComponent},
  { path: 'logout', component: LoginComponent},
  { path: 'login', component: ListarPacienteComponent},
  { path: 'equipamento/update/:id', component: UpdateEquipamentoComponent},
  { path: 'equipamento/delete/:id', component: DeleteComponentComponent},
  { path: 'medico/update/:id', component: UpdateMedicoComponent},
  { path: 'medico/delete/:id', component: DeleteMedicoComponent},
];

export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
