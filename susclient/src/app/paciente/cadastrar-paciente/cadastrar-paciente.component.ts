import { Endereco } from './../../domain/Endereco';
import { Sexo } from './../../domain/Sexo';
import { ComumServiceService } from './../../comum-service.service';
import { Estado } from './../../domain/Estado';
import { Municipio } from './../../domain/Municipio';
import { Component, OnInit } from '@angular/core';
import { Paciente } from 'src/app/domain/Paciente';
import { Router } from '@angular/router';

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
  endereco: Endereco = new Endereco;

  constructor(private servico: ComumServiceService, private router: Router) { }

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

  cadastrarEndereco() {
    this.servico.cadastrarEndereco(this.endereco).subscribe(resultado => {
        alert('Cadastro salvo com sucesso!');
        console.log(this.endereco);
    });
  }

redirect() {
  return this.router.navigate([`login`]);
}

  cadastrar() {
    //this.paciente.cpf = this.paciente.cpf.replace(/\D+/g, '');
    console.log(this.paciente);
    this.servico.cadastrarPaciente(this.paciente).subscribe(resultado => {
        this.cadastrarEndereco();
        if (this.endereco.id != null) {
          this.paciente.endereco.id === this.endereco.id;
        }
        return this.router.navigate([`login`]);
    });
  }

}
