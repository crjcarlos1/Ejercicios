package ejercicio14Builder.folder2;

import ejercicio14Builder.folder2.builder.BanckAccountBuilder;
import ejercicio14Builder.folder2.models.BankAccount;
import ejercicio14Builder.folder2.models.BankAccountType;

public class Main {

    public static void main(String...args){
        BanckAccountBuilder builder=new BanckAccountBuilder(12345);
        BankAccount bankAccount=builder.withBalance(100.20)
                .withOwner("cRalos")
                .withRate(10.15)
                .withType(BankAccountType.BASIC)
                .build();
        System.out.println(bankAccount);
    }

}
