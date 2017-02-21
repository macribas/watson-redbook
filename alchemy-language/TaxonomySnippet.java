import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.Taxonomies;
import java.util.HashMap;
import java.util.Map;

public class TaxonomySnippet {
  public static String your_api_key_here = "22a85a4a737e4e5bc82ac2432bc002e020429cf9";
  public static void main(String[] arg) {
        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String,Object>();
        params.put(AlchemyLanguage.URL,"http://www.espn.com/tennis/story/_/id/18436908/australian-open-2017-tournament-news-schedule-live-scores-tv-coverage");
        Taxonomies taxonomies = service.getTaxonomy(params).execute();
        // process taxonomy array
        System.out.println(taxonomies);
  }
}