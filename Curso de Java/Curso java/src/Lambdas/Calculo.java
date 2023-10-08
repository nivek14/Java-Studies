package Lambdas;


@FunctionalInterface
// interface funcional possui apenas um método abstrato
public interface Calculo {

    double executar(double a, double b); // método abstrato
    default String padrao(){return "classe padrao";};

}
