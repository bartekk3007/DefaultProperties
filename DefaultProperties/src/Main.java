import java.util.Map;
import java.util.Properties;

public class Main
{
    public static void main(String[] args)
    {
        var defaultProperties = new Properties();
        defaultProperties.setProperty("name", "project");
        defaultProperties.setProperty("width", "800");
        defaultProperties.setProperty("height", "1200");

        var settings = new Properties(defaultProperties);
        settings.put("age-restriction", "12");
        var propertyNames = settings.stringPropertyNames();
        for (String propertyName : propertyNames)
        {
            System.out.println(propertyName);
        }
        System.out.println();

        System.out.println(settings.getProperty("name"));
        for (var o : settings.entrySet())
        {
            System.out.println(o.getKey() + " " + o.getValue());
        }

        var setedProperties = new Properties();
        String fileName = setedProperties.getProperty("filename", "ordinaryFile");
        System.out.println(fileName);

        var systemProperties = System.getProperties();
        for (Map.Entry<Object, Object> objectObjectEntry : systemProperties.entrySet())
        {
            System.out.println(objectObjectEntry.getKey() + " " + objectObjectEntry.getValue());
        }
    }
}