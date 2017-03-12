import java.io.File;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.NaturalLanguageClassifier;
import com.ibm.watson.developer_cloud.natural_language_classifier.v1.model.*;

public class NLCSnippet {
	public static void main(String[] arg) {
		NaturalLanguageClassifier service = new NaturalLanguageClassifier();
		service.setUsernameAndPassword("{username}", "{password}");
		Classifier classifier = service.createClassifier("My Classifier", "en", new File("./train.csv")).execute();
		System.out.println(classifier);
	}
}
