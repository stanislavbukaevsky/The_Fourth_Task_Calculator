package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String hello() {
        return "hello";
    }

    public String answerHello(String userName) {
        return "hello " + userName;
    }
}
