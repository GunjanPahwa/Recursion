package Strings;

public class Stream {
    public static void main(String[] args) {
        skip("","baccad");
        System.out.println(skip("baccad"));
        System.out.println(skipApple("baccappledh"));

    }
    static void skip(String p,String up){ //processed and unprocessed string
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch,up.substring(1));
        }

    }
    //Returning a string, ie we make the new string in the function body and don't take it as an argument
    static String skip(String up){ //processed and unprocessed string
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }else{
            return ch+skip(up.substring(1));
        }

    }
    //what if i want to skip an entire string at once
    static String skipApple(String up){ //processed and unprocessed string
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0)+skipApple(up.substring(1));
        }

    }
    //only skip app if we don't have apple
    static String skipAppNotApple(String up){ //processed and unprocessed string
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app")&&!up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }

    }
}
