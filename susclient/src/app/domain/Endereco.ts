import { Estado } from './Estado';
import { Municipio } from './Municipio';
export class Endereco {
  id: number;
  logradouro: string;
  numero: string;
  complemento: string;
  cep: string;
  estado: Estado;
  municipio: Municipio;
}
