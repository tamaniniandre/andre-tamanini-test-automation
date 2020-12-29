package com.accenture.fwk.helpers.utils;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Utils {

    static Random random = new Random();

    public static String generateRandomIntBetweenTwoValues(int low, int high){
        String randomValue = String.valueOf(random.nextInt(high - low) + low);
        return randomValue;
    }
    public static String genareteFutureDateIn(int unit, TimeUnit timeUnit){
        Faker faker = new Faker();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(faker.date().future(unit,timeUnit));
    }
    public static String genaretePastDateIn(int unit, TimeUnit timeUnit){
        Faker faker = new Faker();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.format(faker.date().past(unit,timeUnit));
    }

}
