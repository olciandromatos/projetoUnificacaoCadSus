import { Paciente } from './Paciente';
import { StatusSaude } from './StatusSaude';
export class Triagem {
  id: string;
  peso: string;
  altura: string;
  pressao: string;
  descricao: string;
  status: StatusSaude;
  paciente: Paciente;
}
