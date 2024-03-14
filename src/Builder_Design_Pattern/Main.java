package Builder_Design_Pattern;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        // Create a builder
        GamingComputerBuilder gamingBuilder = new GamingComputerBuilder();

        // Construct a gaming computer using the director
        director.construct(gamingBuilder);

        // Get the result (the constructed computer) from the builder
        Computer gamingComputer = gamingBuilder.getResult();

        // Display the information of the constructed computer
        System.out.println("Gaming Computer Configuration:");
        System.out.println(gamingComputer);

    }
}
