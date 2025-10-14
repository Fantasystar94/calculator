import java.util.Scanner; public class Main {
    public static void main(String[] args)
    { Scanner sc = new Scanner(System.in);
        int a=0; int b=0;
        boolean exit = true;
        while(exit) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a =sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b= sc.nextInt();
            if(a<0 || b<0){
                System.out.println("0 혹은 양의 정수를 입력해주세요");
                continue;
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            String c = sc.next();
            switch (c)
            {
                case "+": System.out.println(a+b);
                break;
                case "-" : System.out.println(a-b);
                break;
                case "*" : System.out.println(a*b); break;
                case "/" : if(b==0){ System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                System.out.println(a/b); break;
                default: System.out.println("잘못된 연산자 입니다.");
                break;
            }
            System.out.println("종료하시려면 exit를 입력해주세요 계속 하시려면 아무키나 입력하세요");
            String d = sc.next();
            if(d.equals("exit")){
                exit = false;
                break;
            }
        }
    }
}