package rajan.udacity.stock.hawk.ui.main;

import java.util.List;

import rajan.udacity.stock.hawk.data.model.Quote;
import rajan.udacity.stock.hawk.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showStocks(List<Quote> quoteList);

    void showStocksEmpty();

    void showMaterialDialogAddStock();

    Boolean checkSymbolExistOrNot(String symbol, List<Quote> quoteList);

    void showStockAlreadyExist();

    void showError();

}
