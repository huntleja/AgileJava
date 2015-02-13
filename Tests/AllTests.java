/**
 * Created by John on 2/12/2015.
 */

import chess.*;
import junit.framework.TestSuite;
import pieces.*;

public class AllTests {
    public static TestSuite suite(){
        junit.framework.TestSuite suite = new junit.framework.TestSuite();
        suite.addTestSuite(BoardTest.class);
        suite.addTestSuite(PawnTest.class);
        suite.addTestSuite(CharacterTest.class);
        return suite;
    }
}
