package a1231;

import java.util.Scanner;
// import : 외부 클래스인 Scanner 불러옴.
public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = sc.nextInt();

        boolean leapYear = ((year%4==0 && year % 100 != 0) || year % 400 == 0);
        System.out.println(leapYear);

        if(leapYear){
            System.out.println("윤년입니다.");
        } else {
            System.out.println("윤년이 아닙니다.");
        }
    }
}
