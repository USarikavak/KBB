package KBBTests.testbase;


import KBBTests.pages.LoginPageElements;

public class PageInitializer extends BaseClass {

    protected static LoginPageElements login;


    public static void initializeAll() {
        login = new LoginPageElements();


    }
}
