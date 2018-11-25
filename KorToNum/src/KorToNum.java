import java.util.Scanner;

public class KorToNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = {'일', '이', '삼', '사', '오', '육', '칠', '팔', '구'};
        char ten = '십';

        System.out.println("수 이름을 입력하세요");
        String numName = sc.nextLine();
        numName = numName.replaceAll(" ", ""); //공백을 지웁니다.

        int length = numName.length();

        switch (length) {
            case 1:
                for (int i = 0; i < num.length; i++) {
                    if (numName.charAt(0) == (num[i])) {
                        System.out.println(i + 1);
                        break;
                    } else if (numName.charAt(0) == '십') {
                        System.out.println(10);
                        break;
                    }
                }
                break;
            case 2:
                if (numName.charAt(0) == '십') {
                    for (int i = 0; i < num.length; i++) {
                        if (numName.charAt(1) == (num[i])) {
                            System.out.println(10 + i + 1);
                        }
                    }
                } else {
                    System.out.println("예상치 못한 범위 혹은 잘못 입력 하셨습니다");
                    break;
                }
                break;

            case 3:
                int a = 0;
                int c = 0;
                boolean check = true;
                for (int i = 0; i < num.length; i++) {
                    if (numName.charAt(1) == '십') {
                        if (numName.charAt(0) == (num[i])) {
                            a = i + 1;
                        }

                        if (numName.charAt(2) == num[i]) {
                            c = i + 1;
                        }
                    } else {
                        System.out.println("예상치 못한 범위 혹은 잘못 입력 하셨습니다");
                        check = false;
                        break;
                    }
                }
                if (check == true) {
                    System.out.println(a * 10 + c);
                }
                break;
            default:
                System.out.println("예상치 못한 범위 혹은 잘못 입력 하셨습니다");
        }

    }


}
