package entity;

public class Account_Ex4 {
    private String id;
    private String name;
    private long balance;

    public Account_Ex4(String id, String name, long balance) {
        this.id = id;
        this.name = name;
        this.balance = balance; // số dư
    }


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public long credit(long amount) {
        long Sumcredit = this.balance += amount;
        return Sumcredit;

    }

    public long debit(long amount) {
        long Noun = this.balance -= amount;
        return Noun;
    }

}
