//TODO 5. 연산결과를 저장하는 컬렉션 타입 필드를 가진 클래스 생성 [v] //10.17 완료
//TODO 6. 연산 결과는 calculator 클래스의 연산 결과를 저장하는 필드에 저장 [v] //10.17 완료
//TODO 7. App(현재 Main) 클래스의 main 메서드에서 calculator 클래스의 연산결과를 저장하고있는 컬렉션 필드에 직접 접근못하게 수정 [v] //10.17 완료
//TODO 8. calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드 활용

import java.util.ArrayList;

public class Collection {
    private ArrayList<Integer> saveResult = new ArrayList<>();

    // setter. 계산이 끝날때마다 컬렉션에 추가
    public void setSaveResult(int a){
        this.saveResult.add(a);
    }

    // 첫번째 배열 삭제하는 메소드
    public void setDeleteSaveResult(ArrayList<Integer> list){
        this.saveResult = list;
    }

    // getter. 컬렉션 값 가져오기
    public ArrayList<Integer> getSaveResult(){
        return this.saveResult;
    }
}
