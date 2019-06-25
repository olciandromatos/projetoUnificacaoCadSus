import { Estado } from './../domain/Estado';
import { ComumServiceService } from './../comum-service.service';
import { Component, OnInit } from '@angular/core';
import { Paciente } from '../domain/Paciente';
import { Municipio } from '../domain/Municipio';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit {

  paciente: Paciente = new Paciente;
  estados: Estado[] = new Array;
  estado: Estado = new Estado;
  municipio: Municipio = new Municipio;
  municipios: Municipio[] = new Array;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarEstado();
    this.listarMunicipio();
  }

  listarEstado() {
    this.servico.getEstados().subscribe(resposta => this.estados = resposta);
  }

  listarMunicipio() {
    this.servico.getMunicipios().subscribe(resposta => this.municipios = resposta);
  }

}
