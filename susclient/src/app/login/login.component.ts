import { AuthServiceService } from './auth-service.service';
import { Usuario } from './../domain/Usuario';
import { Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  usuario: Usuario = new Usuario;
  mostrarMenu = false;

  constructor(private authService: AuthServiceService) { }

  ngOnInit() {
  }

  login() {
      this.authService.usuarioLogado(this.usuario);
      this.mostrarMenu = true;
  }

}
