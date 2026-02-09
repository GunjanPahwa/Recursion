package Sorting;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString((arr)));


    }
    static void mergeSortInPlace(int[] arr, int s, int e){
        if(e-s<=1){
            return;
        }
        int m=(s+e)/2;

        mergeSortInPlace(arr,s,m); //copies a specified range in a new array
        mergeSortInPlace(arr,m,e); //the end index is not inclusive

        mergeInPlace(arr,s,m,e);
    }
    private static void mergeInPlace(int[] arr,int s, int m, int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<e){ //if any one condition is false then loop will terminate
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;


        }
        //if one array is bigger than the other then this will happen
        //used to copy the remaining elements
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
