import { Sexo } from './Sexo';
import { Endereco } from './Endereco';
export class Paciente {

  id: number;
  nome: string;
  cpf: string;
  email: string;
  telefone: string;
  dataNascimento: string;
  acompanhante: string;
  emAtendimento: boolean
  endereco: Endereco;
  sexo: Sexo;
}
