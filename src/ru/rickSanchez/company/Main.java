package ru.rickSanchez.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task number One:");
        Integer[] arrInt = {1, 2, 3, 4, 5};
        Character[] arrChar = {'J','a','v','a'} ;

        swapElems(arrInt,1,2);
        swapElems(arrChar,0,2);
        System.out.println();

        System.out.println("Task number Two:");
        System.out.println("Array converted to ArrayList: " + arrToArrayList(arrChar)+"\n");



        System.out.println("Task number Three:");
        Box<Apple> appleBox1 = new Box<>(new Apple(), new Apple(),new Apple());
        appleBox1.add(new Apple(), new Apple());
        System.out.println("appleBox1: " + appleBox1.getWeight()+" g.");

        Box<Apple> appleBox2 = new Box<>(new Apple());
        appleBox2.add(new Apple(), new Apple());
        System.out.println("appleBox2: " + appleBox2.getWeight()+" g.");

        Box<Apple> appleBox3 = new Box<>(new Apple(), new Apple(), new Apple());
        appleBox3.add(new Apple(), new Apple());
        System.out.println("appleBox2: " + appleBox3.getWeight()+" g.");

        if (appleBox1.compare(appleBox2)) {
            System.out.println("appleBox1 and appleBox2 - the weight of both boxes is the same.");
        } else {
            System.out.println("The weight of boxes appleBox1 and appleBox2 is not equal.");
        }

        if(appleBox1.compare(appleBox3)){
            System.out.println("appleBox1 and appleBox3 - the weight of both boxes is the same.");
        } else {
            System.out.println("The weight of boxes appleBox1 and appleBox3 is not equal.");
        }

        appleBox1.add(appleBox3);
        System.out.println("appleBox1 weight: " + appleBox1.getWeight() + " g.");

        Box<Orange> orangeBox = new Box<>(new Orange(),new Orange(),new Orange());
        orangeBox.add(new Orange(), new Orange());
        System.out.println("orangeBox weight: " + orangeBox.getWeight());
    }


    //1. Написать метод, который меняет два элемента массива местами.
    // (массив может быть любого ссылочного типа);
    public static <T> void swapElems(T[] array, int indexOne, int indexTwo) {
        T temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
        System.out.println("The result of the replacement: "+ Arrays.toString(array));
    }

    //2. Написать метод, который преобразует массив в ArrayList;
    public static <V> ArrayList<V> arrToArrayList(V[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
