import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"provider.xml"});

        context.start();
        try {
            System.in.read();
            System.out.println("the provider is running!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
