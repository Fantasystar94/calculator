import java.util.ArrayList;

public class TypeOfNumbers {
    //속성
    private Number value;
    private String typeofNumber;
    //생성자
    public TypeOfNumbers(Number value, String typeofNumber) {
        this.value = value;
        this.typeofNumber = typeofNumber;
    }
    //기능
    public Number getValue() {
        return value;
    }
    public void setValue(Number value) {
        this.value = value;
    }
    public String getTypeofNumber() {
        return typeofNumber;
    }


    public void setTypeofNumber(String typeofNumber) {
        this.typeofNumber = typeofNumber;
    }

    @Override
    public String toString() {
        return "값: " + value + ", 타입: " + typeofNumber;
    }

}
