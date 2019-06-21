import { Paciente } from './../domain/Paciente';
import { ComumServiceService } from './../comum-service.service';
import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/components/common/menuitem';

@Component({
  selector: 'app-container',
  templateUrl: './container.component.html',
  styleUrls: ['./container.component.css']
})
export class ContainerComponent implements OnInit {

  pacientes: Paciente[] = new Array;
  paciente: Paciente = new Paciente();

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarPaciente();
  }

  listarPaciente() {
    this.servico.getPaciente().subscribe(resposta => this.pacientes = resposta);
  }

}
