package service;

import bean.Member;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yang on 15/05/2017.
 */
public class UpgradeServiceTest {

    protected int date1 = 1431677733;
    protected int date2 = 1492244133;

    @Test
    public void upgrade() throws Exception {
        UpgradeService upgradeService = new UpgradeService();
        Member member1 = new Member();
        member1.setJoinDate(1431677733);

        Assert.assertEquals(true, upgradeService.upgrade(member1));
    }

    @Test
    public void isQualified() throws Exception {
        UpgradeService upgradeService = new UpgradeService();
        Member member2 = new Member();
        member2.setJoinDate(1492244133);

        Assert.assertEquals(false, upgradeService.isQualified(member2));
    }

}