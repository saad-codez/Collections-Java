import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    static void main() {
        //ArrayList is a dynamic array; i.e, it has no fixed length.
        //It expands it's memory with this formula: size = n; n + n/2 + 1.
        //If ArrayList has internally 10 size, and if 11th element is added, then it means the size will increase to 10 + 10/2 + 1 = 16.\

        // creating arraylist
        List<Integer> numbers = new ArrayList<>();

        // Let's add elements:
        numbers.add(1); // in built method to add

        // Let's use for loop to add 10 numbers
        for (int i = 2; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println("Original List");
        System.out.println(numbers);


        // Let's add a number at a certain index
        numbers.add(5, 60); // ad index 5, i.e 6, the element 60 will be added
        System.out.println("After using add() at an index");
        System.out.println(numbers);

        // Let's remove any number based on index
        numbers.remove(4); // element at index 4, i.e 5 will be removed
        System.out.println("After removing an element from an index");
        System.out.println(numbers);

        // Let's remove any number based on its value
        numbers.remove(Integer.valueOf(60));
        System.out.println("After removing an element based on its value");
        System.out.println(numbers);

        // Let's check if there is a specific element present in the list
        System.out.println("After using contains() to see if 30 exists");
        System.out.println(numbers.contains(30)); // returns false, since 30 is not there.

        // Let's access a single element from its index
        System.out.println("After using get() to access the element in index 1");
        System.out.println(numbers.get(1));

        // Let's try to replace an element with a different element
        numbers.set(8, 99); // index 8, will be replaced with 99
        System.out.println("After replacing a value based on its index");
        System.out.println(numbers);


        //Let's create another array list and append it together.
        System.out.println("Creating another arraylist");
        List<Integer> days = new ArrayList<>();
        days.add(561);
        days.add(1, 665);
        System.out.println(days);

        // Let's merge gpa with numbers.
        numbers.addAll(days);
        System.out.println("After merging two array list");
        System.out.println(numbers);

        // Let's iterate the numbers
        // using for loop
        System.out.println("Printing all the elements using for loop");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //using enhanced for loop
        System.out.println("Printing all the elements using enhanced for loop");
        for (Integer number : numbers) {
            System.out.println("Number is " + number);
        }

        // printing using Iterator
        System.out.println("Printing all the elements using iterator");
        Iterator<Integer> iterate = numbers.iterator();
        while(iterate.hasNext()){
            System.out.println("The numbers is "+ iterate.next());
        }

        // Let's clear the array list
        numbers.clear();
        System.out.println("After clearing the array list");
        System.out.println(numbers);

    }
}
