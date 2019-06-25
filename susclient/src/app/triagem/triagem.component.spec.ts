import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TriagemComponent } from './triagem.component';

describe('TriagemComponent', () => {
  let component: TriagemComponent;
  let fixture: ComponentFixture<TriagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TriagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TriagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
