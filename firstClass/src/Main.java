public class Main {
    static void main(String[] args) {
        bankAccount ysaac = new bankAccount("Ysaac", 12);
        try {
            ysaac.deposit(-100000);
            ysaac.withdraw(5);
        } catch (valueException e) {
            System.out.println("Insert a valid Value");
        }
        System.out.println(ysaac.getBalance());
    }
}
