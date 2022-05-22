package com.eqs.rubik.cube;

import com.eqs.rubik.cube.model.Cell;
import com.eqs.rubik.cube.service.CellService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CellServiceTest {

  private CellService cellService;

  @Test
  public void testCellGeneration() {
      cellService = new CellService();
      var colors = "rrrrrrrrrgggggggggbbbbbbbbb";
      final Cell[][][] cells = cellService.generateCells(colors);
      for (int x = 0; x < cells.length; x++) {
        for (int y = 0; y < cells.length; y++) {
          for (int z = 0; z < cells.length; z++) {
            Assertions.assertNotNull(cells[x][y][z]);
          }
        }
      }
    }
}
