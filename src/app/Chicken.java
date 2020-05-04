package app;

import app.edible.Edible;
import app.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
}
