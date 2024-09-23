package com.lms_problems;

//Parent class HillStations
public class HillStations {
 
 public void location() {
     System.out.println("Location of Hill Station");
 }

 public void famousFor() {
     System.out.println("Famous for Hill Station");
 }

 // Manali class extending HillStations
 public static class Manali extends HillStations {
     @Override
     public void location() {
         System.out.println("Manali is located in Himachal Pradesh.");
     }

     @Override
     public void famousFor() {
         System.out.println("Manali is famous for its scenic beauty and adventure sports.");
     }
 }

 // Mussoorie class extending HillStations
 public static class Mussoorie extends HillStations {
     @Override
     public void location() {
         System.out.println("Mussoorie is located in Uttarakhand.");
     }

     @Override
     public void famousFor() {
         System.out.println("Mussoorie is famous for its colonial heritage and natural beauty.");
     }
 }

 // Gulmarg class extending HillStations
 public static class Gulmarg extends HillStations {
     @Override
     public void location() {
         System.out.println("Gulmarg is located in Jammu and Kashmir.");
     }

     @Override
     public void famousFor() {
         System.out.println("Gulmarg is famous for its skiing and winter sports.");
     }
 }

 // Main method to test the classes
// public static void main(String[] args) {
//     HillStations h1 = new HillStations();
//     h1.location();  // Output: Location of Hill Station
//     h1.famousFor(); // Output: Famous for Hill Station
//     
//     Manali m1 = new Manali();
//     m1.location();   // Output: Manali is located in Himachal Pradesh.
//     m1.famousFor();  // Output: Manali is famous for its scenic beauty and adventure sports.
//
//     Mussoorie M1 = new Mussoorie();
//     M1.location();   // Output: Mussoorie is located in Uttarakhand.
//     M1.famousFor();  // Output: Mussoorie is famous for its colonial heritage and natural beauty.
//
//     Gulmarg g1 = new Gulmarg();
//     g1.location();   // Output: Gulmarg is located in Jammu and Kashmir.
//     g1.famousFor();  // Output: Gulmarg is famous for its skiing and winter sports.
// }
}
