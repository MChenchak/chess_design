package org.example.piece;

import org.example.board.BoardTile;

public class PieceImpl extends Piece {
    private final PieceType pieceType;
    private BoardTile pieceActualBoardPosition;
    private boolean moved;

    public PieceImpl(final PieceType pieceType, final BoardTile pieceActualBoardPosition) {
        this.pieceType = pieceType;
        this.pieceActualBoardPosition = pieceActualBoardPosition;
    }

    public PieceImpl(final Piece piece) {
        this.pieceType = piece.getType();
        this.pieceActualBoardPosition = piece.getPiecePosition();
    }

    @Override
    public PieceType getType() {
        return this.pieceType;
    }


    public String getIdentifier() {
        return this.pieceType.toString() + "-" + this.getPiecePosition().toString();
    }

    @Override
    public BoardTile getPieceTile() {
        return this.pieceActualBoardPosition;
    }

    @Override
    public void setPosition(final BoardTile positionalDestination) {
        this.pieceActualBoardPosition = positionalDestination;
    }

    @Override
    public BoardTile getPiecePosition() {
        return this.pieceActualBoardPosition;
    }

    @Override
    public boolean hasAlreadyBeenMoved() {
        return this.moved;
    }

    @Override
    public void setHasMoved(final boolean moved) {
        this.moved = moved;
    }

    public String toString() {
        return "PieceImpl [" + getIdentifier() + "]";
    }

}
