package org.example.board;

public class BoardTileImpl extends BoardTile {
    private final int xPosition;
    private final int yPosition;

    public BoardTileImpl(final int xPosition, final int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public BoardTileImpl(final BoardTile pos) {
        this.xPosition = pos.getX();
        this.yPosition = pos.getY();
    }

    @Override
    public int getX() {
        return this.xPosition;
    }

    @Override
    public int getY() {
        return this.yPosition;
    }

    @Override
    public String toString() {
        return "BoardPositionImpl [xPosition=" + xPosition + ", yPosition=" + yPosition + "]";
    }


}
