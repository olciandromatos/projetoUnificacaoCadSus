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

const APP_ROUTES: Routes = [
  { path: '', component: ListarPacienteComponent},
  { path: 'paciente', component: CadastrarPacienteComponent},
  { path: 'medico', component: CadastrarMedicoComponent},
  { path: 'triagem', component: TriagemComponent},
  { path: 'consulta', component: ConsultaComponent},
  { path: 'medicamento', component: CadastrarMedicamentoComponent},
  { path: 'relatorio-paciente', component: RelatorioPacienteComponent},
  { path: 'relatorio-medico', component: RelatorioMedicoComponent},
  { path: 'equipamento', component: CadastrarEquipamentoComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
