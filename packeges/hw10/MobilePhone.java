package hw10;

abstract class MobilePhone implements Mobile {
    private String brand;
    private String model;

    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void hasNFC() {
        System.out.println(getBrand() + " " + getModel() + " has NFC.");
    }

    public abstract void screenSize();

    @Override
    public void printPrice(double price) {
        System.out.println("The price of " + getBrand() + " " + getModel() + " " + "is: " + price);
    }

}

