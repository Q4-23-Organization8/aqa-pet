package hw10;

class Model extends MobilePhone {
    private double screenSize;

    public Model(String brand, String model, double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
    }

    public double getCameraResolution() {
        return screenSize;
    }

    @Override
    public void screenSize() {
        System.out.println("The screen size of " + getBrand() + " " + getModel() + " is " + screenSize + " inches.");
    }
}
