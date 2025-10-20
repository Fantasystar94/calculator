import java.util.ArrayList;
import java.util.Collection;

public class ArithmeticCalculator {
    //10.20 추가기능 구현. 배열에 객체를 넣어 정수형 or 실수형 숫자타입, String 으로 정수인지 실수인지 담는 ArrayList 생성
    private ArrayList<TypeOfNumbers> typeOfNumbers = new ArrayList<>();

    public ArrayList<TypeOfNumbers> getCollection() {
        return typeOfNumbers;
    }
    public <T extends Number> Number calculate(double value1, double value2, String c) {
        Number result = 0;
        String typeofNumber = "";
        OperatorType operator = OperatorType.fromSymbol(c);
        switch (operator) {
            case ADD:
            result = value1 + value2;
            break;
            case MINUS:
            result = value1-value2;
            break;
            case MULTIPLY:
            result = value1*value2;
            break;
            case DIVIDE:
            result = value1/value2;
            break;
            default:
        }
        if(result.doubleValue() % 1 == 0){
            result = result.intValue();
            typeofNumber = "정수형";
        }else{
            result = result.doubleValue();
            typeofNumber = "실수형";
        }
        typeOfNumbers.add(new TypeOfNumbers(result,typeofNumber));
        return result;

    }

    public ArrayList<TypeOfNumbers> deleteFirstArray() {
        if (!this.typeOfNumbers.isEmpty()){
            this.typeOfNumbers.remove(0);
        }
        return this.typeOfNumbers;
    }
    //입력받은 값보다 큰 결과값 출력
    public void biggerThanInputs(int a) {
        int number = a;
        this.typeOfNumbers.stream()
                .filter(typeOfNumbers1 -> typeOfNumbers1.getValue().intValue()>number)
                .forEach(typeOfNumbers1 -> System.out.println(typeOfNumbers1.getValue()));
    }

}
