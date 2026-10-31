import java.util.Stack;

public class StackDemo {
    static void main() {
        // works on LIFO(Last IN first OUT) principle
        // The element pushed last will be popped first

        // let's create stack
        Stack<String> animals = new Stack<>();

        // Let's push(add) animals in the animals stack
        animals.push("Horse");
        animals.push("Sheep");
        animals.push("Cat");
        animals.push("Lion");

        System.out.println(animals);

        // Let's see which animal is on top
        System.out.println(animals.peek()); // shows lion because it is last in

        // Let's pop(remove) an animal
        animals.pop();

        System.out.println(animals);

        System.out.println(animals.peek());

    }
}
