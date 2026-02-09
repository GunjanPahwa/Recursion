package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        int[] ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));


    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;

        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid)); //copies a specified range in a new array
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); //the end index is not inclusive

        return merge(left,right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length&&j<second.length){ //if any one condition is false then loop will terminate
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;


        }
        //if one array is bigger than the other then this will happen
        //used to copy the remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length) {
            mix[k] = first[j];
            j++;
            k++;
        }
        return mix;
    }
}
