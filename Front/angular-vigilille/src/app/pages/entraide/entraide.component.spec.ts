import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EntraideComponent } from './entraide.component';

describe('EntraideComponent', () => {
  let component: EntraideComponent;
  let fixture: ComponentFixture<EntraideComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EntraideComponent]
    });
    fixture = TestBed.createComponent(EntraideComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
