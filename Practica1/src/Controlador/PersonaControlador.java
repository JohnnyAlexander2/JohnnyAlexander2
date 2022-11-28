/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Paciente;

/**
 *
 * @author johnny
 */
public class PersonaControlador {

    private Paciente persona;
    private ListaEnlazadaServices<Paciente> listaPersona;

    public PersonaControlador() {
    }

    public ListaEnlazadaServices<Paciente> getListaPaciente() {

        return listaPersona;
    }

    public void setListaPaciente(ListaEnlazadaServices<Paciente> listaAutores) {
        this.listaPersona = listaAutores;
    }

    public Paciente getPaciente() {
        if (this.persona == null)
        {
            this.persona = new Paciente();
        }
        return persona;
    }

    public void setPaciente(Paciente autor) {
        this.persona = autor;
    }

    public Boolean guardar(Paciente paciente) {
        try
        {
            getPaciente().setId(listaPersona.getSize() + 1);
            guardar(getPaciente());
            return true;
        } catch (Exception e)
        {
            System.out.println("Error en guardar autor" + e);
        }
        return false;
    }

    public Boolean Modificar(Paciente paciente, Integer pos) {
        try
        {

            Modificar(getPaciente(), pos);
            return true;
        } catch (Exception e)
        {
            System.out.println("Error en modificar autor" + e);
        }
        return false;
    }

    public ListaEnlazadaServices<Paciente> listado() {
        return listaPersona;
    }

}
