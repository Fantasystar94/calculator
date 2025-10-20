public enum OperatorType{
    // 속
    ADD("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/");
    private final String symbol;
    //생
    OperatorType(String symbol){
        this.symbol = symbol;
    }

    //기
    public String getSymbol(){
        return symbol;
    }

    public static OperatorType fromSymbol(String symbol){
        for(int i=0;i<OperatorType.values().length;i++){
            if(OperatorType.values()[i].getSymbol().equals(symbol)){
                return OperatorType.values()[i];
            }
        }
        throw new IllegalArgumentException("잘못된 연산자 기호입니다: " + symbol);
    }
}