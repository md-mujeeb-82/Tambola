import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JDialog;


public class UIUtils {

	public static void centerDialog(JDialog dialog) {
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (int) (screenSize.getWidth() - dialog.getWidth()) / 2;
		int y = (int) (screenSize.getHeight() - dialog.getHeight()) / 2;
		dialog.setLocation(x, y);
	}
}
