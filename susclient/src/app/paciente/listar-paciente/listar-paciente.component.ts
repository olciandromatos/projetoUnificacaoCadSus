import { ComumServiceService } from './../../comum-service.service';
import { Component, OnInit } from '@angular/core';
import { Paciente } from 'src/app/domain/Paciente';

@Component({
  selector: 'app-listar-paciente',
  templateUrl: './listar-paciente.component.html',
  styleUrls: ['./listar-paciente.component.css']
})
export class ListarPacienteComponent implements OnInit {

  paciente: Paciente = new Paciente;
  pacientes: Paciente[] = new Array;
  cpfFormatado: string;
  pacienteEncontrado: Paciente[] = new Array;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarPacienteAtendimento();
  }

  listarPacienteAtendimento() {
    this.servico.getPacienteEmAtendimento().subscribe(resposta => this.pacientes = resposta);
    console.log(this.paciente);
  }

  porCPF() {
    //this.paciente.cpf = this.paciente.cpf.replace(/\D+/g, '');
    this.servico.getPacientePorCPF(this.paciente).subscribe(resposta => this.pacienteEncontrado = resposta);
  }

}
