public class App {
    public static void main(String[] args) throws Exception {
        utilizando_static();

        //Instancia de um objeto
        Veiculo v = new Veiculo();
        Veiculo v1 = new Veiculo();

        //Chamando variaveis públicas
        v.marca= "Ford";
        v.modelo = "Ka";

        v1.marca = "Fiat";
        v1.modelo = "Marea";

        final String teste_final;
        teste_final = "Meu primeiro valor";
        //teste_final = "Meu segundo valor";
    }

    public static void utilizando_static(){
        //Chamando variaveis sem instância
        Produto.inteiro1 = 10;
        Produto.inteiro2 = 20;
    }

    public void conversao(){
        String st, st2,st3;
        float real, real2;
        int inteiro, inteiro2;

        //inteiro para real
        st = "1.2";
        real = Float.parseFloat(st);
        System.out.println("String para Real:" + real);

        //String para Real
        real2 = 1.3f;
        st2 = Float.toString(real2);
        System.out.println("Real para String:" + st2);

        st3 = "15";
        inteiro = Integer.parsInt(st3);
        System.out.println("String para inteiro:" + inteiro);

        //inteiro para string
        inteiro2 = 25;
        String st4 = Integer.toString(inteiro2);
        System.out.println("Inteiro para string:" + st4);
    }
}
