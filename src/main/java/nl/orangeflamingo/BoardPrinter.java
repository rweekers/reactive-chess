package nl.orangeflamingo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardPrinter {

    final private BoardService service;

    @Autowired
    public BoardPrinter(BoardService service) {
        this.service = service;
    }

    public void printBoard() {
        System.out.println(this.service.getBoard());
    }
}