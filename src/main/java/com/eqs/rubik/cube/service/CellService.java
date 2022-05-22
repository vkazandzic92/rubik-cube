package com.eqs.rubik.cube.service;

import com.eqs.rubik.cube.model.Cell;
import com.eqs.rubik.cube.util.Colors;
import org.springframework.stereotype.Service;

@Service
public class CellService {

    public Cell[][][] generateCells(String cellsColor) {
        char colorsCode[] = cellsColor.toCharArray();
        Cell[][][] cells = new Cell[3][3][3];
        int position = 0;
        for (int x = 0; x < cells.length; x++) {
          for (int y = 0; y < cells.length; y++) {
            for (int z = 0; z < cells.length; z++) {
              var colorValue = String.valueOf(Character.toUpperCase(colorsCode[position]));
              Colors color = Colors.getColorByCode(colorValue);
              cells[x][y][z] = new Cell(x, y, z, color, false, true);
              position++;
            }
          }
        }
        return cells;
    }

}
