import { Paciente } from './domain/Paciente';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ComumServiceService {

  API  = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) { }

  public getPaciente(): Observable<Paciente[]> {
    return this.http.get<Paciente[]>(this.API + 'paciente');
  }
}
