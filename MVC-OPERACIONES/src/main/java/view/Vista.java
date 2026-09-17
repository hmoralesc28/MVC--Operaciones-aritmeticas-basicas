package view;

import javax.swing.*;

public class Vista extends JFrame {

    public JPanel panelPrincipal;
    public JTextField textNumeroUno;
    public JLabel lblOperador;
    public JTextField textNumeroDos;
    public JButton btnMultiplicar;
    public JTextField textResultado;
    public JButton btnRestar;
    public JButton btnSumar;
    public JButton btnDividir;

    public Vista() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        textResultado.setEditable(false);
    }
}