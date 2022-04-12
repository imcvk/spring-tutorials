package Interfaces;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Interfaces_In_SpEL {
    public static void main(String[] args) {
        ExpressionParser parser=new SpelExpressionParser();

        //parse plaintext
        Expression expression1=parser.parseExpression("'First Expression'");
        System.out.println(expression1.getValue().toString());

        //expression to invoke method
        Expression expression2=parser.parseExpression("'Expression to call method'.concat('!!!!!!')");
        System.out.println(expression2.getValue().toString());


    }
}
