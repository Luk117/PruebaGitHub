package com.Luk117;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        Operations op = new Operations();

        System.out.println("La Suma es: "+ op.sum(n1,n2));
        System.out.println("La Suma es: "+ op.rest(n1,n2));
        System.out.println("La Suma es: "+ op.mult(n1,n2));
        System.out.println("La Suma es: "+ op.div(n1,n2));





    }
}
