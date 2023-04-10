package divin.tg.demo.controller;


import divin.tg.demo.entity.Employe;
import divin.tg.demo.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {

@Autowired
    EmployeService employeService;

@GetMapping("/employes")
public List<Employe> showEmploye(){
    return employeService.showEmployes();
}

@PostMapping("/employes")
    public Employe saveEmploye(@RequestBody Employe employe){
    return employeService.saveEmploye(employe);
}
@PutMapping("/employe/{id}")
public Employe updateEmoloye(@RequestBody Employe employe,@PathVariable Integer id){
    employe.setId(id);
    return employeService.saveEmploye(employe);

}
@DeleteMapping("employe/{id}")
public void removeEmploye(@PathVariable Integer id){
    employeService.deleteEmploye(id);

}
}
