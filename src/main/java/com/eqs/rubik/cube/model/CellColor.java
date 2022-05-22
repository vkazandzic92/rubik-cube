package com.eqs.rubik.cube.model;

import com.eqs.rubik.cube.util.Colors;
import com.eqs.rubik.cube.util.Rotations;

/**
 * Cell color properties model representation.
 */
public class CellColor {

  private Colors color;
  private Rotations rotation;

  public Colors getColor() {
    return color;
  }

  public void setColor(final Colors color) {
    this.color = color;
  }

  public void setRotation(final Rotations rotation) {
    this.rotation = rotation;
  }

  public Rotations getRotation() {
    return rotation;
  }
}
