package a0102;

public class Ex2 {
    public static void main(String[] args) {
        int evenSum = 0; // 짝수 합
        int oddSum = 0;  // 홀수 합

        // for문을 이용하여 반복 합계 연산
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0) {       // 짝수라면
                evenSum += i;      // 짝수 합에 더하기
            } else {               // 홀수라면
                oddSum += i;       // 홀수 합에 더하기
            }
        }

        System.out.println("짝수의 합계는 " + evenSum);
        System.out.println("홀수의 합계는 " + oddSum);
    }
}

