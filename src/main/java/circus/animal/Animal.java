package circus.animal;

import circus.Asset;

<<<<<<< HEAD
abstract public class Animal implements Asset {

   public String speak() {
        return null;
    }

    public int getValue() {
        return 10;
    }
=======
public abstract class Animal implements Asset {

    public String name;
    public abstract String speak();
>>>>>>> upstream/master
}
