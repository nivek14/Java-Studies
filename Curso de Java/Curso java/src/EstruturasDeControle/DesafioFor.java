package EstruturasDeControle;

public class DesafioFor {

    public static void main(String[] args) {
        String s = "#";
        for (;s.length() < 6;){
            System.out.println(s);
            s += "#";
        }
    }

}
