package chap01.theater;

/**
 * 관람객을 맞이하는 소극장
 */
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    // 관람객 입장
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
