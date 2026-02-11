package Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceRet("",4));
        diceFace("",8,9);

    }
    static void dice(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){ //so that of we want to find all combinations that make 4 we don't accidently take 5 and 6

            dice(p+i,target-i);
        }

    }
    static ArrayList<String> diceRet(String p,int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){ //so that of we want to find all combinations that make 4 we don't accidently take 5 and 6

            ans.addAll(diceRet(p+i,target-i));
        }
        return ans;
    }
    static void diceFace(String p, int target,int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=face&&i<=target;i++){ //so that of we want to find all combinations that make 4 we don't accidently take 5 and 6

            diceFace(p+i,target-i,face);
        }

    }
}
