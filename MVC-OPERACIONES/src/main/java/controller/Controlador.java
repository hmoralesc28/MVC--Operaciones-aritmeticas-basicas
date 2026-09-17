package controller;

import model.Modelo;
import view.Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {

    private Vista view;
    private Modelo model;

    public Controlador(Vista view, Modelo model) {

        this.view = view;
        this.model = model;


        this.view.btnMultiplicar.addActionListener(this);
        this.view.btnSumar.addActionListener(this);
        this.view.btnRestar.addActionListener(this);
        this.view.btnDividir.addActionListener(this);

    }

    public void iniciar() {

        view.setTitle(" Calculadora -- Operaciones Bàsicas ");
        view.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e) {


        model.setNumeroUno(Integer.parseInt(view.textNumeroUno.getText()));
        model.setNumeroDos(Integer.parseInt(view.textNumeroDos.getText()));


        if (e.getSource() == view.btnMultiplicar) {
            view.lblOperador.setText("x");
            model.multiplicar();
        } else if (e.getSource() == view.btnSumar) {
            view.lblOperador.setText("+");
            model.sumar();
        } else if (e.getSource() == view.btnRestar) {
            view.lblOperador.setText("-");
            model.restar();
        } else if (e.getSource() == view.btnDividir) {
            view.lblOperador.setText("/");

            if (Integer.parseInt(view.textNumeroDos.getText()) == 0) {
                view.textResultado.setText("No se puede /0");
                return;
            }
            model.dividir();

        }

        java.text.DecimalFormat df = new java.text.DecimalFormat("#.###");
        view.textResultado.setText(String.valueOf(df.format(model.getResultado())));

    }
}