package a1231;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하십시오.");
        String name = sc.next(); // 문자열 입력(한단어)
        // 한 줄 전체입력 (공백포함) sc.nextLine();
        // char ch = sc.next().charAt(0); -> 문자 1개 입력받기

        System.out.print("나이를 입력하십시오.");
        int age = sc.nextInt();
        // Double avg = sc.nextDouble(); -> 실수 입력
        System.out.println(name + "님의 나이는 " + age + "세 입니다.");

        sc.close();
    }
}
