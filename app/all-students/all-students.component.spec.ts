import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ALLSTUDENTSComponent } from './all-students.component';

describe('ALLSTUDENTSComponent', () => {
  let component: ALLSTUDENTSComponent;
  let fixture: ComponentFixture<ALLSTUDENTSComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ALLSTUDENTSComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ALLSTUDENTSComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
