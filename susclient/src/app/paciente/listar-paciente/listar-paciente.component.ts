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

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarPaciente();
  }

  listarPaciente() {
    this.servico.getPaciente().subscribe(resposta => this.pacientes = resposta);
  }

  porCPF() {
    this.servico.getPacientePorCPF(this.paciente.cpf).subscribe(resposta => {
      console.log('Resultado ' + resposta);
      console.log('CPF ' + this.paciente.cpf.replace(/\D+/g, ''));

    });
  }

}
