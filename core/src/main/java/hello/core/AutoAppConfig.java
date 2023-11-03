package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        //scan 시작 위치 설정 (core 하위 패키지를 스캔 한다는 뜻)
        //지정하지 않는다면 @ComponentScan 이 쓰여 있는 클래스의 패키지가 디폴트로 정해짐
        basePackages = "hello.core",
        //scan 에서 제외할 것을 설정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

}
