package Homework10;
/*
 * Homework 10.2 TennisRacket
*/



public class TennisRacket {

    private String tbrand;
    private double thead;
    private double tweight;
    private double tgrib;

    public TennisRacket() {

    }



    public TennisRacket(String brand, double head, double weight, double grib) {

        this.tbrand = brand;
        this.thead = head;
        this.tweight = weight;
        this.tgrib = grib;
    }
        public void printClass1 () {

            System.out.println( "Play like Pro with " + tbrand + " racket" + ": " + "head size " + thead + " inch" + " racket weight" +  " " + tweight + " grams" + " " + " grib size " + tgrib + " inches");
        }

        //setters and getters

        public void setBrand (String brand){
            this.tbrand = brand;
        }

        public void setGrib ( double grib){
            this.tgrib = grib;
        }

        public void setHead ( double head){
            this.thead = head;
        }

        public void setWeight ( double weight){
            this.tweight = weight;
        }

        public String getBrand () {
            return this.tbrand;

        }

        public double getHead () {

            return this.thead;
        }

        public double getGrib () {
            return this.tgrib;
        }

        public double getWeight () {
            return tweight;
        }
    }


