package com.eqs.rubik.cube.util;

/**
 * Cell possible directions to rotate.
 */
public enum Rotations {

    // 90 degrees
    F90("F"), R90("R"), U90("U"), L90("L"), B90("B"), D90("D"),

    // - 90 degrees
    F_90("F'"), R_90("R'"), U_90("U'"), L_90("L'"), B_90("B'"), D_90("D'"),
    
    // 180 degrees
    F2("F2"), R2("R2"), U2("U2"), L2("L2"), B2("B2"), D2("D2");

    private String code;

    Rotations(String code) {
      this.code = code;
    }

    public String getCode() {
        return code;
    }
}
