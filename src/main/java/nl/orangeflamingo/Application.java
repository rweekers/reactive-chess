package nl.orangeflamingo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan
public class Application {

    @Bean
    BoardService mockMessageService() {
        return new BoardService() {
            public String getBoard() {
                return "8|-|-|-|-|-|-|-|-|\n" +
                        "7|-|-|-|-|-|-|-|-|\n" +
                        "6|-|-|-|-|-|-|-|-|\n" +
                        "5|-|-|-|-|-|-|-|-|\n" +
                        "4|-|-|-|-|-|-|-|-|\n" +
                        "3|-|-|-|-|-|-|-|-|\n" +
                        "2|-|-|-|-|-|-|-|-|\n" +
                        "1|-|-|-|-|-|-|-|-|\n" +
                        " |A|B|C|D|E|F|G|H|";
            }
        };
    }

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        BoardPrinter printer = context.getBean(BoardPrinter.class);
        printer.printBoard();
    }
}