import { Medico } from './../../domain/Medico';
import { Component, OnInit } from '@angular/core';
import { ComumServiceService } from './../../comum-service.service';
import { Especialidade } from './../../domain/Especialidade';
import { Estado } from './../../domain/Estado';
import { Municipio } from './../../domain/Municipio';
import { Pais } from 'src/app/domain/Pais';

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
  paises: Pais[] = new Array;
  medico: Medico = new Medico;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarEstado();
    this.listarMunicipio();
    this.listarEspecialidade();
    this.listarPais();
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

  listarPais() {
    this.servico.getPaises().subscribe(resposta => this.paises = resposta);
  }

  cadastrar() {
    this.servico.cadastrarMedico(this.medico).subscribe(resultado => {
      alert('Cadastrado com sucesso!');
      console.log(this.medico.nome);
      console.log(this.medico.crm);
      console.log(this.medico.telefone);
      console.log(this.medico.dataNascimento);
      this.load();
    });
  }

  load() {
    location.reload()
  }

}
