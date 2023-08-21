package Lección2;

public class CicloWhile {
    public static void main(String[] args) {
        var conteo = 0; // inferencia de tipos
        while (conteo <= 3){
            System.out.println("conteo = "+ conteo);
            conteo++;
        }
        var contador = 0;
        do {
            System.out.println("contador = "+ contador);
            contador++;
        } while(contador < 4);
        for(var i = 0; i <= 7; i++){
            System.out.println("contando = "+ i);
        }
    }
}
