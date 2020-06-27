package com.scb.pvb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.scb.pvb.*")
public class MainClass {
	
	public static void main(String[] args) {
		System.out.println("Entered..");
		SpringApplication.run(MainClass.class, args);
		System.out.println("Done..");

	}

}
