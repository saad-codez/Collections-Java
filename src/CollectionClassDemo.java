import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionClassDemo {
    static void main() {

        List<Integer> nums = new ArrayList<>();

        nums.add(20);
        nums.add(19);
        nums.add(13);
        nums.add(28);
        nums.add(2);
        nums.add(2);


        System.out.println("Array list: "+nums);

        // To find the min element
        System.out.println("Min Element is: " + Collections.min(nums));

        // To find the max element
        System.out.println("Max Element is: " + Collections.max(nums));

        // To check the frequency(of occurrence) of element
        System.out.println("The number is repeated: " + Collections.frequency(nums,2)+ " times");

        // To sort the elements
       Collections.sort(nums);
        System.out.println("After Sorting(Ascending): "+nums);

       // To reverse the sorting order
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("After Sorting(Descending): "+nums);


    }
}
