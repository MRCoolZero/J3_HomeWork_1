package ru.rickSanchez.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<F extends Fruit> {
    private ArrayList<F> fruits;

    Box(F... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(F... fruits) {
        this.fruits.addAll(
                new ArrayList<>(Arrays.asList(fruits))
        );
    }

    public void add(Box<F> fruitsBox) {
        if (this.fruits.equals(fruitsBox.fruits)) {
            return;
        }
        this.fruits.addAll(fruitsBox.fruits);
        fruitsBox.fruits.clear();
    }

    public float getWeight() {
        float weight = 0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<F> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }
}