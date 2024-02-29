package org.example.movement;

import org.example.board.BoardTile;
import org.example.board.BoardTileImpl;
import org.example.piece.Piece;

public class BasicMovementImpl extends BasicMovement {

    private final BoardTile destination;
    private final BoardTile origin;

    public BasicMovementImpl(final BoardTile origin, final BoardTile destination) {
        this.destination = new BoardTileImpl(destination);
        this.origin = new BoardTileImpl(origin);
    }

    @Override
    public BoardTile getDestination() {
        return this.destination;
    }

    @Override
    public BoardTile getOrigin() {
        return this.origin;
    }

}
