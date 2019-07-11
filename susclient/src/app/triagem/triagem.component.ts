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
  status: StatusSaude[] = new Array;

  constructor(private servico: ComumServiceService) { }

  ngOnInit() {
    this.statusSaude();
  }

  statusSaude() {
    this.servico.getStatus().subscribe( result => this.status = result);
  }

}
