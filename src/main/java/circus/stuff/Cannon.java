package circus.stuff;

<<<<<<< HEAD:src/main/java/circus/stuff/Cannon.java
public class Cannon extends equipment {
=======
public class Cannon extends Equipment {
>>>>>>> upstream/master:src/main/java/Cannon.java

    public Cannon(int purchasePrice) {
        super(purchasePrice);
    }

    @Override
    public int getValue() {
        return purchasePrice / 3;
    }
}
