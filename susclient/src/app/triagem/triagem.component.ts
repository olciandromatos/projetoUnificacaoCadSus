import { Triagem } from './../domain/Triagem';
import { Component, OnInit } from '@angular/core';
import { Paciente } from 'src/app/domain/Paciente';
import { StatusSaude } from '../domain/StatusSaude';
import { ComumServiceService } from '../comum-service.service';

@Component({
  selector: 'app-triagem',
  templateUrl: './triagem.component.html',
  styleUrls: ['./triagem.component.css']
})
export class TriagemComponent implements OnInit {

  paciente: Paciente = new Paciente;
  pacientes: Paciente[] = new Array;
  status: StatusSaude[] = new Array;
  triagem: Triagem = new Triagem;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.statusSaude();
    this.getPaciente();
  }

  statusSaude() {
    this.servico.getStatus().subscribe( result => this.status = result);
  }

  getPaciente() {
    this.servico.getPaciente().subscribe( result => this.pacientes = result);
  }

  save() {
    this.servico.cadastrarTriagem(this.triagem).subscribe(resposta => {
      alert('Cadastro salvo com sucesso!');
      console.log(resposta);
    });
  }

}
