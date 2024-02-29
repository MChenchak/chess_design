package org.example.piece;

import org.example.board.BoardTile;

public abstract class Piece {

    // запросы
    // // предусловие: фигуре назначен тип
    public abstract PieceType getType();

    // предусловие: фигуре назначено игровое поле
    public abstract BoardTile getPieceTile();

    public abstract boolean hasAlreadyBeenMoved();

    public abstract BoardTile getPiecePosition();

    // команды
    // постусловие: piece.tile = destinationTile
    public abstract void setPosition(BoardTile destinationTile);

    // постусловие: piece.moved = moved
    public abstract void setHasMoved(boolean moved);
}
