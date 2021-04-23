package chap01.theater;

/**
 * 관람객의 소지품을 보관하는 가방
 */
public class Bag {
    // 현금
    private long amount;
    // 초대장
    private Invitation invitation;
    // 티켓
    private Ticket ticket;

    // 초대장 없는 경우
    public Bag(long amount) {
        this(null, amount);
    }

    // 초대장 있는 경우
    public Bag(Invitation invitation, long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    /* 티켓 보관 및 금액 지불 */
    public long hold(Ticket ticket) {
        if (hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    // 초대장 보유 여부
    private boolean hasInvitation() {
        return invitation != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(long amount) {
        this.amount -= amount;
    }
}
