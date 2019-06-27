import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RelatorioMedicoComponent } from './relatorio-medico.component';

describe('RelatorioMedicoComponent', () => {
  let component: RelatorioMedicoComponent;
  let fixture: ComponentFixture<RelatorioMedicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RelatorioMedicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RelatorioMedicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
