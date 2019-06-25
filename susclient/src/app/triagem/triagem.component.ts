import { Component, OnInit } from '@angular/core';
import { Paciente } from 'src/app/domain/Paciente';

@Component({
  selector: 'app-triagem',
  templateUrl: './triagem.component.html',
  styleUrls: ['./triagem.component.css']
})
export class TriagemComponent implements OnInit {

  paciente: Paciente = new Paciente;

  constructor() { }

  ngOnInit() {
  }

}
