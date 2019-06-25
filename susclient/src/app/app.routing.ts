import { TriagemComponent } from './triagem/triagem.component';
import { CadastrarMedicoComponent } from './medico/cadastrar-medico/cadastrar-medico.component';
import { ListarPacienteComponent } from './paciente/listar-paciente/listar-paciente.component';
import { CadastrarPacienteComponent } from './paciente/cadastrar-paciente/cadastrar-paciente.component';
import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders } from '@angular/core';

const APP_ROUTES: Routes = [
  { path: '', component: ListarPacienteComponent},
  { path: 'paciente', component: CadastrarPacienteComponent},
  { path: 'medico', component: CadastrarMedicoComponent},
  { path: 'triagem', component: TriagemComponent}
];

export const routing: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
