import { Component, OnInit } from '@angular/core';
import { Medicamento } from 'src/app/domain/Medicamento';
import * as jsPDF from 'jspdf';
import { ComumServiceService } from 'src/app/comum-service.service';

@Component({
  selector: 'app-cadastrar-medicamento',
  templateUrl: './cadastrar-medicamento.component.html',
  styleUrls: ['./cadastrar-medicamento.component.css']
})
export class CadastrarMedicamentoComponent implements OnInit {

  medicamento: Medicamento = new Medicamento;
  medicamentos: Medicamento[] = new Array;

  constructor(private service: ComumServiceService) { }

  ngOnInit() {
    this.listarMedicamento();
  }

  imprimirPDF() {
    console.log('imprimindo');
    const doc = new jsPDF();
    doc.text('Atestado Médico', 80, 15);
    doc.setFont('Courier');
    doc.setFontStyle('bold');
    doc.setFontSize(10);
    doc.setFillColor(50, 50, 50);
    doc.text('Atesto que o sr.(a) foi atendido em nosso consultório pela manhã', 10, 50);
    doc.save('Atestado');
    // doc.output("dataurlnewwindow");
  }

  listarMedicamento() {
    this.service.getMedicamento().subscribe(result => this.medicamentos = result);
  }

  salvar() {
    this.service.cadastrar(this.medicamento).subscribe(
      medicamento => {
        console.log(this.medicamento);
      }
    );
  }

}
