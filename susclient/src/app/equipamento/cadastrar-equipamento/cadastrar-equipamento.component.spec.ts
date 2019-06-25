import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarEquipamentoComponent } from './cadastrar-equipamento.component';

describe('CadastrarEquipamentoComponent', () => {
  let component: CadastrarEquipamentoComponent;
  let fixture: ComponentFixture<CadastrarEquipamentoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarEquipamentoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarEquipamentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
