package com.rmaassurance.emissiondirecte;

import com.rmaassurance.emissiondirecte.generatedClasses.*;
import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmissionDirecteMsApplication {

	public static void main(String[] args){
		SpringApplication.run(EmissionDirecteMsApplication.class, args);
		System.out.println("Compiled !");
	}

}
