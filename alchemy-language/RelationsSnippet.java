import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.SAORelations;
import java.util.HashMap;
import java.util.Map;

public class RelationsSnippet {
    public static String your_api_key_here = "3d4f29b76ca3aef81d6d19c5eda19d9317e11ec6";
    public static void main(String[] arg) {
        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String, Object>();
        params.put(AlchemyLanguage.TEXT,"Cutting Cash Would Be a Boon for the World’s Poor, Rogoff Says");
        SAORelations relations = service.getRelations(params).execute();
        // process the array of relations
        System.out.println(relations);
    }
}