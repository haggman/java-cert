package com.roitraining.cert.annotations_generics_collections_lambdas;

import com.roitraining.cert.shared.Dog;

//Tradition is the type is a single, capital letter
//Could be anything. From this view, A is a generic type
public class VetClientAnimal<A> { //It can be multiple types, like HashMap<K,V>
    private A animal; //Notice how the A then appears where a type is needed
    public void checkInAnimal(A animal){
        this.animal = animal;
        System.out.println(animal + " checked in and waiting.");
    }
    public A seeAnimal(){ //
        System.out.printf("You're next %s!%n", animal);
        return animal;
    }
}
class VetClientAnimalRunner {
    public static void main(String[] args) {
        String s = "Not an animal"; //works because we have no type restriction
        VetClientAnimal<?> notAnAnimal = new VetClientAnimal<>();//Notice ?, don't care type
        Dog rex = new Dog("Rex");
        VetClientAnimal<Dog> vca = new VetClientAnimal<>();
        vca.checkInAnimal(rex); //Pet{name='Rex', owner=null} checked in and waiting.
        vca.seeAnimal(); //You're next Pet{name='Rex', owner=null}!
    }
}
