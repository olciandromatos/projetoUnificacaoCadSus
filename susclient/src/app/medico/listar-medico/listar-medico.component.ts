import { ComumServiceService } from './../../comum-service.service';
import { Medico } from './../../domain/Medico';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-listar-medico',
  templateUrl: './listar-medico.component.html',
  styleUrls: ['./listar-medico.component.css']
})
export class ListarMedicoComponent implements OnInit {

  medicos: Medico[] = new Array;
  medico: Medico = new Medico;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.listarMedico();
  }

  listarMedico() {
    this.servico.getMedicos().subscribe(resposta => this.medicos = resposta);
  }

}
