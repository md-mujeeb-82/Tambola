import java.io.BufferedInputStream;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class VoiceUtil {

	public static void speak(final String str) {
		new Thread() {
			@Override
			public void run() {
				VoiceManager voiceManager = null;
		        Voice syntheticVoice = null;
		        try
		        {
		            voiceManager = VoiceManager.getInstance();
		            // other voices are also supported, 
		            // like alan,kevin etc see freeTTS documentation on sourceforge.
		            syntheticVoice = voiceManager.getVoice("kevin16");
		            syntheticVoice.allocate();
		            syntheticVoice.speak(str);
		        }
		        catch (Exception e)
		        {
		            e.printStackTrace();
		        }
		        finally
		        {
		            syntheticVoice.deallocate();
		        }
			}
		}.start();
	}

	public static void play(final String song) {
		new Thread() {
			@Override
			public void run() {
				try {
					FileInputStream fis     = new FileInputStream(song);
			        BufferedInputStream bis = new BufferedInputStream(fis);
			        Player player = new Player(bis);
			        player.play(100);
			        player.close();
				}catch(Exception ex) {
					ex.printStackTrace();
				}
			}
		}.start();
	}
}
