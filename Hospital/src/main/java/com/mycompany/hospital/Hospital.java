package com.mycompany.hospital;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import com.mycompany.hospital.Entidades.Consulta;
import com.mycompany.hospital.Entidades.Medico;
import com.mycompany.hospital.Entidades.Paciente;

/**
 *
 * @author Guilherme
 */
public class Hospital {

    
    public static List<Consulta> Consultas = new ArrayList<>();
    public static List<Paciente> Pacientes = new ArrayList<>();
    public static List<Medico> Medicos = new ArrayList<>();

    public static void main(String[] args) {
        landingPage app = new landingPage();
        app.setVisible(true);
        System.out.println("its working");
    }
}
