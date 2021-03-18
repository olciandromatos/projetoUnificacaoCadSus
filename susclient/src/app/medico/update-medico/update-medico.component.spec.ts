import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateMedicoComponent } from './update-medico.component';

describe('UpdateMedicoComponent', () => {
  let component: UpdateMedicoComponent;
  let fixture: ComponentFixture<UpdateMedicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateMedicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateMedicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
