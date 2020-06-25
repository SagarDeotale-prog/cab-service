package com.cab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cab")
public class Cab {

	@Id
	private int id;

	@Column(name = "cab_number")
	private String carNumber;

	@Column(name = "car_model_id")
	private int carModelId;

	@Column(name = "active")
	private boolean isActive;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getCarModelId() {
		return carModelId;
	}

	public void setCarModelId(int carModelId) {
		this.carModelId = carModelId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

}
