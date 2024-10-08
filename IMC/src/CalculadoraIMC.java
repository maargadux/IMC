import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculadora de IMC");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelPeso = new JLabel("Peso (kg):");
        JTextField txtPeso = new JTextField(5);

        JLabel labelAltura = new JLabel("Altura (m):");
        JTextField txtAltura = new JTextField(5);

        JLabel labelResultado = new JLabel("Resultado:");
        JTextField txtResultado = new JTextField(10);
        txtResultado.setEditable(false);

        JButton btnCalcular = new JButton("Calcular IMC");

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double peso = Double.parseDouble(txtPeso.getText());
                double altura = Double.parseDouble(txtAltura.getText());
                double imc = peso / (altura * altura);

                String resultado;
                if (imc < 18.5) {
                    resultado = "Abaixo do peso";
                } else if (imc >= 18.5 && imc < 24.9) {
                    resultado = "Peso normal";
                } else if (imc >= 25 && imc < 29.9) {
                    resultado = "Sobrepeso";
                } else {
                    resultado = "Obesidade";
                }
                txtResultado.setText(resultado);
            }
        });

        JPanel panel = new JPanel();
        panel.add(labelPeso);
        panel.add(txtPeso);
        panel.add(labelAltura);
        panel.add(txtAltura);
        panel.add(btnCalcular);
        panel.add(labelResultado);
        panel.add(txtResultado);

        frame.add(panel);
        frame.setVisible(true);
    }
}
