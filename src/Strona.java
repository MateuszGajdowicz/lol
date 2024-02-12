import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Strona extends JFrame implements ActionListener {
    private JButton takButton;
    private JButton nieButton;
    private JLabel label;
    private JLabel imageLabel;

    private int liczbaKlikniecNie = 0;
    int TakCzcionka = 18;
    int NieCzcionka = 18;
    int NieWidth = 100;
    int NieHeight = 100;
    int TakWidth = 100;
    int TakHeight = 100;

    public Strona() {
        getContentPane().setBackground(new Color(255, 105, 180));
        setTitle("Strona Internetowa");
        setSize(900, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        label = new JLabel("Zostaniesz mojom walentynkom???");
        label.setBounds(70, 50, 500, 50);
        label.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setVerticalAlignment(SwingConstants.CENTER);
        add(label);

        ImageIcon takIcon = new ImageIcon("takButtonImage.jpg");
        takButton = new JButton(takIcon);
        takButton.setText("Tak");
        takButton.setFont(new Font("Comic Sans MS", Font.BOLD, TakCzcionka));
        takButton.setBounds(100, 200, 100, 100);
        takButton.setVerticalTextPosition(SwingConstants.CENTER);
        takButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        takButton.addActionListener(this);
        add(takButton);

        ImageIcon nieIcon = new ImageIcon("nieButtonImage.jpg");
        nieButton = new JButton(nieIcon);
        nieButton.setText("Nie");
        nieButton.setFont(new Font("Comic Sans MS", Font.BOLD, NieCzcionka));
        nieButton.setVerticalTextPosition(SwingConstants.CENTER);
        nieButton.setHorizontalTextPosition(SwingConstants.RIGHT);
        nieButton.addActionListener(this);
        nieButton.setBounds(400, 200, 100, 100);
        add(nieButton);

        imageLabel = new JLabel();
        imageLabel.setBounds(100, 400, 300, 300);
        add(imageLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == takButton) {
            ImageIcon imageIcon = new ImageIcon("D:\\SpringApplicationDobre\\walentynki\\src\\img_4.png");
            imageLabel.setIcon(imageIcon);
            imageLabel.setBounds(100,300,500,700);
            label.setText("Sram ci do mordy");
        } else if (e.getSource() == nieButton) {
            liczbaKlikniecNie++;
            TakWidth *= 1.15;
            TakHeight *= 1.15;
            NieWidth *= 0.75;
            NieHeight *= 0.75;
            TakCzcionka = (int) (TakCzcionka * 1.25);
            NieCzcionka = (int) (NieCzcionka * 0.75);

            takButton.setBounds(100, 200, (int) TakWidth, (int) TakHeight);
            takButton.setFont(new Font("Comic Sans MS", Font.BOLD, TakCzcionka));

            nieButton.setBounds(400, 200, (int) NieWidth, (int) NieHeight);
            nieButton.setFont(new Font("Comic Sans MS", Font.BOLD, NieCzcionka));

            label.setText("Kliknąłeś przycisk 'Nie' " + liczbaKlikniecNie + " razy.");

            revalidate();
            repaint();
        }

        if (liczbaKlikniecNie == 1) {
            label.setText("Czemu :((");
        } else if (liczbaKlikniecNie == 2) {
            label.setText("No wez");
        } else if (liczbaKlikniecNie == 3) {
            label.setText("Ale jak to :(((");
        } else if (liczbaKlikniecNie == 4) {
            label.setText("Bede plakal");
        } else if (liczbaKlikniecNie == 5) {
            label.setText("</3333");
        } else if (liczbaKlikniecNie == 6) {
            label.setText("DDDDDD:");
        } else if (liczbaKlikniecNie == 7) {
            label.setText("AJAJAJA");
        } else if (liczbaKlikniecNie == 8) {
            label.setText("Daj mi spokoj");
        } else if (liczbaKlikniecNie >= 9) {
            label.setText("HUH");
            ImageIcon gifIcon = new ImageIcon("D:\\SpringApplicationDobre\\walentynki\\src\\huh-cat-huh-m4rtin.gif");
            imageLabel.setIcon(gifIcon);
            imageLabel.setBounds(500,200,500,500);
        }
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new Strona();
    }
}
