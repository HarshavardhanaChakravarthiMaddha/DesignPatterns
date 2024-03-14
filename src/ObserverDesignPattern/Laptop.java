package ObserverDesignPattern;

public class Laptop implements Observer{
    private String weather;
    @Override
    public void update(String weather) {
        this.weather = weather;
        display();
    }
    private void display() {
        System.out.println("Laptop : Weather updated - " + weather);
    }
}
