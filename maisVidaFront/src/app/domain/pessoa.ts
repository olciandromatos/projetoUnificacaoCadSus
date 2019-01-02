import { Estado } from './estado';
export class Pessoa {

  id: number;
  nome: string;
  cpf: string;
  rg: string;
  habilitacao: string;
  ctps: string;
  reservista: string;
  titulo: string;
  estado = new Estado();
}
