package AdopterDesignPattern;

public class MainApp {
    public static void main(String[] args) {

        XmlData myData = new XmlData();

        // Old UI
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(myData);
        multiRestoApp.displayRecommendations(myData);

        System.out.println("==========================================");

        // New UI
        IMultiRestoApp adapter = new FancyUIAdapter();
        adapter.displayMenus(myData);
        adapter.displayRecommendations(myData);

    }
}
