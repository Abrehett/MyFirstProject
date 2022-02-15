import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Transaction {

    private Trader trader;
    private int year;
    private int value;

//    public Transaction(Trader trader, int year, int value) {
//        this.trader = trader;
//        this.year = year;
//        this.value = value;
//    }
//
//    public Trader getTrader() {
//        return trader;
//    }
//
//    public void setTrader(Trader trader) {
//        this.trader = trader;
//    }
}
