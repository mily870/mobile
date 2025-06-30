package aula;

public class App {
    public static void main(String[] args) {
        int a;
        String b;

        a=14;
        b= (a>14)? "atrasado" : (a<14)? "adiantado" : "no horário";
        System.out.println("resultado " + b);
    }
}