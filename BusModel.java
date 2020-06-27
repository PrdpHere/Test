package com.scb.pvb.model;

import java.util.Comparator;

public class BusModel implements Comparator {

	private String busNumber;
	private String operatorName;
	private String departure;
	private String arrivalTime;
	private String duration;
	private String price;
	private String count;

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getOperatorName() {
		return operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCount() {
		return count;
	}

	public BusModel(String busNumber, String operatorName, String departure, String arrivalTime, String duration,
			String price, String count) {
		super();
		this.busNumber = busNumber;
		this.operatorName = operatorName;
		this.departure = departure;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.price = price;
		this.count = count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public int compare(BusModel obj1, BusModel obj2) {

		return obj1.getOperatorName().compareTo(obj2.getOperatorName());
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
