//10.15 LV2 시작

//1. 사칙연산 수행 후, 결과값 반환하는 메서드 구현
//2. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성
//3. 0을 포함한 양의 정수 2개와 연산 기호를 매개변수로 받아 사칙연산 수행
//4. 이후 결과값을 반환하는 메서드와 연산결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성
public class Calculator {
    public int calculate(int a, int b,String c) {
        switch (c){
            case "+": System.out.println(a+b);
                break;
            case "-" : System.out.println(a-b);
                break;
            case "*" : System.out.println(a*b);
                break;
            case "/" :
                if(b==0){
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                }
                System.out.println(a/b);
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }
    }
}
