import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ComumServiceService } from 'src/app/comum-service.service';
import { Equipamento } from 'src/app/domain/Equipamento';

@Component({
  selector: 'app-update-equipamento',
  templateUrl: './update-equipamento.component.html',
  styleUrls: ['./update-equipamento.component.css']
})
export class UpdateEquipamentoComponent implements OnInit {

  equipamento: Equipamento;

  constructor(private comumServiceService: ComumServiceService, private route: ActivatedRoute,private router: Router) { }

  ngOnInit() {
    const id = this.route.snapshot.paramMap.get('id')
    this.comumServiceService.readById(id).subscribe(equipamento => {
      this.equipamento = equipamento;
    });
  }

  updateEquipamento(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.comumServiceService.update(Number(id), this.equipamento).subscribe(data => {
      this.equipamento = data;
      alert("Equipamento atualizado com sucesso!");
      this.cancel();
    });
  }

  cancel(): void{
    this.router.navigate(['/equipamento']);
  }


}
