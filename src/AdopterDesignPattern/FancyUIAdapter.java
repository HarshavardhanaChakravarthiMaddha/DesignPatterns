package AdopterDesignPattern;

public class FancyUIAdapter implements IMultiRestoApp{
    private  FancyUI fancyUI;
    public FancyUIAdapter( ) {
        this.fancyUI = new FancyUI();
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Menus using converted JSON data...");
        fancyUI.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        System.out.println("Displaying Fancy Recommendations using converted JSON data...");
        fancyUI.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData) {
        // Converts XmlData to JsonData and return it
        System.out.println("Converting XML to JSON...");
        return new JsonData();
    }

}
