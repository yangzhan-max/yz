package com.graduation.chen.stuems;

        import org.mybatis.spring.annotation.MapperScan;
        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan(basePackages = "com.graduation.chen.stuems.dao")
public class StuemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StuemsApplication.class, args);
    }

}
