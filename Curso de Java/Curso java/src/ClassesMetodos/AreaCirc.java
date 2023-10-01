package ClassesMetodos;

public class AreaCirc {

    double raio;
    static final double PI = 3.14;

    AreaCirc(double raio){
        this.raio = raio;
    }

    // se fosse um método static, poderiamos chamar em algum script apenas como CalcAreaCirc(raio) e passando um raio
     double CalcAreaCirc(){
        return PI * Math.pow(raio, 2);
    }

}
