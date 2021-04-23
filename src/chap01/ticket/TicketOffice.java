package chap01.ticket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 관람객에게 티켓을 판매하는 매표소
 */
public class TicketOffice {
    // 판매 금액
    private long amount;
    // 판매하거나 교환해 줄 티켓 목록
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
