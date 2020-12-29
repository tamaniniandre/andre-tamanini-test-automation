package com.accenture.test.automation.hooks;

import com.accenture.test.automation.DataSteps;
import com.accenture.fwk.helpers.utils.GenerateCpf;
import com.github.javafaker.Faker;
import io.cucumber.java.Before;

import java.util.Locale;

public class DataStepsHooks {


    public DataStepsHooks(DataSteps dataSteps){

    }

    @Before
    public void GenerateUserRandomData(){

        Faker faker = new Faker(new Locale("pt-BR"));

    }
    @Before
    public void GenerateEmployeeRandomData(){

        Faker faker = new Faker(new Locale("pt-BR"));
        GenerateCpf generateCpf = new GenerateCpf();
    }
}
