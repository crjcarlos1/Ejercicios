package ejercicio5Tokenizer;

import java.util.StringTokenizer;

public class Tokenizer_ {

    public static void breakString(String string){
        StringTokenizer stringTokenizer=new StringTokenizer(string,",");
        String temporal;

        while (stringTokenizer.hasMoreElements()){
            temporal=stringTokenizer.nextToken();
            System.out.println(temporal);
        }
    }

}
