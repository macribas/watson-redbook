import java.util.HashMap;
import java.util.Map;

import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Concepts;

public class ConceptsSnippet {
  public static String your_api_key_here="22a85a4a737e4e5bc82ac2432bc002e020429cf9";
    public static void main(String[] arg) {
        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String, Object>();
        params.put(AlchemyLanguage.URL,"http://www.bbc.com/news/technology-38595480");
        Concepts concepts=service.getConcepts(params).execute();
        //process your concepts here
        System.out.println(concepts);
    }
}