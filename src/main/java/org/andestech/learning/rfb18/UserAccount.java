package org.andestech.learning.rfb18;

/*class User
{
    private String name, sname,...

}*/


import java.util.UUID;

public class UserAccount {

    private static double MIN_AMMOUNT = 10;
    private static double MAX_AMMOUNT = 1_000_000;

    private double money;
    private String name;

    private UUID id;


    public UserAccount( String name) {
        this.money = MIN_AMMOUNT;
        this.id = UUID.randomUUID();
        this.name = name;
    }



    public void withdrawl(final double m) throws TransactionalException
    {
        //m=Math.abs(m);
        if (m < 0)
            throw new TransactionalException("System error...");

        double res = money - m;
        if(res >= MIN_AMMOUNT )
        {
            money = res;
        }
        else
        {
            throw new TransactionalException(name + ", Не достаточно денег на счёте: " + res);
            //log....

        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountMoney() {
        return money;
    }

//    public void setMoney(double money) {
//        this.money = money;
//    }
}
