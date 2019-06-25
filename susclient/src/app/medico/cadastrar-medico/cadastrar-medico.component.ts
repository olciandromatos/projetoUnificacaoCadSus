import { Especialidade } from './../../domain/Especialidade';
import { ComumServiceService } from './../../comum-service.service';
import { Municipio } from './../../domain/Municipio';
import { Estado } from './../../domain/Estado';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cadastrar-medico',
  templateUrl: './cadastrar-medico.component.html',
  styleUrls: ['./cadastrar-medico.component.css']
})
export class CadastrarMedicoComponent implements OnInit {

  estados: Estado[] = new Array;
  estado: Estado = new Estado;
  municipio: Municipio = new Municipio;
  municipios: Municipio[] = new Array;
  especialidades: Especialidade[] = new Array;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarEstado();
    this.listarMunicipio();
    this.listarEspecialidade();
  }

  listarEstado() {
    this.servico.getEstados().subscribe(resposta => this.estados = resposta);
  }

  listarMunicipio() {
    this.servico.getMunicipios().subscribe(resposta => this.municipios = resposta);
  }

  listarEspecialidade() {
    this.servico.getEspecilalidade().subscribe(resposta => this.especialidades = resposta);
  }

}
