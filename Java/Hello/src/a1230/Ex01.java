package a1230;

public class Ex01 {
    public static void main(String[] args) {
        System.out.println("\n--- 복합 연산 예제 ---");
        int score1 = 85;
        int score2 = 90;
        int score3 = 78;
        // 1. 각 점수를 화면에 나타내시오.
        // 2. 총점과 평균을 구하시오.
        // 3. 60점 이상이면 합격(true)
        // 4. 평균 90 이상이면 우수(true)
        System.out.println("score1 : " + score1 + " score2 : " + score2 + " score3 : " + score3);
        
        int sum = score1 + score2 + score3;
        double avg = (double)sum/3;

        boolean isPass = avg >= 60;
        System.out.println(isPass);

        System.out.println("총점 " + sum + " 평균 " + avg);
        if (avg >= 90){
            System.out.println("우수");
        } else if (avg >= 60){
            System.out.println("합격");
        }
    }
}
