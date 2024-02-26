package org.example.piece;

import org.example.board.BoardTile;

public abstract class Piece {

    // запросы
    // // предусловие: фигуре назначен тип
    abstract PieceType getType();

    // предусловие: фигуре назначено игровое поле
    abstract BoardTile getPieceTile();

    abstract boolean hasAlreadyBeenMoved();


    // команды
    // постусловие: piece.tile = destinationTile
    abstract void setPosition(BoardTile destinationTile);

    // постусловие: piece.moved = moved
    abstract void setHasMoved(boolean moved);
}
