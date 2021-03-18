import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ComumServiceService } from 'src/app/comum-service.service';
import { Equipamento } from 'src/app/domain/Equipamento';

@Component({
  selector: 'app-delete-component',
  templateUrl: './delete-component.component.html',
  styleUrls: ['./delete-component.component.css']
})
export class DeleteComponentComponent implements OnInit {

  equipamento: Equipamento;

  constructor(private comumServiceService: ComumServiceService,
     private route: ActivatedRoute,
     private router: Router) { }

  ngOnInit() {
    this.pesquisarEquipamentos();
  }

  private voltarListagem(){
    this.router.navigate(['/equipamento']);
  }

  private pesquisarEquipamentos() {
    const id = this.route.snapshot.paramMap.get('id');
    this.comumServiceService.readById(id).subscribe(equipamento => {
      this.equipamento = equipamento;
    });
  }

  delete(){
    return this.comumServiceService.deletarEquipamento(this.equipamento.id).subscribe(() => {
      alert("Deletado com sucesso.");
    }, (error)=> {
      alert("Procure o Administrador do sistema.");
    }, ()=> {
      this.voltarListagem();
    })
  }

}
