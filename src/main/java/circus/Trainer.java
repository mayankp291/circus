package circus;

import circus.animal.Animal;
import circus.animal.Bird;
import circus.animal.Duck;
<<<<<<< HEAD:src/main/java/circus/Trainer.java
=======
import circus.animal.Parrot;
>>>>>>> upstream/master:src/main/java/Trainer.java

public class Trainer {
    public static void main(String[] args) {
        Duck d = new Duck("Donald");
        getToSpeak(d);

        Bird b = (Bird) d;  // upcasting duck to bird
        getToSpeak(b);

        Animal a = (Animal) b; // upcasting duck to bird
        getToSpeak(a);

        Duck d2 = (Duck) a; // downcasting
        getToSpeak(d2);

<<<<<<< HEAD:src/main/java/circus/Trainer.java
        train(new Duck());
        // train(new Parrot());

        Bird b2 = new Bird();

=======
        train(new Duck("Daisy"));
        // train(new animal.Parrot());
>>>>>>> upstream/master:src/main/java/Trainer.java
    }

    private static void getToSpeak(Animal animal) {
        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        }
    }
}
