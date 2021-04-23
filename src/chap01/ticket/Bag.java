package chap01.ticket;

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

    // 초대장 보유 여부
    public boolean hasInvitation() {
        return invitation != null;
    }

    // 티켓 소유 여부
    public boolean hasTicket() {
        return ticket != null;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void minusAmount(long amount) {
        this.amount -= amount;
    }

    public void plusAmount(long amount) {
        this.amount += amount;
    }
}
