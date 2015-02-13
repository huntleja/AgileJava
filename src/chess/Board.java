package chess;
/**
 * Created by John on 2/12/2015.
 */

import pieces.Pawn;

import java.util.ArrayList;

/**
 * Generates  a ChessBoard
 * @author huntleja
 */
public class Board {
    private ArrayList<Pawn> rank2;
    private ArrayList<Pawn> rank7;
    private final static String WHITE_PIECE = "white";
    private final static String BLACK_PIECE = "black";
    private final static String BLANK_ROW = "........";

    public Board(){
        rank2 = new ArrayList<Pawn>();
        rank7 = new ArrayList<Pawn>();
        initialize();
    }

    private void initialize(){
        for(int i = 0; i<=7; i++){
            addWhitePawnToRank2();
            addBlackPawnToRank7();
        }
    }

    private void addWhitePawnToRank2(){
        rank2.add(new Pawn(WHITE_PIECE));
    }

    private void addBlackPawnToRank7(){
        rank7.add(new Pawn(BLACK_PIECE));
    }
    public int getPieceCount(){
        return rank2.size() + rank7.size();
    }

    public String getRank2(){
        StringBuilder buffer = new StringBuilder();
        for(Pawn pawn: rank2){
        buffer.append(pawn.getRepresentation());
        }
        return buffer.toString();
    }

    public String getRank7(){
        StringBuilder buffer = new StringBuilder();
        for(Pawn pawn: rank7){
            buffer.append(pawn.getRepresentation());
        }
        return buffer.toString();
    }

    public String getBoard() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(BLANK_ROW + "\n");
        buffer.append(this.getRank7()+"\n");
        buffer.append(BLANK_ROW + "\n");
        buffer.append(BLANK_ROW + "\n");
        buffer.append(BLANK_ROW + "\n");
        buffer.append(BLANK_ROW + "\n");
        buffer.append(this.getRank2()+"\n");
        buffer.append(BLANK_ROW+"\n");
        return buffer.toString();
    }
}
