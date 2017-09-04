package traders.trader;

import java.util.ArrayList;
import traders.provider.Product;

public interface ITrader {

	ArrayList<Product> makeOrder(double sum);

	double getDaylyTurnover();

	void payTaxes();
}
