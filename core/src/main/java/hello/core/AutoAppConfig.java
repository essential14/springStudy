package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
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
    //자동 등록보다 수동 등록이 우선권을 가짐 (이름이 중복이어도 수동 빈이 자동 빈을 오버라이딩 하는 것 (부트에서는 오류 발생)
    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
