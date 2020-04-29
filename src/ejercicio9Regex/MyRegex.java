package ejercicio9Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyRegex {

    public static void eveluarRegex(){
        Scanner scanner=new Scanner(System.in);
        String cadenaAevaluar="Hola mundo, estoy en Mexico";
        String regex;

        while (true){
            regex=scanner.next();
            if (regex.equals("exit")){
                break;
            }

            Pattern patron=Pattern.compile(regex);
            Matcher matcher=patron.matcher(cadenaAevaluar);

            boolean coincidencia=matcher.find();
            System.out.println("Hay coincidencia? "+coincidencia);

        }
    }

}
