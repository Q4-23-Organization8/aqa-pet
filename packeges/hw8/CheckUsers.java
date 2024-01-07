package hw8;

public class CheckUsers {


    public static void main(String[] args) {
        Users testUser1 = new Users ();
        testUser1.userName = "Ann";
        testUser1.setAge (50);
        testUser1.printAge();
        testUser1.getAge();
        testUser1.setPassword("12345678");
        testUser1.printPassord();
        testUser1.makePurchase(44.44);
        testUser1.makePurchase(22.44);
        testUser1.printTotalAmountOfSpentMoney();

        System.out.println("____________________________");

        Users testUser2 = new Users ("Jeniffer");
        testUser2.setAge(6);
        testUser2.setPassword("");
        testUser2.makePurchase(50);
        testUser2.printTotalAmountOfSpentMoney();

        System.out.println("____________________________");

        Users testUser3 = new Users ("John", "weakpass" );
        testUser3.email = "testmail@com.ua";
        testUser3.setAge(35);
        testUser3.makePurchase(444.44);
        testUser3.makePurchase(222.44);
        System.out.println("Покупець на ім'я " + testUser3.userName + " віком " + testUser3.getAge()+ " років, " + "з імейлом " + testUser3.email);
        testUser3.printTotalAmountOfSpentMoney();

    }

}
