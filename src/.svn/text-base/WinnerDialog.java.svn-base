import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class WinnerDialog extends JDialog {
	
	private static final long serialVersionUID = -1782322382479133971L;
	
	private JComboBox comboPrizes = new JComboBox();
	private JButton btnWon = new JButton(" Won ");
	private JCheckBox chkFirst = new JCheckBox("First");
	private JCheckBox chkSecond = new JCheckBox("Second");
	private ActionCallback<Prize> callback;
	
	public WinnerDialog(ActionCallback<Prize> callback) {
		
		this.callback = callback;
		setTitle("Winner Selection");
		setSize(300,100);
		
		for(int i=0; i<PrizesDialog.LABELS.length; i++) {
			comboPrizes.addItem(PrizesDialog.LABELS[i]);
		}
		
		createMainPanel();
		createListeners();
	}

	private void createListeners() {
		
		btnWon.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				
				Prize prize = new Prize(comboPrizes.getSelectedIndex()
											, chkFirst.isSelected() ? 0 : 1
											, chkSecond.isSelected() ? 0: 1);
				callback.onSuccess(prize);
				setVisible(false);
			}
		});
	}

	private void createMainPanel() {
		JPanel panel = (JPanel) getContentPane();
		panel.setLayout(new FlowLayout());
		panel.add(comboPrizes);
		panel.add(chkFirst);
		panel.add(chkSecond);
		panel.add(btnWon);
	}
}
