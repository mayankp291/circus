package circus.stuff;

import circus.Asset;

public abstract class equipment implements Asset {
    protected int purchasePrice;

    public equipment(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getValue() {
        return purchasePrice;
    }
}
