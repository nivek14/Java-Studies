package EstruturasDeControle;

public class EstruturaSwitch {

    public static void main(String[] args) {

        String s = "metal";

        switch (s.toLowerCase()){
            case "rock":
                System.out.println("bom");
                break;
            case "jazz":
                System.out.println("bom");
                break;
            default:
                System.out.println("ruim");
                break;
        }

        // rotulando um laço e quebrando o for externo rotulado (prática ruim, evitar a utilização)
        externo: for(int i = 0; i < 5; i++){
            for(int j = 0; i< 5; j++){
                if(j == 3) break externo;
                System.out.println("ainda no laço");
            }
        }

    }

}
