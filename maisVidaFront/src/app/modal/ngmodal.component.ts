import { MessageService } from 'primeng/components/common/messageservice';
import { NgdataTableComponent } from './../data-table/ngdata-table.component';
import { ComumService } from './../comum.service';
import { Estado } from './../domain/estado';
import { Pessoa } from './../domain/pessoa';
import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-ngmodal',
  templateUrl: './ngmodal.component.html',
  styleUrls: ['./ngmodal.component.css']
})
export class NgmodalComponent implements OnInit {


  estados: Estado[] = new Array();
  pessoas: Pessoa[] = new Array();

  pessoa: Pessoa = new Pessoa();
  display = false;

  constructor(
    private comumService: ComumService,
    private mensageService: MessageService
  ) { }

  ngOnInit() {
    this.listarEstado();
  }

  showDialog() {
    this.display = true;
  }

  listarEstado() {
    return this.comumService.listarEstado().subscribe(resposta => this.estados = resposta);
  }

  listarPessoa() {
    this.comumService.listarPessoa().subscribe(pessoa => this.pessoas = pessoa);
  }

  cadastrar() {
    console.log(this.pessoa);
    this.comumService.cadastrar(this.pessoa).subscribe((pessoa) => {
      this.pessoa = new Pessoa();
      this.listarPessoa();
      this.mensageService.add({
        severity : 'success',
        summary: 'Cadastro concluido com sucesso!'
      },
      resposta => {
        let msg = 'Erro inesperado. Tente novamente.';

        if (resposta.error.message) {
          msg = resposta.error.message;
        }

        this.mensageService.add({
          severity : msg,
          summary: 'Cadastro concluido com sucesso!'
        });
      });
      console.log(JSON.parse(JSON.stringify(this.pessoa)));
    });
  }
}
