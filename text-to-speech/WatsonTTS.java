import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;
import com.ibm.watson.developer_cloud.text_to_speech.v1.util.WaveUtils;

public class WatsonTTS {
  public static void main(String[] args) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword ("4cb88712-4601-4787-8111-bcd6258d02ca", "7BWivP2rQ0oB");
    try {
      String text = "Hello from IBM Watson";
      InputStream stream = service.synthesize(text, Voice.EN_ALLISON, AudioFormat.WAV).execute();
      InputStream in = WaveUtils.reWriteWaveHeader(stream);
      OutputStream out = new FileOutputStream("Hello Watson.wav");
      byte [] buffer = new byte [1024];
      int length;
      while ((length = in.read(buffer)) > 0) {
        out.write(buffer, 0, length);
      }
      out.close();
      in.close();
      stream.close();
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}
