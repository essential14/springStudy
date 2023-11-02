package hello.core.singleton;

public class SingletonService {

    // static 영역에 하나만 생성
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
    // getinstance() 메서드를 통해서만 조회할 수 있음
        return instance;
    }

    // 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다. (진짜 사용 불가능)
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
