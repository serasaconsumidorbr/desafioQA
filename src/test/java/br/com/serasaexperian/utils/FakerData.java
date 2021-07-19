package br.com.serasaexperian.utils;

import com.github.javafaker.Faker;

public class FakerData {
	
	public static String getFakeName() {
		return new Faker().name().fullName().replace(".", " ");
	}
	
	public static String getBirthdayDate() {
		Faker fake = new Faker();
		String birthdayFullDate[] = fake.date().birthday().toString().split(" "); 
		return "0109".concat(birthdayFullDate[birthdayFullDate.length-1]);
	}

	public static String getFakeEmail() {
		return new Faker().internet().emailAddress();
	}
}
