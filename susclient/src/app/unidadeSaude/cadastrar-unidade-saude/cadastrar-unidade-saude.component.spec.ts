import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CadastrarUnidadeSaudeComponent } from './cadastrar-unidade-saude.component';

describe('CadastrarUnidadeSaudeComponent', () => {
  let component: CadastrarUnidadeSaudeComponent;
  let fixture: ComponentFixture<CadastrarUnidadeSaudeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CadastrarUnidadeSaudeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CadastrarUnidadeSaudeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
