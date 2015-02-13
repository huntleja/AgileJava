package pieces;

/**
 * Generates a pieces.Pawn piece to be placed on chessboard
 * @author huntleja
 */
public class Pawn {
    private String color;
    final static String WHITE = "white";
    final static String BLACK = "black";

    public Pawn (){
        this.color = WHITE;
    }

    /**
     * @param color Specifies color of pawn
     */
    public Pawn(String color){
       this.color = color;
    }

    public String getColor(){
        return color;
    }

    public char getRepresentation() {
     if(this.color.equals(WHITE)){
         return 'p';
     }else{
         return 'P';
     }
    }
}
