import { AuthServiceService } from './../login/auth-service.service';
import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/components/common/menuitem';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.css']
})
export class MenuBarComponent implements OnInit {

  items: MenuItem[];
  mostrarMenu = false;

  constructor(private router: Router, private auth: AuthServiceService) { }

  ngOnInit() {
    this.auth.mostrarMenuEmitter.subscribe(mostrar => this.mostrarMenu = mostrar);
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-search',
        routerLink: '/login'
      },
      {
        label: 'Triagem',
        icon: 'pi pi-fw pi-user-plus',
        routerLink: '/triagem'
      },
      {
        label: 'Consulta',
        icon: 'pi pi-fw pi-user-plus',
        routerLink: '/consulta'
      },
      {
        label: 'Cadastro',
        icon: 'pi pi-fw pi-plus',
        items: [
          {label: 'Paciente', icon: 'pi pi-fw pi-save', routerLink: '/paciente'},
          {label: 'Medico', icon: 'pi pi-fw pi-save', routerLink: '/medico'},
          {label: 'Medicamento', icon: 'pi pi-fw pi-save', routerLink: '/medicamento'},
          {label: 'Equipamento', icon: 'pi pi-fw pi-save', routerLink: '/equipamento'}
        ]
      },
      {
        label: 'Relatorio',
        icon: 'pi pi-fw pi-file',
        items: [
            {label: 'Paciente', icon: 'pi pi-fw pi-eye', routerLink: '/relatorio-paciente'},
            {label: 'Medico', icon: 'pi pi-fw pi-eye', routerLink: '/relatorio-medico'}
        ]
    }];

  }

  logout() {
    if (this.auth.usuarioAutenticado === true) {
      this.mostrarMenu = false;
      this.router.navigate(['/logout']);
    } else {
      this.mostrarMenu = true;
      this.router.navigate(['/logout']);
    }
  }


}
