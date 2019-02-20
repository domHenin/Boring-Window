package io.cloudlogix.Project;

import java.awt.color.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World");
        JFrame jFrame = new JFrame("JAVA ROCKS");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        jFrame.setTitle("JAVA ROCKS");
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);

        JLabel jLabel = new JLabel();
        jLabel.setText("Hello, World");

        jFrame.add(jLabel);

    }
}

//set JFrame.
//setDef.
//setSiz.
//setVis.
/*
 *class windowMain extends JFrame{
	public static void main(String[] args) {
		JFrame f = new windowMain();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setTitle("JAVA ROCKS!!");
		f.setBackground(Color.BLACK);
		f.setVisible(true);
 */

