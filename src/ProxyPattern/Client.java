package ProxyPattern;

public class Client {
    public static void main(String[] args) throws Exception {
//        DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
//        nonAdminExecuter.executeDatabase("DELEE");




        DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");
        adminExecuter.executeDatabase("DELETE");

    }
}
