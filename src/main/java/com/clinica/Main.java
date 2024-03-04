package com.clinica;

import com.clinica.DB.databaseConnection;
import com.clinica.Dao.Implement.OdontologoDaoH2;
import com.clinica.Model.Domicilio;
import com.clinica.Model.Odontologo;
import com.clinica.Service.DomicilioService;
import com.clinica.Service.OdontologoService;

public class Main {
    public static void main(String[] args) {

        try {
            databaseConnection.getDbConnect();
        } catch (Exception e){
            System.out.println("Fallo la conexion" + e);
        }


        Domicilio domicilio = new Domicilio("Calle A", 123, "Luján", "Mendoza");
        Domicilio domicilio2 = new Domicilio("Calle B", 456, "Carlos Paz", "Cordoba");

        //creo una instancia de la clase para usar sus métodos
        DomicilioService domicilioService = new DomicilioService();

        domicilioService.guardar(domicilio);
        domicilioService.guardar(domicilio2);

        System.out.println("Este el sout: " + domicilio + " este es el otro domicilio: " + domicilio2);

        domicilioService.listarTodos();

        Odontologo odontologo = new Odontologo(1L, "ABC", "Raul", "Martinez");
        Odontologo odontologo1 = new Odontologo(2L, "DFG", "Eduardo", "Gonzalez");

        OdontologoService odontologoService = new OdontologoService();

        odontologoService.setOdontologoIDao(new OdontologoDaoH2());

        odontologoService.guardar(odontologo);
        odontologoService.guardar(odontologo1);

        odontologoService.listadotodos();



    }

}