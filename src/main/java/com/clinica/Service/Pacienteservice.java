package com.clinica.Service;

import com.clinica.Dao.IDao;
import com.clinica.Model.Paciente;

import java.util.List;

public class Pacienteservice {

    private IDao<Paciente> pacienteIDao;

    public Pacienteservice(){

    }

    public void setPacienteIDao(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente guardar(Paciente paciente){
        return pacienteIDao.guardar(paciente);
    }

    public List<Paciente> listartodos(){
        return pacienteIDao.listarTodos();
    }

}
