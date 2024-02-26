package org.example.movement;

import org.example.piece.Piece;

public abstract class PieceMovement {

    // запросы

    // предусловие: piece существует
    abstract Piece getPieceInvolved();

    // // предусловие: существует изначальное игровое поле и поле - "пункт назначения"
    abstract void execute();
}
