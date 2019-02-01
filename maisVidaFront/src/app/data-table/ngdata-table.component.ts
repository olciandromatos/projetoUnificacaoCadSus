import { Pessoa } from './../domain/pessoa';
import { Component, OnInit } from '@angular/core';
import { ComumService } from '../comum.service';

@Component({
  selector: 'app-ngdata-table',
  templateUrl: './ngdata-table.component.html',
  styleUrls: ['./ngdata-table.component.css']
})
export class NgdataTableComponent implements OnInit {

  transactions: {
    date: Date,
    label: string,
    amount: number
  }[];

  pessoas: Pessoa[] = new Array();
  pessoa: Pessoa = new Pessoa();

  constructor(private comumService: ComumService) { }

  ngOnInit() {
    this.listarPessoa();
  }

  listarPessoa() {
    this.comumService.listarPessoa().subscribe(pessoa => this.pessoas = pessoa);
  }
}
