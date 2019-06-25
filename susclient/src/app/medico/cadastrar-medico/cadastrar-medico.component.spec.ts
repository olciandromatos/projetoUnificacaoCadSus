import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarMedicoComponent } from './cadastrar-medico.component';

describe('CadastrarMedicoComponent', () => {
  let component: CadastrarMedicoComponent;
  let fixture: ComponentFixture<CadastrarMedicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarMedicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarMedicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
