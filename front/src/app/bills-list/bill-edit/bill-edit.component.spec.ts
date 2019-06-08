import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BillEditDialogComponent } from './bill-edit.component';

describe('BillEditComponent', () => {
  let component: BillEditDialogComponent;
  let fixture: ComponentFixture<BillEditDialogComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BillEditDialogComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BillEditDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
