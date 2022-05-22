package com.eqs.rubik.cube.model;

/**
 * Cube cell representation model.
 * Contains x,y,z axes and properties such us corner edge and colors.
 */
public class Cell {

  private final int x;
  private final int y;
  private final int z;
  private final boolean corner;
  private final boolean edge;
  private CellColor[] colors;

  public Cell(int x, int y, int z, CellColor[] colors, boolean corner, boolean edge) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.corner = corner;
    this.edge = edge;
    this.colors = colors;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getZ() {
    return z;
  }

  public CellColor[] getColors() {
    return colors;
  }

  public void setColors(final CellColor[] colors) {
    this.colors = colors;
  }

  public boolean isCorner() {
    return corner;
  }

  public boolean isEdge() {
    return edge;
  }
}