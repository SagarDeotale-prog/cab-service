package com.cab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cab_ride")
public class CabRide {

	@Id
	private int id;

	@Column(name = "cab_id")
	private int cabId;

	@Column(name = "driver_id")
	private int driverId;

	@Column(name = "gps_start_point")
	private String gpsStartPoint;

	@Column(name = "gps_destination_point")
	private String gpsDestinationPoint;

	@Column(name = "start_address")
	private String startAddress;

	@Column(name = "destination_address")
	private String destinationAddress;

	@Enumerated(EnumType.STRING)
	private CabRideStatus cabRideStatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCabId() {
		return cabId;
	}

	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getGpsStartPoint() {
		return gpsStartPoint;
	}

	public void setGpsStartPoint(String gpsStartPoint) {
		this.gpsStartPoint = gpsStartPoint;
	}

	public String getGpsDestinationPoint() {
		return gpsDestinationPoint;
	}

	public void setGpsDestinationPoint(String gpsDestinationPoint) {
		this.gpsDestinationPoint = gpsDestinationPoint;
	}

	public String getStartAddress() {
		return startAddress;
	}

	public void setStartAddress(String startAddress) {
		this.startAddress = startAddress;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}

	public CabRideStatus getCabRideStatus() {
		return cabRideStatus;
	}

	public void setCabRideStatus(CabRideStatus cabRideStatus) {
		this.cabRideStatus = cabRideStatus;
	}

}
