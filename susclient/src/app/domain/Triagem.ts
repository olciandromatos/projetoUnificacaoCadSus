import { Paciente } from './Paciente';
import { StatusSaude } from './StatusSaude';
export class Triagem {
  id: string;
  peso: string;
  altura: string;
  pressao: string;
  status: StatusSaude;
  descricao: string;
  paciente: Paciente;
}
