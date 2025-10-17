import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//LV2 추가 구현내용
//연산 수행 역할은 calculator 클래스가 담당
//연산 결과는 calculator 클래스의 연산 결과를 저장하는 필드에 저장
//App(현재 Main) 클래스의 main 메서드에서 calculator 클래스의 연산결과를 저장하고있는 컬렉션 필드에 직접 접근못하게 수정
//calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에
//삭제 메서드가 활용될 수 있도록 수정
//10/17 연산자 입력받는 부분 메소드로 분리 후 예외처리 추가하기 - 완료
public class Main {

    public static void main(String[] args) {
        // 프로그램 구동에 필요한 변수, 인스턴스 선언
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();  //1. 생성자를 빈값으로 호출하거나. 2. 이미 호출할때 파라미터가 빈값이거나.
        int a = 0;
        int b = 0;
        String c;
        int result = 0;
        boolean controller = true;
        // 프로그램 구동에 필요한 변수, 인스턴스 선언

        // controller 로 종료하지 않는 한 반복됨
        while(controller){
            a = calculator.setInt(sc);
            c = calculator.setString(sc);
            b = calculator.setInt(sc);
            //리절트가 뭔지 검증을 더 해보는 구문...
            boolean divideChk = calculator.divideCheck(a,b,c);
            if(!divideChk){
                System.out.println("0으로 나눌 수 없습니다. 처음으로 되돌아갑니다.");
                continue;
            }
            result = calculator.calculate(a, b, c);
            System.out.println("연산결과 : "+result);
            controller = calculator.controlCalcul(sc);
        }
    }
}
