package org.example.board;


import org.example.piece.Piece;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public final class BoardImpl extends Board {

    private final List<Piece> piecesOnBoard;
    private final int columns = 8;
    private final int rows = 8;

    public BoardImpl(final Set<Piece> startingBoard) {
        this.piecesOnBoard = startingBoard.stream().collect(Collectors.toList());
    }

    @Override
    public Set<Piece> getPieces() {
        return this.piecesOnBoard.stream().collect(Collectors.toSet());
    }

    @Override
    public Optional<Piece> getPieceAtPosition(final BoardTile tile) {
        return this.piecesOnBoard.stream().filter(x -> x.getPiecePosition().equals(tile)).findAny();
    }

    @Override
    public boolean contains(final BoardTile positionToCheck) {
        return positionToCheck.getX() < this.columns && positionToCheck.getY() < this.rows
                && positionToCheck.getX() >= 0 && positionToCheck.getY() >= 0;
    }

    @Override
    public boolean contains(final Piece pieceToCheck) {
        return this.piecesOnBoard.contains(pieceToCheck);
    }

    public int getColumns() {
        return this.columns;
    }

    public int getRows() {
        return this.rows;
    }

    @Override
    public boolean removeAtPosition(final BoardTile positionToRemove) {
        if (this.getPieceAtPosition(positionToRemove).isPresent()) {
            return this.piecesOnBoard.remove(this.getPieceAtPosition(positionToRemove).get());
        }
        return false;
    }

    @Override
    public boolean remove(final Piece pieceToRemove) {
        return this.piecesOnBoard.remove(pieceToRemove);
    }

    @Override
    public boolean add(final Piece piece) {
        if (this.getPieceAtPosition(piece.getPiecePosition()).isEmpty()) {
            return this.piecesOnBoard.add(piece);
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sr = new StringBuilder(
                "BoardImpl [columns=" + columns + ", rows=" + rows + ", piecesOnBoard = \n");
        this.piecesOnBoard.forEach(x -> {
            sr.append('\t');
            sr.append(x.toString());
            sr.append('\n');
        });
        return sr.toString();
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + columns;
        result = prime * result + ((piecesOnBoard == null) ? 0 : piecesOnBoard.hashCode());
        result = prime * result + rows;
        return result;
    }


    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        final BoardImpl other = (BoardImpl) obj;

        if (columns != other.columns) {
            return false;
        }

        if (piecesOnBoard == null) {
            if (other.piecesOnBoard != null) {
                return false;
            }
        } else if (!piecesOnBoard.equals(other.piecesOnBoard)) {
            return false;
        }

        return rows == other.rows;
    }

}

