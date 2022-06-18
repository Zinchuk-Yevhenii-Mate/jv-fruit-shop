package core.basesyntax.strategy;

import core.basesyntax.dao.ShopDao;
import core.basesyntax.dao.ShopDaoImpl;
import core.basesyntax.model.FruitTransaction;

public class BalanceHandler implements OperationHandler {
    private final ShopDao shopDao = new ShopDaoImpl();

    @Override
    public void handle(FruitTransaction fruitTransaction) {
        shopDao.add(fruitTransaction.getFruit(), fruitTransaction.getQuantity());
    }
}
