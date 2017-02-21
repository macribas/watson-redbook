import com.ibm.watson.developer_cloud.alchemy.v1.AlchemyLanguage;
import com.ibm.watson.developer_cloud.alchemy.v1.model.DocumentEmotion;
import java.util.HashMap;
import java.util.Map;
public class EmotionSnippet {
    public static String your_api_key_here = "3d4f29b76ca3aef81d6d19c5eda19d9317e11ec6";
    public static void main(String[] arg) {
        AlchemyLanguage service = new AlchemyLanguage();
        service.setApiKey(your_api_key_here);
        Map<String,Object> params = new HashMap<String,
        Object>();
        params.put(AlchemyLanguage.TEXT,"I purchased this card from Best Buy for around $69 to use in my new camcorder." + 
            "It's perfect. The read/write speed is exactly what I needed to record HD video and the storage capacity is " + 
            "enough for several hours of video.I wish it had been a little cheaper when I bought it. I see it's on sale " +
            "now so get it while you can before the price goes back up!");
        DocumentEmotion docEmotions = service.getEmotion(params).execute();
        // process object 'docEmotions' that contains properties 
        // 'anger', 'disgust', 'fear', 'joy', 'sadness'
        System.out.println(docEmotions);
    }
}