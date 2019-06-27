import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/components/common/menuitem';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.css']
})
export class MenuBarComponent implements OnInit {

  items: MenuItem[];

  constructor() { }

  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-search',
        routerLink: '/'
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

}
