import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatorioPacienteComponent } from './relatorio-paciente.component';

describe('RelatorioPacienteComponent', () => {
  let component: RelatorioPacienteComponent;
  let fixture: ComponentFixture<RelatorioPacienteComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RelatorioPacienteComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatorioPacienteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
