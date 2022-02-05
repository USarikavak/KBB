package KBBTests.testbase;

import com.rcsa.pages.AddingNewAssignment;
import com.rcsa.pages.AssignmentPageElements;
import com.rcsa.pages.DashBoardPageElements;
import com.rcsa.pages.LoginPageElements;

public class PageInitializer extends BaseClass {

    protected static LoginPageElements login;
    protected static DashBoardPageElements dashBoard;
    protected static AssignmentPageElements assignmentActivity;
    protected static AddingNewAssignment addingNewAssignment;

    public static void initializeAll() {
        login = new LoginPageElements();
        assignmentActivity=new AssignmentPageElements();
        dashBoard=new DashBoardPageElements();
        addingNewAssignment=new AddingNewAssignment();

    }
}
