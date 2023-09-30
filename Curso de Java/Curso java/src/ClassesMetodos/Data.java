package ClassesMetodos;

public class Data {
    String dia;
    String mes;
    String ano;

    Data(){
        this.dia = "01";
        this.mes = "01";
        this.ano = "1970";
    }

    Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String FormatarData(){
        return dia + "/" + mes + "/" + ano;
    }
}
