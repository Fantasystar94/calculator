import java.util.Scanner;

//LV2 추가 구현내용
//연산 수행 역할은 calculator 클래스가 담당
//연산 결과는 calculator 클래스의 연산 결과를 저장하는 필드에 저장
//App(현재 Main) 클래스의 main 메서드에서 calculator 클래스의 연산결과를 저장하고있는 컬렉션 필드에 직접 접근못하게 수정
//calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에
//삭제 메서드가 활용될 수 있도록 수정
//Todo. 10/17 연산자 입력받는 부분 메소드로 분리 후 예외처리 추가하기
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();  //1. 생성자를 빈값으로 호출하거나. 2. 이미 호출할때 파라미터가 빈값이거나.
        int a = 0;
        int b = 0;
        boolean exit = true;
        while (exit) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            a = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            b = sc.nextInt();
            if (a < 0 || b < 0) {
                System.out.println("0 혹은 양의 정수를 입력해주세요");
                continue;
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            String c = sc.next();
            int result = calculator.calculate(a, b, c);
            //리절트가 뭔지 검증을 더 해보는 구문...
            System.out.println(result);
            c = sc.next();

            if(c.equals("exit")){
                exit = false;
                break;
            }

        }
    }
}
