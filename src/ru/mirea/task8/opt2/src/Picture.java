package ru.mirea.task8.opt2.src;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class Picture extends JPanel {

        private static final long serialVersionUID = 1L;

        private BufferedImage image;

        public static final int WIDTH = 1320;
        public static final int HEIGHT = 1320;

        public Picture(String path) {
            try {
                JFrame frame = new JFrame();
                image = ImageIO.read(new File(path));
                frame.setSize(WIDTH, HEIGHT);
                frame.setVisible(true);
                frame.getContentPane().add(this);
                this.setBackground(Color.WHITE);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        protected void paintComponent(Graphics d) {
            super.paintComponent(d);
            d.drawImage(image, 0, 0, null);

        }
}
