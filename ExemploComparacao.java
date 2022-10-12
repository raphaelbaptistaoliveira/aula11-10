public class ExemploComparacao {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        
        System.out.println(x == y); // true or false???
        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x < y);
        System.out.println(x >= y);
        System.out.println(x <= y);
        System.out.println("== Operações Lógicas==");
        boolean a = true;
        System.out.println(a && true && 3 < 8);

        boolean vaiTerAula; //??
        boolean diaSemana = true;
        boolean naoFeriado = false;
        vaiTerAula = diaSemana && naoFeriado;
        System.out.println();
    }
}
