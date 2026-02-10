package Strings;
import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        System.out.println(subset(arr));

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        //in the beginning the original arraylist is empty
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size(); //the inner list created at every step has the same size as the outer list
            for(int i=0;i<n;i++){ //when outer size is 2, 2 internal list will be created
                List<Integer> internal=new ArrayList<>(outer.get(i)); //internal will be a copy of outer
                //basically i copied outer lists and then added the number we are at
                //eg, we had [] and [1], so copied them and assume that i am at 2 so it will become [2] and [1,2]
                internal.add(num);
                outer.add(internal);

            }

        }
        return outer;
    }
}
