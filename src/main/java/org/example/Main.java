package org.example;

import org.example.board.Board;
import org.example.board.BoardBuilder;
import org.example.board.BoardTileImpl;
import org.example.piece.Piece;
import org.example.piece.PieceImpl;
import org.example.piece.PieceType;

public class Main {
    public static void main(String[] args) {

        Piece pawn = new PieceImpl(PieceType.PAWN, new BoardTileImpl(1,2));
        Piece queen = new PieceImpl(PieceType.QUEEN, new BoardTileImpl(5,5));

        BoardBuilder boardBuilder = new BoardBuilder();

        Board board = boardBuilder
                .addPiece(pawn)
                .addPiece(queen)
                .build();

        System.out.println(board.toString());

    }
}