import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * This class moves the house and the smile.
 */
public class AnimateComponents {
	private static final int FRAME_WIDTH = 1800;
	private static final int FRAME_HEIGHT = 600;

	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("An animated rectangle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final DrawComponents component = new DrawComponents();
		frame.add(component);

		frame.setVisible(true);

		class TimerListener implements ActionListener {
			public void actionPerformed(ActionEvent event) {
				component.moveBy(1);
			}
		}

		ActionListener listener = new TimerListener();

		final int DELAY = 100; // Milliseconds between timer ticks
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}