package chap01.ticket;

/**
 * 관람객
 */
public class Audience {
    // 소지품을 보관하기 위한 가방
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }
}
