import { Triagem } from "./Triagem";

export class Consulta {
  id: number;
  horaConsulta: Date;
  relatoMedico: string;
  relatoPaciente: string;
  triagem: Triagem;
}
