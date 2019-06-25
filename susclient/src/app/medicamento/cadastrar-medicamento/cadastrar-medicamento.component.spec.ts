import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarMedicamentoComponent } from './cadastrar-medicamento.component';

describe('CadastrarMedicamentoComponent', () => {
  let component: CadastrarMedicamentoComponent;
  let fixture: ComponentFixture<CadastrarMedicamentoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarMedicamentoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarMedicamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
