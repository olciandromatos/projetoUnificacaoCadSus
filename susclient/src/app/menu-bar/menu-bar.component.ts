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
        label: 'Cadastro',
        icon: 'pi pi-fw pi-plus',
        items: [
          {label: 'Paciente', icon: 'pi pi-fw pi-save'},
          {label: 'Medico', icon: 'pi pi-fw pi-save'}
        ]
      },
      {
        label: 'Relatorio',
        icon: 'pi pi-fw pi-file',
        items: [
            {label: 'Paciente', icon: 'pi pi-fw pi-eye'},
            {label: 'Medico', icon: 'pi pi-fw pi-eye'}
        ]
    }];
  }

}
