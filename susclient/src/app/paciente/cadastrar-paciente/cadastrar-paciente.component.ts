import { Sexo } from './../../domain/Sexo';
import { ComumServiceService } from './../../comum-service.service';
import { Estado } from './../../domain/Estado';
import { Municipio } from './../../domain/Municipio';
import { Component, OnInit } from '@angular/core';
import { Paciente } from 'src/app/domain/Paciente';

@Component({
  selector: 'app-cadastrar-paciente',
  templateUrl: './cadastrar-paciente.component.html',
  styleUrls: ['./cadastrar-paciente.component.css']
})
export class CadastrarPacienteComponent implements OnInit {

  paciente: Paciente = new Paciente;
  estados: Estado[] = new Array;
  estado: Estado = new Estado;
  municipio: Municipio = new Municipio;
  municipios: Municipio[] = new Array;
  sexo: Sexo[] = new Array;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarEstado();
    this.listarMunicipio();
    this.listarSexo();
  }

  listarEstado() {
    this.servico.getEstados().subscribe(resposta => this.estados = resposta);
  }

  listarMunicipio() {
    this.servico.getMunicipios().subscribe(resposta => this.municipios = resposta);
  }

  listarSexo() {
    this.servico.getSexo().subscribe(resposta => this.sexo = resposta);
  }

  cadastrar() {

  }

}
