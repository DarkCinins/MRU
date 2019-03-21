import javax.swing.*;
import java.awt.*;

public class Move extends JComponent
{
        static JPanel panel;
        static int column = 3;

        Move(JPanel panel)
        {
            this.panel = panel;
            setBounds(0, 0,panel.getWidth() , panel.getHeight());
        }

        public void paint(Graphics g)
        {
            ImageIcon image =new ImageIcon(new ImageIcon(getClass().getResource("carro2.png")).getImage());
            g.drawImage(image.getImage(), column, 195, 260, 130, null);

            g.setColor(Color.WHITE);
            g.fillOval(35,40 ,100, 30);
            g.fillOval(70,45 ,150, 50);
            g.fillOval(160,55 ,100, 30);
            g.fillOval(320,45 ,100, 25);
            g.fillOval(340,40 ,100, 25);
            g.fillOval(700,40 ,100, 30);
            g.fillOval(780,40 ,100, 30);
            g.fillOval(610,50 ,150, 30);

            g.setColor(Color.YELLOW);
            g.fillOval(480,30 ,80,80);

            g.setColor(Color.GREEN);
            g.fillRect(0,325,1000,25);
        }

        static Thread thread  = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    while(true)
                    {
                        panel.repaint();
                        column+=1;
                        thread.sleep(50);
                    }

                }
                catch(java.lang.InterruptedException ex)
                {
                    System.out.println(ex.getMessage());
                }
            }
        };

        public static void move()
        {
            if(!thread .isAlive())
            {
                thread .start();
            }
            column = 3;
        }
}
