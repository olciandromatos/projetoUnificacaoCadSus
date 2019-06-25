import { Estado } from './../domain/Estado';
import { ComumServiceService } from './../comum-service.service';
import { Component, OnInit } from '@angular/core';
import { Paciente } from '../domain/Paciente';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit {

<<<<<<< HEAD
<<<<<<< Updated upstream
=======
  paciente: Paciente = new Paciente;

>>>>>>> master
  constructor() { }
=======
  paciente: Paciente = new Paciente;
  estados: Estado[] = new Array;
  estado: Estado = new Estado;

  constructor(private servico: ComumServiceService) { }
>>>>>>> Stashed changes

  ngOnInit() {
    this.listarEstado();
  }

  listarEstado() {
    this.servico.getEstados().subscribe(resposta => this.estados = resposta);
  }

}
