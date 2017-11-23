package com.vehicle;

import javax.persistence.Entity;

@Entity
public class TwoWheeler extends Vehicle {
public String getSteeringHandle() {
		return steeringHandle;
	}

	public void setSteeringHandle(String steeringHandle) {
		this.steeringHandle = steeringHandle;
	}

public TwoWheeler() {
		super();
		// TODO Auto-generated constructor stub
	}

public String steeringHandle;

}
