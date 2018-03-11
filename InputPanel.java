package TrigCalcRadiansOnly;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.*;

public class InputPanel extends JPanel {

	public InputPanel() {
		BufferedImage myPicture = null;
		try {
			myPicture = ImageIO.read(new File("circle-1.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		add(picLabel);
	}

}
