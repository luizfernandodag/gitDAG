package array;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FourSum {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4};

        List<List<Integer>> arr = threeSum(nums);
        printList(arr);
    }
    public static void printList1(List<Integer> in)
    {
        System.out.print("{");
        for(Integer n: in)
        {
            System.out.print(n +",");
        }
        System.out.print("} " );
    }
public static void printList(List<List<Integer>> in) {
    List<List<Integer>> a = in;
    System.out.print("{");


    for (List<Integer> list: in) {
        printList1(list);
    }
    System.out.print("} " );
}
    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap <Integer, Pair<Integer,Integer>> sums2 = new HashMap<>();
        for(int i = 0;i < nums.length; i++)
        {
            for(int j = i+1;j < nums.length; j++)
            {   int num1 = nums[i]; int num2 = nums[j];
                int sum = num1 + num2;
                Pair<Integer,Integer> pair = new Pair(i,j);
                if(!sums2.containsKey(sum))
                    sums2.put(sum, pair );

            }
        }
        List<List<Integer>> out = new ArrayList<>();
        boolean notnull = false;
        for(int i = 0;i < nums.length; i++)
        {
            int resto = nums[i];
            System.out.println("resto: " + (-resto));
            for(Map.Entry<Integer, Pair<Integer, Integer>> h : sums2.entrySet())
            {

                if(h.getKey() == -resto) {

                    System.out.println("pairsum: " + h.getKey());

                    List<Integer> arr = new ArrayList<>();
                    arr.add(i);
                    Pair p = sums2.get(-resto);
                    arr.add((Integer) p.getValue());
                    arr.add((Integer) p.getKey());
                    notnull = true;
                }

            }
        }

     return  notnull==true ? out:null;
        
        
    }
}