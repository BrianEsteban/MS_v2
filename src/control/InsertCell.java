/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entidad.cell;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Brian
 */
public class InsertCell 
{
    private cell cell;

    public InsertCell() {
    }
    
    public InsertCell(String company, String processor, String ram, String rom, String camera,
                      String batery, String cost, String plan) throws IOException
    {
        this.savePlan(company, processor, ram, rom, camera, batery, cost, plan);
    }
    
    private void savePlan(String company, String processor, String ram, String rom, String camera,
                      String batery, String cost, String plan) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("cells.db", true));
        String tosave = company + " " + processor + " " + ram + " " + rom + " " + camera + " " + batery
                                + " " + cost + " " + plan ;
        writer.append(tosave);
        writer.newLine();
        writer.close();
    }
    
    public ArrayList returnCellss() throws FileNotFoundException, IOException
    {
        // FileReader reads text files in the default encoding.
        FileReader fileReader = 
            new FileReader("cells.db");

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // This will reference one line at a time
        String line;
        ArrayList<String[]> cells = new ArrayList<>();
        while((line = bufferedReader.readLine()) != null) {
            cells.add(line.split(" "));
        }  
        return cells;
    }
    /*
    public String returnNameCell() throws FileNotFoundException, IOException
    {
        FileReader fileReader = new FileReader("cells.db");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        String nameCell = null;
        while((line = bufferedReader.readLine()) != null){
            nameCell = line;
        }
        return nameCell;
    }
    */
}




