package service;

import bean.Product;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yang on 16/05/2017.
 */
public class DiscountServiceTest {

    @Test
    public void setDiscount() throws Exception {
        Product cola = new Product();
        cola.setPrice(3.0f);
        cola.setExpiredDate(1493607895);

        DiscountService service = new DiscountService();
        service.setDiscount(cola);

        Assert.assertEquals(1.5f, cola.getPrice(), 0.001);
    }

}