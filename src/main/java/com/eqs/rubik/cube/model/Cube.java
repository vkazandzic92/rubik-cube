package com.eqs.rubik.cube.model;

/**
 * Cube representation model.
 */
public class Cube {

  private Cell[][][] cells = new Cell[3][3][3];

  public Cell[][][] getCells() {
    return cells;
  }

  public void setCells(final Cell[][][] cells) {
    this.cells = cells;
  }
}
