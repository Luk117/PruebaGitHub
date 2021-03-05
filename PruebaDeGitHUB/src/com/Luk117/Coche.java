package com.Luk117;

public class Coche {
    //atributes
    String color;
    String brand;
    int km;
    //Metodo
    public static void main(String[] args){
        Coche coche1 = new Coche();

        coche1.color = "Rojo";
        coche1.brand = "AUDI";
        coche1.km = 0;

        System.out.println("El coolor del coche 1 es: "+ coche1.color);
        System.out.println("La marca del coche es:"+ coche1.brand);
        System.out.println("El km del auto es: "+ coche1.km);

        Coche coche2 = new Coche();
        coche2.color = "Gris";
        coche2.brand = "Mercedes";
        coche2.km = 52;

        System.out.println("El color del coche 2 es:" + coche2.color);
        System.out.println("La marca del coche es:"+ coche2.brand);
        System.out.println("El km del auto es: "+ coche2.km);


    }

}
