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
        service.initBoard();
        System.out.println(service.getBoard());
    }
}