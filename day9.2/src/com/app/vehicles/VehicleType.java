package com.app.vehicles;
//this enum use as a "Has-A" state of Vehicle  : Association use
public enum VehicleType {
  BIKE,SCOOTER,SUV,SEDAN,CAR,VAN;
	
  @Override
  public String toString() {
	  return name().toLowerCase();
  }
}
