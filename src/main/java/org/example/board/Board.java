package org.example.board;

import org.example.piece.Piece;

import java.util.Optional;
import java.util.Set;

// АТД шахматная доска
public abstract class Board {

    // конструктор
    // постусловие: создана доска 8х8 клеток.
    public Board() {};

    // запросы

    // предусловие: на доске есть фигуры
    abstract Set<Piece> getPieces();

    // предусловие: tile существует
    abstract boolean contains(BoardTile tile);

    // предусловие: pieceToCheck существует
    abstract boolean contains(Piece pieceToCheck);

    abstract Optional<Piece> getPieceAtPosition(BoardTile boardPosition);

    // команды

    // постусловие: tile не содержит фигуры
    abstract boolean removeAtPosition(BoardTile tile);

    // постусловие: на доске стало на 1 фигуру(pieceToRemove) меньше. pieceToRemove больше не стоит на tile
    abstract boolean remove(Piece pieceToRemove);

    // постусловие: если клетка на доске постая, то фигура добавлена на доску иначе фигура не добавлена
    abstract boolean add(Piece pieceToAdd);
}
