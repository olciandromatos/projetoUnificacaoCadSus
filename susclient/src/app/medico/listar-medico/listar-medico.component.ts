import { ComumServiceService } from './../../comum-service.service';
import { Medico } from './../../domain/Medico';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-listar-medico',
  templateUrl: './listar-medico.component.html',
  styleUrls: ['./listar-medico.component.css']
})
export class ListarMedicoComponent implements OnInit {

  medicos: Medico[] = new Array;
  medico: Medico = new Medico;
  
  constructor(private comumServiceService: ComumServiceService, 
    private route: ActivatedRoute,private router: Router) { }
    
    ngOnInit() {
      this.listarMedico();
      this.pesquisarMEdicos();
      console.log('medicos '+ this.medicos);
  }

  listarMedico() {
    this.comumServiceService.getMedicos().subscribe(resposta => this.medicos = resposta);
  }

private pesquisarMEdicos() {
  const id = this.route.snapshot.paramMap.get('id');
  this.comumServiceService.readByIdMedico(id).subscribe(medico => {
    this.medico = medico;
  });
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
