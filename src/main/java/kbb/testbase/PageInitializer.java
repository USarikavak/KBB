package kbb.testbase;


import kbb.pages.MenuTitlesPage;

public class PageInitializer extends BaseClass {

    protected static MenuTitlesPage carValuesTitle;


    public static void initializeAll() {
        carValuesTitle = new MenuTitlesPage();


    }
}
