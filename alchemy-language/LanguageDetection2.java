import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Entities;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Language;

import java.util.HashMap;
import java.util.Map;

public class LanguageDetectionSnippet {
    public static String your_api_key_here="3d4f29b76ca3aef81d6d19c5eda19d9317e11ec6";
    public static void main(String[] arg) {
        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params1 = new HashMap<String, Object>();
        Map<String,Object> params2 = new HashMap<String, Object>();
        Map<String,Object> params3 = new HashMap<String, Object>();

        params1.put(AlchemyLanguage.URL,"https://www.ibm.com/blockchain/what-is-blockchain.html");
        params2.put(AlchemyLanguage.URL,"http://www.elpais.com.uy/");
        params3.put(AlchemyLanguage.URL,"http://arabic.cnn.com/travel/2017/01/11/best-places-visit-2017");

        Language language1=service.getLanguage(params1).execute();
        Language language2=service.getLanguage(params2).execute();
        Language language3=service.getLanguage(params3).execute();
        
        // process the languages
        System.out.println(language1);
        System.out.println(language2);
        System.out.println(language3);
    }
}
