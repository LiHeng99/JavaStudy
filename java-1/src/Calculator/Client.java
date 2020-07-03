package Calculator;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要进行的运算：");
        Operation opec = OperationFactory.createOperation(sc.next());
//        opec.setNumberA(1);
//        opec.setNumberB(2);
        System.out.println("请输入NumberA：");
        opec.setNumberA(sc.nextDouble());

//        opec = OperationFactory.createOperation(sc.next());
        System.out.println("请输入NumberB：");
        opec.setNumberB(sc.nextDouble());


        System.out.println("计算结果是：");
        System.out.println(opec.getResult());
    }
}
