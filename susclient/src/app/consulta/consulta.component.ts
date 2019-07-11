import { Component, OnInit } from '@angular/core';
import { ComumServiceService } from '../comum-service.service';
import { Paciente } from '../domain/Paciente';
import * as jsPDF from 'jspdf';

@Component({
  selector: 'app-consulta',
  templateUrl: './consulta.component.html',
  styleUrls: ['./consulta.component.css']
})
export class ConsultaComponent implements OnInit {

  pacientes: Paciente[] = new Array;
  paciente: Paciente = new Paciente;

  constructor(private service: ComumServiceService) { }

  ngOnInit() {
    this.getPaciente();
  }

  getPaciente() {
    this.service.getPaciente().subscribe( result => this.pacientes = result);
  }

  imprimirPDF(){
    console.log('imprimindo');
    const doc = new jsPDF();
    doc.text('Atestado Médico', 80, 15);
    doc.setFont('Courier');
    doc.setFontStyle('bold');
    doc.setFontSize(10);
    doc.setFillColor(50,50,50);
    doc.text('Atesto que o sr.(a) '+ this.paciente.nome+' foi atendido em nosso consultório pela manhã', 10, 50);
    doc.save('Atestado');
    // doc.output("dataurlnewwindow");
  }

}
