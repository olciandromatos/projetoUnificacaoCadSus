import { Component, OnInit } from '@angular/core';
import { Medicamento } from 'src/app/domain/Medicamento';
import * as jsPDF from 'jspdf';
import { ComumServiceService } from 'src/app/comum-service.service';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-cadastrar-medicamento',
  templateUrl: './cadastrar-medicamento.component.html',
  styleUrls: ['./cadastrar-medicamento.component.css']
})
export class CadastrarMedicamentoComponent implements OnInit {

  medicamentos: Medicamento[] = new Array;
  formulario: FormGroup;

  constructor(private service: ComumServiceService, private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.configurarFormulario();
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

  configurarFormulario() {
    this.formulario = this.formBuilder.group({
      nome: [null, Validators.required],
      quantidade: [null, [Validators.required]],
      descricao: [null, [Validators.required]]
    });
  }

  listarMedicamento() {
    this.service.getMedicamento().subscribe(resposta => this.medicamentos = resposta);
  }

  salvar() {
    this.service.cadastrar(this.formulario.value).subscribe(
      resposta => {
          console.log('O que tem na resposta: ' + resposta);
          console.log('O que tem na formulario: ' + this.formulario);
          console.log('O que tem na medicamentos: ' + this.medicamentos);
          console.log('Objeto com id nulo');
          this.medicamentos.push(resposta);
          console.log('O que tem na medicamentos depois do insert: ' + this.medicamentos);
          this.formulario.reset();
        this.listarMedicamento();
      }
    );
  }

}
