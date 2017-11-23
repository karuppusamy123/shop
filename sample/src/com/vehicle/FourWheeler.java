package com.vehicle;

import javax.persistence.Entity;

@Entity
public class FourWheeler extends Vehicle {
public FourWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

public String getSteeringWheel() {
		return steeringWheel;
	}

	public void setSteeringWheel(String steeringWheel) {
		this.steeringWheel = steeringWheel;
	}

public String steeringWheel;
}
