package Controller;

import Model.Node;

/**
 * Created by weitao on 4/23/15.
 */
public class Move {
    public int sourceRow;
    public int sourceColumn;
    public int targetRow;
    public int targetColumn;
    public Move move;

    public Move(int sourceRow, int sourceColumn, int targetRow, int targetColumn){
        this.sourceRow = sourceRow;
        this.sourceColumn = sourceColumn;
        this.targetRow = targetRow;
        this.targetColumn = targetColumn;
    }

    public String toString() {
        return Node.getColumnString(sourceColumn)+"/"+Node.getRowString(sourceRow)+ " -> " +
                Node.getColumnString(targetColumn)+"/"+Node.getRowString(targetRow);
    }

}
