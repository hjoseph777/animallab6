package com.me.animalcare;

import com.me.animalcare.Parrot.Cat;

public class AnimalCare {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog myDog = new Dog("2023","Husky",30.5);
        myDog.walk();
        myDog.walk("backward");
        myDog.walk("fast");
        myDog.talk();
        myDog.wagTail();
        myDog.setWeight(40.8);
 
        Parrot myParrot = new Parrot("2020","Red Parrot", 0.85, 0.25);
        myParrot.fly();
        System.out.println(myParrot.getWingSpan());
        myParrot.setWingSpan(0.3);
        System.out.println(myParrot.getWingSpan());
        
        myParrot.talk();
        
        
        Animal myAnimal = new Dog("2019","sheppard",20.5);
        myAnimal.talk();
        
        Animal myAnimal2 = new Parrot("2019","sheppard",20.5,0.3);
        myAnimal2.talk();

        
        Parrot myParrotForCat = new Parrot("2015", "Red Parrot", 0.85, 0.25);
        Cat myCat = myParrotForCat.new Cat("2015", "Siamese", 8.5, true);
        myCat.talk();
        System.out.println("Is the cat indoor? " + myCat.getIsIndoor());
        System.out.println("Cat's breed: " + myCat.getBreed());
        System.out.println("Cat's weight: " + myCat.getWeight());
    }
}