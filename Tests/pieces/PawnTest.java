package pieces;

public class PawnTest extends junit.framework.TestCase {
    final static String WHITE = "white";
    final static String BLACK = "black";
    final static char WHITE_REPRESENTATION = 'p';
    final static char BLACK_REPRESENTATION = 'P';

    public void testCreateDefault(){
        Pawn thirdPawn = new Pawn();
        assertEquals(WHITE, thirdPawn.getColor());
        assertEquals(WHITE_REPRESENTATION, thirdPawn.getRepresentation());
    }

    public void testCreateConstructed(){
        Pawn pawn = new Pawn(WHITE);
        assertEquals(WHITE, pawn.getColor());
        assertEquals(WHITE_REPRESENTATION, pawn.getRepresentation());

        Pawn secondPawn = new Pawn(BLACK);
        assertEquals(BLACK, secondPawn.getColor());
        assertEquals(BLACK_REPRESENTATION, secondPawn.getRepresentation());
    }


}