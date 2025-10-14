import java.util.Scanner; public class Main {
    public static void main(String[] args)
    {
        boolean exit = true;
        Integer a = 0;
        Integer b = 0;
        while(exit)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("계산할 정수를 입력하세요");
            if(!sc.hasNextInt() && a>0)
            { System.out.println("첫번째 인자값에 0 이상의 정수를 입력해주세요. 처음으로 되돌아갑니다");
                continue;
            }
            else{
                a=sc.nextInt();
            }
            System.out.print("계산할 정수를 입력하세요");
            if(!sc.hasNextInt() && b>0){
                System.out.println("두번째 인자값에 0 이상의 정수를 입력해주세요. 처음으로 되돌아갑니다");
                continue;
            }
            else{
                b = sc.nextInt();
            }
            System.out.print("계산에 필요한 연산자를 입력하세요 실행을 종료하려면 'exit' 를 입력하세요");
            String c = sc.next();
            if(c.equals("exit")){
                exit = false;
            }
            else{
                switch (c){
                    case "+": System.out.println(a+b); break;
                    case "-" : System.out.println(a-b); break;
                    case "*" : System.out.println(a*b); break;
                    case "/" : System.out.println(a/b); break;
                    default: System.out.println("잘못된 연산자 입니다.");
                    break;
                }
            }
        }
    }
}