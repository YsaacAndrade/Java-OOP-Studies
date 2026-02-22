public class Hunter implements Animal{

    @Override
    public void drink() {
        System.out.println("This animal is drinking water");
    }

    @Override
    public void eat() {
        System.out.println("This animal is eating a meat");
    }

    @Override
    public void run() {
        System.out.println("This animal is hunting");
    }
}
