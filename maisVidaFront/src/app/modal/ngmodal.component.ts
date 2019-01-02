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

  constructor(private comumService: ComumService) { }

  ngOnInit() {
    this.listarEstado();
  }

  showDialog() {
    this.display = true;
  }

  listarEstado() {
    return this.comumService.listarEstado().subscribe(estados => this.estados = estados);
  }

  cadastrar(pessoa) {
    console.log(pessoa);
    this.comumService.cadastrarPessoa(this.pessoa).subscribe((pessoa) => {
      console.log(pessoa);
    }, (err) => {
      console.log(err);
    });
  }

}
