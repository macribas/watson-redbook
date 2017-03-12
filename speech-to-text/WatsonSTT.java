import java.io.File;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechResults;

public class WatsonSTT {
	
	public static void main(String[] args) {
		SpeechToText service = new SpeechToText();
		service.setUsernameAndPassword("<enter your username here>", "<enter your pass-word here>");

		RecognizeOptions options = new RecognizeOptions.Builder()
		  .contentType("audio/flac").timestamps(true)
		  .wordAlternativesThreshold(0.9)
		  .keywords(new String[]{"colorado", "tornado", "tornadoes"})
		  .keywordsThreshold(0.5).continuous(true).build();

		String[] files = {"audio-file1.flac", "audio-file2.flac"};
		for (String file : files) {
		  SpeechResults results = service.recognize(new File(file), options).execute();
		  System.out.println(results);
		}
	}
}
