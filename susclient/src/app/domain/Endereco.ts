import { Estado } from './Estado';
export class Endereco {
  id: number;
  logradouro: string;
  numero: string;
  complemento: string;
  cep: string;
  estado: Estado;
}
