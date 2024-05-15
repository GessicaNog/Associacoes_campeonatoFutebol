package com.mycompany.associacoes_campeonatofutebol;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EntradaSaida {

    public static int lerInteiro(String titulo, String mensagem) {
        JFrame frame = new JFrame(titulo);

        String opcaoDigitada = JOptionPane.showInputDialog(frame, mensagem,
                titulo, 
                JOptionPane.INFORMATION_MESSAGE);
        try {
            int numberInt = Integer.parseInt(opcaoDigitada);
            return numberInt;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
    public static double lerDouble(String titulo, String mensagem) {
        JFrame frame = new JFrame(titulo);

        String opcaoDigitada = JOptionPane.showInputDialog(frame, mensagem,
                titulo, 
                JOptionPane.INFORMATION_MESSAGE);
        try {
            double numberDouble = Double.parseDouble(opcaoDigitada);
            return numberDouble;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
    
    public static String lerString(String titulo, String mensagem) {
        JFrame frame = new JFrame(titulo);

        String digitado = JOptionPane.showInputDialog(frame, mensagem,
                titulo, 
                JOptionPane.INFORMATION_MESSAGE);
       return digitado;
    }

    public static void exibirMensagem(String mensagem) {
        JFrame frame = new JFrame("MENSAGEM");

        JOptionPane.showMessageDialog(frame, mensagem,
                "MENSAGEM",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
