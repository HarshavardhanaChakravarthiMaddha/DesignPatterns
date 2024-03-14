package Builder_Design_Pattern;
//Builder Interface
public interface Builder {
    void buildCPU();
    void buildRAM();
    void buildStorage();
    Computer getResult();
}
