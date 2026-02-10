package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,2};
        System.out.println(subsetDuplicate(arr));

    }
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        //in the beginning the original arraylist is empty
        outer.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=0;
            //if current and previous element are sane then s=e+1
            if(i>0&&arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size(); //the inner list created at every step has the same size as the outer list
            for(int j=start;j<n;j++){ //when outer size is 2, 2 internal list will be created
                List<Integer> internal=new ArrayList<>(outer.get(j)); //internal will be a copy of outer
                //basically i copied outer lists and then added the number we are at
                //eg, we had [] and [1], so copied them and assume that i am at 2 so it will become [2] and [1,2]
                internal.add(arr[i]);
                outer.add(internal);

            }
        }
        return outer;
    }
}
