package bean;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yang on 15/05/2017.
 */
public class MemberTest {

    private Member member;
    private String username;

    @Test
    public void testUserName() {
        username = "yang";
        member = new Member();
        member.setUsername(username);

        Assert.assertEquals(username, member.getUsername());
    }
}
