package br.com.roberto;

import br.com.roberto.model.entity.Cliente;
import br.com.roberto.model.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class VendasApplication {

//
//    @Bean
//    public CommandLineRunner run(@Autowired CLienteRepository repository) {
//        return args -> {
//            var cliente = new Cliente();
//            cliente.setNome("roberto");
//            cliente.setCpf("01650698135");
//            cliente.setRg("2304871");
//            cliente.setTelefone("34842304");
//            cliente.setCelular("85286365");
//            cliente.setCep("72405150");
//            cliente.setEndereco("Q 15 conj b casa 08");
//            cliente.setBairrro("setor central");
//            cliente.setCidade("gama");
//            cliente.setUf("DF");
//            cliente.setDataNascimento("21/09/1986");
//            cliente.setRendaMensal(BigDecimal.valueOf(5400));
//            cliente.setProfição("desenvolvedor");
//            repository.save(cliente);
//        };
//
//    }


    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);


    }
}
