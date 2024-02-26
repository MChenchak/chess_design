package org.example.movement;

import org.example.board.BoardTile;

public abstract class BasicMovement extends PieceMovement {

    // запросы

    // предусловие: boardTile существует
    abstract BoardTile getDestination();

    // предусловие: boardTile существует
    abstract BoardTile getOrigin();
}
