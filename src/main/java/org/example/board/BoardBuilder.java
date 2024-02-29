package org.example.board;

import org.example.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class BoardBuilder {

    private final Set<Piece> piecesOnBoard = new HashSet<>();
    private boolean built;

    public BoardBuilder addPiece(final Piece piece) {
        this.piecesOnBoard.add(piece);
        return this;
    }

    public Board build() {

        if (this.built) {
            throw new IllegalStateException("Alredy Built");
        }

        this.built = true;
        return new BoardImpl(this.piecesOnBoard);
    }
}
