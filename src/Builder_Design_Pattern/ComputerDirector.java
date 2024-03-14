package Builder_Design_Pattern;

public class ComputerDirector {
    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
