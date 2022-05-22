package com.eqs.rubik.cube.util;

/**
 * Supported colors for the cube.
 * <ul>
 *   <li> White </li>
 *   <li> Yellow </li>
 *   <li> Blue </li>
 *   <li> Red </li>
 *   <li> Green </li>
 *   <li> Orange </li>
 * </ul>
 */
public enum Colors {

    WHITE("W"),
    YELLOW("Y"),
    BLUE("B"),
    RED("R"),
    GREEN("G"),
    ORANGE("O");

    private String color;

    Colors(String color) {
      this.color = color;
    }

    public String getColor() {
      return color;
    }
}
