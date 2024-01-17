package hw10;

public class RunnerMobile {
    public static void main(String[] args) {
        Model myPhone = new Model("iPhone", "15 Pro", 6.1);
        myPhone.printPrice(51000);
        myPhone.hasNFC();
        myPhone.screenSize();

    }
}
