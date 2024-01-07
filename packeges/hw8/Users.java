package hw8;

import org.w3c.dom.ls.LSOutput;

public class Users {
    public String userName;
    private int age;
    public String email;
    private String password;
    public boolean isActive;
    public double amountSpentMoney;

    //створення контейнерів
    public Users() {

    }
    public Users(String userName) {
        this.userName = userName;
    }
    public Users(String userName, String password){
       this.userName = userName;
       this.password = password;
    }
    //створення геттерів і сеттерів

    public void setAge(int age) {
        if (age >= 18 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Age should be between 18 and 100.");
        }
    }
        public int getAge() {
        return age >= 18 ? age : 18;
    }

    public void printAge() {
        System.out.println("age is:" + getAge());

    }

    public void setPassword(String password) {
        if (password.length() == 8 ) {
            this.password = password;
        }
     else {
        System.out.println("Invalid password. Password should contains 8 symbols.");
    }
}

    public String getPassword() {
        if (password != null && !password.isEmpty()) {
            return password;
        } else {
            System.out.println("Invalid password.");
            return null;
        }
    }
    public void printPassord() {
        System.out.println("password is: " + getPassword());

    }

    //створення методів makePurchase() і printTotalAmountOfSpentMoney()

    public void makePurchase(double purchasePrice) {
        System.out.println("Вартість покупки, $: " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Загальна сума витрачених грошей покупцем " + this.userName + " становить, $: "+ this.amountSpentMoney);

    }
}


