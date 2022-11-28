/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Tabla;

import Controlador.ListaEnlazadaServices;
import Modelo.Paciente;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author johnny
 */
public class TablaPersonas extends AbstractTableModel {

    private ListaEnlazadaServices<Paciente> lista;

    public ListaEnlazadaServices<Paciente> getLista() {
        return lista;
    }

    public void setLista(ListaEnlazadaServices<Paciente> lista) {
        this.lista = lista;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public int getRowCount() {
        return lista.getSize();
    }
//
//    @Override
    public String getColumnCount(int column) {
        switch (column)
        {
            case 0:
                return "Paciente";
            case 1:
                return "Genero";
            case 2:
                return "Clasificacion";
            case 3:
                return "Fecha de Nacimiento";
            case 4:
                return "Edad";
            case 5:
                return "Recomendacion";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Paciente P = lista.obtenerDato(i);
        switch (i1)
        {
            case 0:
                return (i + 1);
            case 1:
                return P.getNombre();
            case 2:
                return P.getGenero();
            case 3:
                return P.getFechaNacimiento();
            case 4:
                return P.getElemento();
            default:
                return null;
        }
    }
}
