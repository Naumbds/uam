package app;
import java.util.Scanner;

public class App {
    static double rad(double a){
        return (Math.toRadians(a));
    }
    static double sen(double b){
        return (Math.sin(b));
    }
    static double sen2(double c){
        return (Math.pow(Math.sin(c), 2));
    }
    static double cos (double d){
        return (Math.cos(d));
    }
    static double SenXCos (double e){
        return ((Math.sin(e))*(Math.cos(e)));
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
        System.out.println("Anhembi Morumbi Atividade A2" + "\n" + "Sistemas de Informação Noturno - Exercício 1 \n" + "Bruno Sales Bernardes RA - 21395652 \n" + 
                "Gabriel Sanchez Vieira RA -" + " 21471825" + "\n" + "Naum Borges da Silva RA - 21366455 \n");
        
        System.out.println("Digite o valor do ângulo!");
        double x = scan.nextDouble();
        double y = (Math.toRadians(x));
        
        System.out.println(x + "° = " + rad(x) + "rad");
        System.out.println("sen " +x+ "°= " + sen(y));
        System.out.println("sen " +x+ "°²= " + sen2(y));
        System.out.println("cos " +x+ "°= " + cos(y));
        System.out.println("sen " +x+ "° * cos "+x+ "° = " + SenXCos(y));
    }
}