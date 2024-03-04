package com.clinica.Service;

import com.clinica.Dao.IDao;
import com.clinica.Dao.Implement.DomicilioDaoH2;
import com.clinica.Model.Domicilio;

import java.util.List;

public class DomicilioService {
    private DomicilioDaoH2 iDao;

    public DomicilioService() {
        this.iDao = new DomicilioDaoH2();
    }

    public Domicilio guardar (Domicilio domicilio) {
        return iDao.guardar(domicilio);
    }

    public List<Domicilio> listarTodos() {
        return iDao.listarTodos();
    }
}
