package a1231;

public class If4_1 {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;
        int c = 70;
        int max = 0;

        if(a >= b && a >= c){
            System.out.println("가장 큰 수는 a");
        }else if(b >= a && b >= c){
            System.out.println("가장 큰 수는 b");
        }else{
            System.out.println("가장 큰 수는 c");
        }
    }
}
