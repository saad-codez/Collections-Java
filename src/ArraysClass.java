import java.util.Arrays;

public class ArraysClass {
    static void main() {
        //used to perform operation on arrays

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        //to search the index of an element
        int index = Arrays.binarySearch(numbers, 7);

        System.out.println("The number is present in the index: "+index);

        // to sort an array
        int unsortedArray[] = {33, 21, 44, 34, 10, 8, 5, 22};

        System.out.println("Unsorted array");
        for (int sa : unsortedArray) {
            System.out.print(sa + " ");
        }
        Arrays.sort(unsortedArray);

        System.out.println();
        System.out.println("Sorted Array");
        for (int sa : unsortedArray) {
            System.out.print(sa + " ");
        }

    }
}
