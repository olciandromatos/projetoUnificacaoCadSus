import { Estado } from './domain/estado';
import { Pessoa } from './domain/pessoa';
import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';
import {
  HttpClient,
  HttpHeaders,
  HttpErrorResponse
} from '@angular/common/http';
import { map, catchError, tap } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class ComumService {
  constructor(private httpClient: HttpClient) {}

  API = 'http://localhost:8080/api';

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type': 'application/json'
    })
  };

  private extractData(res: Response) {
    const body = res;
    return body || {};
  }

  private handleError<T>(operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {
      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.log(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }

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
