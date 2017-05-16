package service;

import bean.Product;

/**
 * Created by yang on 16/05/2017.
 */
public class DiscountService {

    public static final int SEC_PER_MON = 2592000;

    public void setDiscount(Product product) {

        int expireDate = product.getExpiredDate();
        int currentDate = (int) (System.currentTimeMillis() / 1000);

        float discount = 1.0f;
        if ((expireDate - currentDate) < SEC_PER_MON)
            discount = 0.5f;

        product.setPrice(product.getPrice() * discount);
    }
}
