/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidad.cell;
import entidad.plan;
import java.util.ArrayList;

/**
 *
 * @author JULIO
 */
public class guardar 
{
    public ArrayList <plan> planes = new ArrayList<>();
    public ArrayList <cell> cells = new ArrayList<>();
      
    public void guardarplan(plan nuevoPlan)
    {
        planes.add(nuevoPlan);
    }
    
    public void saveCell(cell newCell)
    {
        cells.add(newCell);
    }
}
