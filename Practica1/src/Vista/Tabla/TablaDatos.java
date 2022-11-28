/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Tabla;

import Modelo.Elemento;
import Modelo.Elemento;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author johnny
 */
public class TablaDatos extends AbstractTableModel{
     private Elemento elemento[];

    public Elemento[] getElemento() {
        return elemento;
    }

    public void setElemento(Elemento[] elemento) {
        this.elemento = elemento;
    }

    @Override
    public int getRowCount() {
        return elemento.length;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Genero";
            case 2:
                return "Edad";
            case 3: 
                return "FechaNacimiento";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int filas, int columnas) {
        Elemento e = elemento[filas];
        switch (columnas) {
            case 0:
                return (filas + 1);
            case 1:
                return (e != null) ? e.getTipo().toString() : "No definido";
            case 2:
                return (e != null) ? e.getRecomendacion(): "No definido";
                
            default:
                return null;
        }
    }
}
