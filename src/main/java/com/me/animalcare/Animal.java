package com.me.animalcare;

abstract class Animal {
    private final String birthYear;
    private final String breed;
    private double weight;
   
    
    public Animal(String birthYear, String breed, double weight) {
        this.birthYear = birthYear;
        this.breed = breed;
        this.weight = weight;
    }
    
    public String getBirthYear(){
        return this.birthYear;
    }
    
    public String getBreed(){
        return this.breed;
    }
    
    public double getWeight(){
        return this.weight;
    }
    
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    public void walk(){
        System.out.println("The animal is walking..");
    }
    
    public void walk(String direction){
        System.out.println("The animal is walking " + direction);
    }
    
    public void walk(String speed, String direction){
        System.out.println("The animal is walking " + direction + " " + speed);
    }
    
    public void talk(){
        System.out.println("The animal is talking..");
    }
}
 
class Dog extends Animal {
    
    public Dog(String birthYear, String breed, double weight) {
        super(birthYear, breed, weight);
    }
    
    public void wagTail() {
        System.out.println("The dog is wagging its tail..");
    }
    
    public void talk(){
        System.out.println("The dog is talking ~bark ~bark");
    }
}
 
class Parrot extends Animal{
    private double wingSpan ;
    
    public Parrot(String birthYear, String breed, double weight, double wingSpan) {
        super(birthYear, breed, weight);
        this.wingSpan = wingSpan;
    }
    
    public double getWingSpan(){
        return this.wingSpan;
    }
    
    public void setWingSpan(double wingSpan){
        this.wingSpan = wingSpan;
    }
    
    @Override
    public void talk(){
        System.out.println("The parrot is talking ~squawk ~squawk");
    }
    public void fly(){
        System.out.println("The parrot is flying...");
    }
   
    class Cat extends Animal {
    
        private boolean isIndoor;
    
        public Cat(String birthYear, String breed, double weight, boolean isIndoor) {
            super(birthYear, breed, weight);
            this.isIndoor = isIndoor;
        }
        
        public void purr() {
            System.out.println("The cat is purring...");
        }
        
        @Override
        public void talk() {
            System.out.println("The cat is talking ~meow ~meow");
        }
    
        public boolean getIsIndoor() {
            return isIndoor;
        }
    
        public void setIndoor(boolean isIndoor) {
            this.isIndoor = isIndoor;
        }
    }






}
 