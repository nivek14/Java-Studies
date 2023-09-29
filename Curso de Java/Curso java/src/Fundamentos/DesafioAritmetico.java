package Fundamentos;

import java.util.Scanner;

public class DesafioAritmetico {

    static double var1, var2, var3, var4, var5, var6, var7, finalCalc;

    public static void main(String[] args) {
        GetVariables();
        MainCalc();
        ShowResult();
    }

    public static void GetVariables(){
        Scanner scanner = new Scanner(System.in);
        var1 = scanner.nextDouble();
        var2 = scanner.nextDouble();
        var3 = scanner.nextDouble();
        var4 = scanner.nextDouble();
        var5 = scanner.nextDouble();
        var6 = scanner.nextDouble();
        var7 = scanner.nextDouble();
        scanner.close();
    }

    public static void MainCalc(){

        double left = 0, right = 0;

        left = LeftCalc(left);
        right = RightCalc(right);

        finalCalc = Math.pow((left - right), 3) / Math.pow(var7, 3);

    }

    public static double LeftCalc(double left){
        left = Math.pow((var1 * (var2 + var3)), 2) / (var2 * var3);
        return left;
    }

    public static double RightCalc(double right){
        right = Math.pow(((var4 - var5) * (var3 - var6)), 2) / 2;
        return right;
    }

    public static void ShowResult(){
        System.out.println(Math.abs(finalCalc));
    }

}
