import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UrbanismeComponent } from './urbanisme.component';

describe('UrbanismeComponent', () => {
  let component: UrbanismeComponent;
  let fixture: ComponentFixture<UrbanismeComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UrbanismeComponent]
    });
    fixture = TestBed.createComponent(UrbanismeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
