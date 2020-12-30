package com.accenture.fwk.helpers.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalUnit;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FakeDatas {

    public static String generateRandomIntBetweenTwoValues(int low, int high){
        Random random = new Random();
        String randomValue = String.valueOf(random.nextInt(high - low) + low);
        return randomValue;
    }
    public static String plusMonthsDaysAndYearsToCurrentDate(int plusMonths, int plusDays, int plusYears){
        return LocalDate.now().plusMonths(plusMonths).plusDays(plusDays).plusYears(plusYears).format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
    }
    public static String generateFirstName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
    public static String generateLastName(){
        Faker faker = new Faker();
        return faker.name().lastName();
    }
    public static String generateStreetAddress(){
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }
    public static String generateZipCode(){
        Faker faker = new Faker();
        String zipCode = faker.address().zipCode();
        return zipCode.replace("-","").substring(0,zipCode.length() - 2);
    }
    public static String generateCity(){
        Faker faker = new Faker();
        return faker.address().city();
    }
}
