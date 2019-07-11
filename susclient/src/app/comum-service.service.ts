import { Sexo } from './domain/Sexo';
import { Especialidade } from './domain/Especialidade';
import { Municipio } from './domain/Municipio';
import { Estado } from './domain/Estado';
import { Paciente } from './domain/Paciente';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Medico } from './domain/Medico';
import { Pais } from './domain/Pais';
import { StatusSaude } from './domain/StatusSaude';

@Injectable({
  providedIn: 'root'
})
export class ComumServiceService {

  API  = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) { }

  public getPaciente(): Observable<Paciente[]> {
    return this.http.get<Paciente[]>('http://localhost:8080/api/paciente');
  }

  public getMedicos(): Observable<Medico[]> {
    return this.http.get<Medico[]>('http://localhost:8080/api/medico');
  }

  public getEstados(): Observable<Estado[]> {
    return this.http.get<Estado[]>('http://localhost:8080/api/estado');
  }

  public getMunicipios(): Observable<Municipio[]> {
    return this.http.get<Municipio[]>('http://localhost:8080/api/municipio');
  }

  public getEspecilalidade(): Observable<Especialidade[]> {
    return this.http.get<Especialidade[]>('http://localhost:8080/api/especialidade');
  }

  public getPaises(): Observable<Pais[]> {
    return this.http.get<Pais[]>('http://localhost:8080/api/pais');
  }

  public getSexo(): Observable<Sexo[]> {
    return this.http.get<Sexo[]>('http://localhost:8080/api/sexo');
  }

  public getStatus(): Observable<StatusSaude[]> {
    return this.http.get<StatusSaude[]>('http://localhost:8080/api/statusSaude');
  }
}
