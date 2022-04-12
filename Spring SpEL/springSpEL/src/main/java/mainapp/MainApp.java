package mainapp;

import beans.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Demo demo=context.getBean("demo",Demo.class);
        System.out.println(demo);

//        ExpressionParser parser=new SpelExpressionParser();
//        Expression expression=parser.parseExpression("20+80");
//        System.out.println(expression.getValue().toString());

    }
}
