//sobrecarga por numero de argumentos
package Lunes;

class Add{
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
public class TestOverLoad {
    public static void main(String[] args) {
        System.out.println(Add.add(11,11));
        System.out.println(Add.add(11,11,111));
    }
}
