import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentSentiment;
import java.util.HashMap;
import java.util.Map;
public class TargetedSentimentSnippet {
    public static String your_api_key_here = "22a85a4a737e4e5bc82ac2432bc002e020429cf9";
    public static void main(String[] arg) {AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String, Object>();
        params.put(AlchemyLanguage.URL,"http://www.techradar.com/reviews/wearables/apple-watch-2-1323213/review");
        params.put(AlchemyLanguage.TARGET,"fitness");
        DocumentSentiment docSentiment = service.getSentiment(params).execute();
        // process sentiment at docSentiment containing 'score' and 'type'
        System.out.println(docSentiment);
    }
}