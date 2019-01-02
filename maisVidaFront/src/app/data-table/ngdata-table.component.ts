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
    this.transactions = [
      {
        date: new Date(2017, 10, 10, 13, 10, 15),
        label: 'Third transaction',
        amount: 130
      },
      {
        date: new Date(2017, 7, 3, 9, 35, 0),
        label: 'Second transaction',
        amount: 130
      },
      {
        date: new Date(2017, 3, 27, 15, 43, 10),
        label: 'First transaction',
        amount: 130
      }
    ];
    this.listarPessoa();
  }

  listarPessoa() {
    this.comumService.listarPessoa().subscribe(pessoa => this.pessoas = pessoa);
  }

}
