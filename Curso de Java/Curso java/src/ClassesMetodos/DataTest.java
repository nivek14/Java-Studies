package ClassesMetodos;

public class DataTest {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data("30", "09", "2023");
        System.out.println(data1.FormatarData());
        System.out.println(data2.FormatarData());
    }
}
