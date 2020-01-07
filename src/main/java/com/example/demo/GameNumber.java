package com.example.demo;


public class GameNumber {

    private int rowNumber;

    public GameNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    // @Override
    public String toString(){
        if(rowNumber % 3 == 0){
            return "fizz";
        }
        
        if(rowNumber % 5 == 0){
            return "buzz";
        }

        return String.valueOf(this.rowNumber);
    }

    
    // @Override
    // public String toString(){
    //     return null;

    // }

}
