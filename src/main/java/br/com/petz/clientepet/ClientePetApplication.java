package br.com.petz.clientepet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClientePetApplication {
	
	@GetMapping
	public String geHomeTeste() {
		
		return 	"Cliente Pet - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientePetApplication.class, args);
	}

}
