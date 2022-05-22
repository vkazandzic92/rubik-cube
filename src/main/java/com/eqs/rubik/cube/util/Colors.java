package com.eqs.rubik.cube.util;

import java.util.Arrays;

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

    private String code;

    Colors(String code) {
      this.code = code;
    }

    public String getCode() {
        return code;
    }

    public static Colors getColorByCode(String code) {
        return Arrays.stream(values())
            .filter(bl -> bl.getCode().equals(code))
            .findFirst().orElseThrow();
    }
}
