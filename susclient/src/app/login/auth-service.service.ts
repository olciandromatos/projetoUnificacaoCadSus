import { EventEmitter } from '@angular/core';
import { Router } from '@angular/router';
import { Injectable } from '@angular/core';
import { Usuario } from '../domain/Usuario';

@Injectable({
  providedIn: 'root'
})
export class AuthServiceService {

  usuarioAutenticado = false;
  usuario: Usuario = new Usuario;
  mostrarMenuEmitter = new EventEmitter<boolean>();

  constructor(private router: Router) { }

  usuarioLogado(usuario: Usuario) {
    if (usuario.usuario === 'root@gmail.com' && usuario.senha === 'root') {
      this.usuarioAutenticado = true;
      this.mostrarMenuEmitter.emit(true);
      this.router.navigate(['/login']);
    } else {
      this.usuarioAutenticado = false;
      this.mostrarMenuEmitter.emit(false);
    }
  }
}
