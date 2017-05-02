/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcvinny;

/**
 *
 * @author Vinny
 */
import javax.swing.JOptionPane;
 public class Calculadora { public static void main(String[] args){ 
     double a;
     double b;
     String operacao;
     double resultado;
     double i=0;
     a = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro Numero: "));
     while (i==0){ operacao = JOptionPane.showInputDialog("Informe a operação Desejada: " );
     b = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo Numero: "));
     if (operacao.equals("+")) {
         resultado = a + b;
         JOptionPane.showMessageDialog(null,"O resultado e :" +resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
         a = resultado; } 
     if (operacao.equals("-")) { 
         resultado = a - b;
         JOptionPane.showMessageDialog(null,"O resultado e :" +resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
         a = resultado; } 
     if (operacao.equals("*")) {
         resultado = a * b;
         JOptionPane.showMessageDialog(null,"O resultado e :" +resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE);
         a = resultado; }
     if (operacao.equals("/")) {
         resultado = a / b;
         JOptionPane.showMessageDialog(null,"O resultado e :" +resultado,"Resultado", JOptionPane.INFORMATION_MESSAGE); } } } }
