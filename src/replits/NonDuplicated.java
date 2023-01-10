package replits;

import java.util.Arrays;
import java.util.Scanner;

public class NonDuplicated {
    public static void main(String[] args) {


        int[] nums = {1, 1, 2, 2, 3, 4, 4};

        //WRITE YOUR CODE BELOW:


        String duplicated = "";
        String nonDuplicated = "";


            int j=1;
            for (int i=0; i<=nums.length-2; i++) {


                if (nums[i] == nums[j++]) {
                    duplicated += nums[i]+ " ";
                }



                }
        System.out.println(duplicated);

            }




        }






