package divin.tg.demo.services;

import divin.tg.demo.entity.Employe;
import divin.tg.demo.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeService {

@Autowired
EmployeRepository employeRepository;
    public List<Employe> showEmployes(){
        return employeRepository.findAll();
    }

    public Employe saveEmploye(Employe employe){
        return employeRepository.save(employe);
    }

    public Employe findEmploye(Integer id) {
        return employeRepository.findById(id).get();
    }

    public void deleteEmploye(Integer id){
        employeRepository.deleteById(id);
    }
}
