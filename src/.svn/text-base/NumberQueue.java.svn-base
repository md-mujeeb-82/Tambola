import javax.swing.JLabel;


public class NumberQueue {

	private JLabel[] labels;
	
	public NumberQueue(JLabel[] labels) {
		
		this.labels = labels;
		reset();
	}
	
	public void reset() {
		for(int i=0; i<labels.length; i++) {
			labels[i].setText("00");
		}
	}
	
	public void push(int number) {
		for(int i=labels.length-1; i>0; i--) {
			labels[i].setText(labels[i-1].getText());
		}
		labels[0].setText("" + number);
	}
}
