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
        return bag.hold(ticket);
    }
}
