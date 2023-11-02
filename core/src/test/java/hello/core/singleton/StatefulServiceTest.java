package hello.core.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.assertj.core.api.Assertions.*;

class StatefulServiceTest {


    @Test
    void statefulServiceSingleton() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfig.class);
        StatefulService statefulService = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        //ThreadA: A사용자 10000원 주문
//        statefulService.order("userA", 10000);
        int userAPrice = statefulService.order("userA", 10000);
        //ThreadB: B사용자 20000원 주문
//        statefulService.order("userA", 20000);
        int userBPrice = statefulService.order("userB", 20000);


        //ThreadA: 사용자A 주문 금액 조회
//        int price = statefulService.getPrice();
        System.out.println("price = " + userAPrice);

//        assertThat(statefulService.getPrice()).isEqualTo(20000);
    }

    static class TestConfig {

        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }
    }

}