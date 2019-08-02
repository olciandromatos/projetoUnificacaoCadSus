import { Especialidade } from './Especialidade';
export class Medico {
  id: number;
  nome: string;
  crm: string;
  telefone: string;
  email: string;
  dataNascimento: string;
  especialidade: Especialidade;
}
