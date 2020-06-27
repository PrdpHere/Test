package com.scb.pvb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.scb.pvb.model.BusModel;
import com.scb.pvb.service.ReservationService;

@RestController
public class ReservationController {

	@Autowired
	private ReservationService empService;

	@RequestMapping("/getall")
	public List<BusModel> getAllData() {

		System.out.println("entered into get all controller");
		return empService.getAllBusList();
	}

	@RequestMapping("/searchBusList")
	@GetMapping
	public List<BusModel> searchBus(@RequestParam(required = true) String source,
			@RequestParam(required = true) String destination, @RequestParam(required = true) String travelDate,
			@RequestParam(required = false) String returnDate) {

		List<BusModel> listOfBus = new ArrayList<BusModel>();
		System.out.println("entered into searchBus controller - " + source + " " + destination + " " + travelDate + " "
				+ returnDate);
		listOfBus = empService.getAllBusList();
		listOfBus.stream().forEach(p -> System.out.println("Bus Details :" + p.getBusNumber()));
		return listOfBus;
	}

	@GetMapping
	@RequestMapping("/searchBusNumber")
	public List<BusModel> addEmpData(@RequestParam(required = true) String busNumber) {
		List<BusModel> busObject = new ArrayList<BusModel>();
		System.out.println("entered into add search bus controller");
		busObject = empService.filterBusNumber(busNumber);
		busObject.stream().forEach(p -> System.out.println("Bus Details :" + p.getBusNumber()));
		return busObject;
	}

}
