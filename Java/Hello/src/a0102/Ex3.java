package a0102;

public class Ex3 {
    public static void main(String[] args) {
        for (int x = 1; x <= 6; x++) {       // 첫 번째 주사위
            for (int y = 1; y <= 6; y++) {   // 두 번째 주사위
                if (x + y == 6) {            // 두 눈의 합이 6이면
                    System.out.println("(" + x + ", " + y + ")");
                }
            }
        }
    }
}

