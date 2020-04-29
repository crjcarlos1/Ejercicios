package ejercicio14Builder.folder2.builder;

import ejercicio14Builder.folder2.interfaces.IBuilder;
import ejercicio14Builder.folder2.models.BankAccount;
import ejercicio14Builder.folder2.models.BankAccountType;

public class BanckAccountBuilder implements IBuilder {

    private long accountNumber;  /**this is important, so we'll pass it to the constructor*/
    private String owner;
    private BankAccountType type;
    private double balance;
    private double interestRate;

    public BanckAccountBuilder(long accountNumber){
        this.accountNumber=accountNumber;
    }

    public BanckAccountBuilder withOwner(String owner){
        this.owner=owner;
        return this;
    }

    public BanckAccountBuilder withType(BankAccountType type) {
        this.type = type;
        return this;
    }

    public BanckAccountBuilder withBalance(double balance) {
        this.balance = balance;
        return this;
    }

    public BanckAccountBuilder withRate(double interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    @Override
    public BankAccount build() {
        BankAccount account=new BankAccount();
        account.setAccountNumber(this.accountNumber);
        account.setOwner(this.owner);
        account.setType(this.type);
        account.setBalance(this.balance);
        account.setInterestRate(this.interestRate);
        return account;
    }

}
