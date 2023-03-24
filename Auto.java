package com.mycompany.homework3;


public class Auto {
  private String brand;
  private int year;
  private String regNum;

    public Auto(String brand, int year, String regNum) {
        this.brand = brand;
        this.year = year;
        this.regNum = regNum;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }
  
  @Override
    public String toString() {
        
        String str =(this.brand +" "+ this.year +" "+ this.regNum);
        return str;
                
    }
}
