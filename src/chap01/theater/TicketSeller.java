package chap01.theater;

/**
 * 매표소에서 초대장을 판매/교환해 주는 티켓 판매원
 */
public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    /* 티켓 교환/판매 */
    public void sellTo(Audience audience) {
        // 초대장을 보유하여 티켓을 교환하는 경우
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);

        // 티켓을 구매하는 경우
        } else {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }
    }
}
