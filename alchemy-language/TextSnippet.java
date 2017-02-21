import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentText;
import java.util.HashMap;
import java.util.Map;

public class TextSnippet {
    public static String your_api_key_here = "22a85a4a737e4e5bc82ac2432bc002e020429cf9";
    public static void main(String[] arg) {AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String, Object>();
        params.put(AlchemyLanguage.URL,"http://edition.cnn.com/2016/12/18/americas/gitmo-detainee-uruguay/index.html");
        DocumentText documentText=service.getText(params).execute();
        // process text string in documentText
        System.out.println(documentText);
    }
}