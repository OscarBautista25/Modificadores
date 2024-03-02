package Modificador2;

import Modificador1.Padre;

public class HijaMod2 extends Padre{

    public HijaMod2(int entero, String texto) {
        super(texto);
        
    }
    public static void main(String[] args) {
        System.out.println(Padre.entero);
    }
    
}
