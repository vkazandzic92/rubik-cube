package com.eqs.rubik.cube.model;

import com.eqs.rubik.cube.util.Colors;

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
  private Colors color;

  public Cell(int x, int y, int z, Colors color, boolean corner, boolean edge) {
    this.x = x;
    this.y = y;
    this.z = z;
    this.corner = corner;
    this.edge = edge;
    this.color = color;
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

  public Colors getColor() {
    return color;
  }

  public void setColor(final Colors color) {
    this.color = color;
  }

  public boolean isCorner() {
    return corner;
  }

  public boolean isEdge() {
    return edge;
  }
}