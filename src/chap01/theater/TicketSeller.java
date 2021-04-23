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
        ticketOffice.sellTicketTo(audience);
    }
}
