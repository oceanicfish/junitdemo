package bean;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yang on 15/05/2017.
 */
public class ProductTest {

    @Test
    public void getExpiredDate() throws Exception {
        int expiredDate = 1463270400;
        Product product = new Product();
        product.setExpiredDate(expiredDate);

        Assert.assertEquals(expiredDate, product.getExpiredDate());
    }

}