 

// Import the Arrays class from the java.util package.


// Define a class named Q1.
public class test {

    // The main method where the program execution starts.
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,8,5};
        int tmp;
        int count = 0;
        while (count == 0) {
            for(int i=0;i<nums.length-1;i++){
                tmp = nums[i];
                count = 1;
                if (nums[i+1]<nums[i]) {
                    nums[i] = nums[i+1];
                    nums[i+1] = tmp;
                    count = 0;
                }
            }
            
        }
        for(int x : nums){System.out.print(x+" ");}

    }
}