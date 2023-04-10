package divin.tg.demo;

import divin.tg.demo.entity.Employe;
import divin.tg.demo.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import java.time.LocalDate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Autowired
	EmployeRepository employeRepository;
	@Bean
	 CommandLineRunner start()
	 {
		 return args -> {
			 employeRepository.save(new Employe(null,"EPM254","ASSIH","Jacques",LocalDate.of(2000,10,5),"masculin"));
			 employeRepository.save(new Employe(null,"EPM255","ADOGLI","Caleb",LocalDate.of(2020,11,8),"masculin"));
			 employeRepository.save(new Employe(null,"EPM256","NOLITSE","Marcovit",LocalDate.of(1985,7,3),"masculin"));
			 employeRepository.save(new Employe(null,"EPM257","ASSIH","Ruth",LocalDate.of(2022,8,2),"feminin"));
		 };
	 }

}
