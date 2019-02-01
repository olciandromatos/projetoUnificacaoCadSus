import { HttpClient } from '@angular/common/http';
import { Estado } from './domain/estado';
import { Pessoa } from './domain/pessoa';
import { Injectable } from '@angular/core';
import { Observable} from 'rxjs';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ComumService {

  constructor(private httpClient: HttpClient) {}

  API = 'http://localhost:8080/api';

  public listarEstado(): Observable<Estado[]> {
    return this.httpClient.get<Estado[]>(`${this.API}/estado`);
  }

  public listarPessoa(): Observable<Pessoa[]> {
    return this.httpClient.get<Pessoa[]>(this.API + '/pessoa');
  }

  cadastrar(pessoa: Pessoa): Observable<Pessoa> {
    console.log(pessoa);
    return this.httpClient.post<Pessoa>('http://localhost:8080/api/pessoa', pessoa);
  }
}
