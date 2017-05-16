package service;

import bean.Member;

/**
 * Created by yang on 15/05/2017.
 */
public class UpgradeService {

    public static final int SEC_OF_A_YEAR = 31536000;

    public boolean upgrade(Member member) {
        member.setVip(isQualified(member));
        return member.isVip();
    }

    public boolean isQualified(Member member) {
        int currentDate = (int) (System.currentTimeMillis() / 1000);
        return (currentDate - member.getJoinDate()) > SEC_OF_A_YEAR;
    }
}
