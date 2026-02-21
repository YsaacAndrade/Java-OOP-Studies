public class bankAccount {

    private String name;
    private int id;
    private int balance;

    bankAccount(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public void deposit(int value) throws valueException {
        if (value < 0) {
            throw new valueException("Insert a valid value!");
        }
        else {
            balance += value;
        }

    }

    public void withdraw(int value) throws valueException{
        if ((balance - value) < 0) {
            throw new valueException("Insert a valid value!");
        }

        else if (value < 0) {
            throw new valueException("Insert a valid value!");
        }

        else {
            balance -= value;
        }
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
