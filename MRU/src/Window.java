import javax.swing.*;

public class Window extends JFrame
{
    private javax.swing.JPanel panel;

    public Window()
    {
        initComponents();
        panel.add(new Move(panel));
    }

    private void initComponents()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new javax.swing.JPanel();
        panel.setBackground(new java.awt.Color(116, 255, 253));

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 350, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(1000, Short.MAX_VALUE))
                        .addComponent(panel, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    public static void main(String args[])
    {
        new Window().setVisible(true);
        Move.move();
    }
}
