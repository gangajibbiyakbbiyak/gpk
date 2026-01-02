package a0102;

public class Ex1 {
    public static void main(String[] args) {
        // 111p. 1, 2, 3, 6 // 곱하기 가로로 출력하기
     
        // for 문을 이용하여 반복 합계 연산
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {  // 5의 배수인지 확인
                sum += i;
            }
        }
        System.out.println("1~100까지 5의 배수 합: " + sum);

    }
}
