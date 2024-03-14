package ObserverDesignPattern;

public class Weather {
    public static void main(String[] agrs)
    {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone = new Phone();
        Observer laptop = new Laptop();

        weatherStation.addObserver(phone);
        weatherStation.addObserver(laptop);

        // Simulating weather change
        weatherStation.setWeather("Sunny");
    }

}
