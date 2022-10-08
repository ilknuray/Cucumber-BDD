package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
 public static Properties properties;
    static {
        String dosyaYolu="configuration.properties";

        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);//diger yerlerde kullanirken surkli thorows yapmamak icin
            properties=new Properties();//fis dosya yolunu tanimladigimiz configuration dosyasini okudu
            properties.load(fis);//fisin okudugu bilgilri properties e yukledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static String getProperty(String key){
        /*
        test methodundan yooladigimiz string key degerini alip properties classin dan get property methodunu kullanarak
        bu key e ait value yu bize getirdi.
         */
        return properties.getProperty(key);

    }
}
