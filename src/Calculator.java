//10.15 LV2 시작

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//1. 사칙연산 수행 후, 결과값 반환하는 메서드 구현
//2. 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성
//3. 0을 포함한 양의 정수 2개와 연산 기호를 매개변수로 받아 사칙연산 수행
//4. 이후 결과값을 반환하는 메서드와
//10.16 추가 작업 내용

//10.17 완성내용
// 5. 연산결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성 v
// 6. 연산 결과는 calculator 클래스의 연산 결과를 저장하는 필드에 저장 v
// 7. /App(현재 Main) 클래스의 main 메서드에서 calculator 클래스의 연산결과를 저장하고있는 컬렉션 필드에 직접 접근못하게 수정 v
// 8. calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드 활용 [?] // 메인메서드에서 활용하지 않음. 하지만 이게 더 기능이 좋은듯?

public class Calculator {

    Collection collection = new Collection();

    //인자값을 받아서, try-catch 로 정수일 경우에만 리턴해주기.
    public int setInt(Scanner sc) {
        System.out.println(collection.getSaveResult());
        int a = 0;
        while(true){
            System.out.print("정수를 입력해주세요 : ");
            try{
                a = sc.nextInt();
                if(a<0){
                    System.out.println("0혹은 양의 정수를 입력해주세요.");
                    continue;
                }
                break;
            }
            catch(InputMismatchException e){
                System.out.println("숫자가 아닌 값은 들어올 수 없습니다.");
                sc.nextLine();
            }
        }
        return a;
    }
    // 인자값을 받아서, try-catch 로 사칙연산일 경우에만 리턴해주기
    public String setString(Scanner sc){
        System.out.print("사칙연산 기호를 입력하세요 (+ - * /): ");
        String str;
        while(true){
            try{
                str = sc.next();
                if(str.equals("+")||str.equals("-")||str.equals("*")||str.equals("/")){
                    break;
                }
                else{
                    System.out.println("사칙연산 기호를 입력해주세요 (+ - * /). 이외 글자들은 입력할 수 없습니다.");
                }
            }
            catch(InputMismatchException e){
                System.out.println("사칙연산 기호를 입력해주세요. 숫자는 입력할 수 없습니다.");
                sc.nextLine();
            }
        }
        return str;
    }

    // 나눗셈일 경우 분모가 0인지 아닌지 감지하기
    public boolean divideCheck(int a, int b, String c){
        if(("/").equals(c) && b==0) {
            return false;
        }
        return true;
    }

    // exit 일 경우 종료, del 일 경우 collection 첫번째 배열 삭제, 아닐경우 계속하기
    public boolean controlCalcul(Scanner sc){
        System.out.println("프로그램을 종료하려면 exit, 저장된 배열의 첫번째 값을 삭제하려면 del, 아니면 아무 키를 입력하세요.");
        String result = sc.next();
        if("exit".equals(result)){
            System.out.println("프로그램을 종료합니다.");
            return false;
        }
        else if("del".equals(result)){
            collection.setDeleteSaveResult(deleteFirstArray(collection.getSaveResult()));
        }
        sc.nextLine();
        return true;
    }

    //첫번째 컬렉션 배열 삭제 기능
    public ArrayList<Integer> deleteFirstArray(ArrayList<Integer> list){
        if(!list.isEmpty()){
           list.remove(0);
        }
        return list;
    }

    /**
     *
     * @param a;
     * @param b;
     * @param c;
     * @return result;
     */
    public int calculate(int a, int b, String c) {
        int result = 0;
        switch (c) {
            case "+": result = a + b;
               break;
            case "-": result = a - b;
                break;
            case "*": result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            default:
                return 0;
        }
        collection.setSaveResult(result);
        return result;
    }
}
