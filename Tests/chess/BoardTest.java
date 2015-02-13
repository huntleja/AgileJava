package chess; /**
 * Created by John on 2/12/2015.
 */
import junit.framework.TestCase;
import pieces.Pawn;

public class BoardTest extends TestCase {
    private Board chessBoard;
    private Pawn whitePawn = new Pawn();
    private Pawn blackPawn = new Pawn("black");

    public void setUp(){
        chessBoard = new Board();
    }

    public void testCreate(){
        assertEquals(16, chessBoard.getPieceCount());
        assertEquals("pppppppp", chessBoard.getRank2());
        assertEquals("PPPPPPPP", chessBoard.getRank7());
        assertEquals("........\n" +
                "PPPPPPPP\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "........\n" +
                "pppppppp\n" +
                "........\n", chessBoard.getBoard());

    }

}
