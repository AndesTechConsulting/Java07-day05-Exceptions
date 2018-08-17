package org.andestech.learning.rfb18;


public class App
{
    private static void userProcess(UserAccount ua)
    {

        UserAccount ua1 = new UserAccount("Peter");

        try {

            ua1.withdrawl(-10);
            //...
        }
        catch (TransactionalException ex)
        {
            System.out.println(ex);
            //..
        }

        System.out.println("You have: " + ua1.getAccountMoney());


    }


    public static void main( String[] args )
    // throws TransactionalException
    {
        userProcess(new UserAccount("Peter"));

 }

}
