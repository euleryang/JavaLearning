package com.example.demo;


import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

public class GameNumberTest {

    @Test
    public void should_show_raw_number_for_nomal_number(){
               

        assertThat(new GameNumber(1).toString(), is("1"));     
        assertThat(new GameNumber(2).toString(), is("2"));
    }

    private void add2(int a, int b) {
        int sum =a + b;
    }


    @Test
    public void should_show_fizz_if_raw_number_divided_by_3(){

        assertThat(new GameNumber(3).toString(), is("fizz")); 
        assertThat(new GameNumber(12).toString(), is("fizz")); 
    }

    @Test
    public void should_show_buzz_if_raw_number_divided_by_5(){

        assertThat(new GameNumber(5).toString(), is("buzz")); 
        assertThat(new GameNumber(20).toString(), is("buzz")); 
    }
}