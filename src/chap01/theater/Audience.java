package chap01.theater;

/**
 * 관람객
 */
public class Audience {
    // 소지품을 보관하기 위한 가방
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    /* 티켓을 교환/구매 */
    public long buy(Ticket ticket) {
        // 초대장을 보유하여 티켓을 교환하는 경우
        if (bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;

        // 티켓을 구매하는 경우
        } else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
