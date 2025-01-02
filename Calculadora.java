public class Calculadora {
    public static void main(String[] args) {
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt((args[2]));

    if(args[0].equals("somar")){
        soma(x, y);
    }else if (args[0].equals("subtrair")){
        menos(x, y);
    } else if (args[0].equals("dividir")) {
        divide(x, y);
    }else if (args[0].equals("multiplicar")){
        multiplica(x, y);
        }
    }

    static void soma(int x, int y){
        System.out.println(x + y);
    }
    static void menos(int x, int y){
        System.out.println(x - y);
    }
    static void divide(int x, int y){
        System.out.println(x / y);
    }
    static void multiplica(int x, int y){
        System.out.println(x * y);
    }

        }

