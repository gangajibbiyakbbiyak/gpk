package a1231;

public class If4 {
    public static void main(String[] args) {
        int a = 80;
        int b = 90;
        int c = 70;
        if(a > b){
            if(a>c){
                System.out.println("가장 큰 수는 a 입니다");
            }else{
                System.out.println("c가 가장 큰 수 입니다.");
            }
        }else if(b>c){
            System.out.println("가장 큰 수는 b 입니다.");
        }else{
            System.out.println("가장 큰 수는 c 입니다");
        }
    }
}
