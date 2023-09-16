public class OlaMergulhador {

    public static void main(String[] args) {

        System.out.println("Olá, mergulhador");

        String nomeCompleto = "José Sebastião";
        //nomeCompleto = "João da Silva";

        System.out.println("Nome: " +nomeCompleto);

        int minhaIdade = 41;
        int suaIdade = 25;
        int totalIdades = minhaIdade + suaIdade;

        System.out.println(totalIdades);

        double peso = 84.9d;

        System.out.println(peso);

        float taxa = 1_294.93f;

        boolean compraAprovada = false;
        System.out.println(compraAprovada);

        boolean maiorDeIdade = minhaIdade > 18;
        System.out.println(maiorDeIdade);

        double cortisol = 18.6;

        boolean resultadoNormal = cortisol >= 6.00 && cortisol <= 18.4;
        boolean resultadoAnormal = !resultadoNormal;

        System.out.println("Cortisol normal: " + resultadoNormal);
        System.out.println("Cortisol anormal: " + resultadoAnormal);

        if(cortisol >= 6 && cortisol <= 18.4){
            System.out.println("Cortisol normal");
        }else if (cortisol > 18.4){
            System.out.println("Cortisol alto");
        }else {
            System.out.println("Cortisol baixo");
        }


    }
}
