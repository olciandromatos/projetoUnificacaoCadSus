import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ComumServiceService } from 'src/app/comum-service.service';
import { Endereco } from 'src/app/domain/Endereco';
import { Medico } from 'src/app/domain/Medico';

@Component({
  selector: 'app-update-medico',
  templateUrl: './update-medico.component.html',
  styleUrls: ['./update-medico.component.css']
})
export class UpdateMedicoComponent implements OnInit {

  medico: Medico;
  endereco: Endereco;
  constructor(private comumServiceService: ComumServiceService, 
    private route: ActivatedRoute,private router: Router) { }

  ngOnInit() {
  }

  updateMedico(): void {
    const id = this.route.snapshot.paramMap.get('id');
    this.comumServiceService.updateMedico(Number(id), this.medico).subscribe(data => {
      this.medico = data;
      alert("Medico atualizado com sucesso!");
      this.cancel();
    });
  }

  cancel(): void{
    this.router.navigate(['/medico']);
  }


}
