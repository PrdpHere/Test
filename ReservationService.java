package com.scb.pvb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.scb.pvb.model.BusModel;

@Service
public class ReservationService {

	List<BusModel> list = new ArrayList<BusModel>() {
		{
			add(new BusModel("TN001", "X", "5PM", "8AM", "5", "200rs", "2"));
			add(new BusModel("TN002", "Y", "1PM", "9AM", "4", "300rs", "4"));
			add(new BusModel("TN003", "Z", "2PM", "10AM", "6", "150rs", "2"));
			add(new BusModel("TN004", "A", "3PM", "11AM", "2", "600rs", "1"));
			add(new BusModel("TN005", "B", "4PM", "12AM", "4", "500rs", "3"));
		}
	};

	public List<BusModel> getAllBusList() {

		return this.list;
	}

	public List<BusModel> filterBusNumber(String busNumber) {

		return this.list.stream().filter(p -> p.equals(busNumber)).collect(Collectors.toList());

	}



}
