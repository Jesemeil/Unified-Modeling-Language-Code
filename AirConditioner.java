public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature;
    
    public AirConditioner(String productName) {
        this.productName = productName;
    }
    
    public void decreaseTemperature() {
        if (isOn) {
            temperature--;
            System.out.println(" The temperature is decreased to: " + temperature);
        } else {
            System.out.println("Please turn on the air conditioner.");
        }
    }
    
    public String getProductName() {
        return productName;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void increaseTemperature() {
        if (isOn) {
            temperature++;
            System.out.println("The temperature is increased to: " + temperature);
        } else {
            System.out.println("Please turn on the air conditioner.");
        }
    }
    
    public boolean isOn() {
        return isOn;
    }
    
    public void setOn(boolean isOn) {
        this.isOn = isOn;
        if (isOn) {
            System.out.println("Air conditioner turned on.");
        } else {
            System.out.println("Air conditioner turned off.");
        }
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Temperature set to: " + temperature);
    }
    
}
