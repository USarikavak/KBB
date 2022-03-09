package kbb.testbase;


import kbb.pages.MenuTitlesPage;
import kbb.pages.carValuesPages;

public class PageInitializer extends BaseClass {

    protected static carValuesPages carValuesTitle;

    public static void initializeAll() {
        carValuesTitle = new carValuesPages();

    }
}
