import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteMedicoComponent } from './delete-medico.component';

describe('DeleteMedicoComponent', () => {
  let component: DeleteMedicoComponent;
  let fixture: ComponentFixture<DeleteMedicoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeleteMedicoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeleteMedicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
