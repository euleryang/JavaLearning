package com.example.demo;


public class GameNumber {

    private int rowNumber;

    public GameNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    // @Override
    public String toString(){
        if(checkNumber()){
            return "fizz";
        }
        
        if(rowNumber % 5 == 0){
            return "buzz";
        }

        return String.valueOf(this.rowNumber);
    }

    private boolean checkNumber() {
        return rowNumber % 3 == 0;
    }

    
    // @Override
    // public String toString(){
    //     return null;

    // }

}
