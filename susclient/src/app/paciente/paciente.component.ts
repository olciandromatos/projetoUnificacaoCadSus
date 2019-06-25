import { Component, OnInit } from '@angular/core';
import { Paciente } from '../domain/Paciente';

@Component({
  selector: 'app-paciente',
  templateUrl: './paciente.component.html',
  styleUrls: ['./paciente.component.css']
})
export class PacienteComponent implements OnInit {

  paciente: Paciente = new Paciente;

  constructor() { }

  ngOnInit() {
  }

}
