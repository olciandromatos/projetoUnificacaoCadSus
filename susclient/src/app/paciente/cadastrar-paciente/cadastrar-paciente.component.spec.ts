import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarPacienteComponent } from './cadastrar-paciente.component';

describe('CadastrarPacienteComponent', () => {
  let component: CadastrarPacienteComponent;
  let fixture: ComponentFixture<CadastrarPacienteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarPacienteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarPacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
