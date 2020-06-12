package br.com.roberto.rest;


import br.com.roberto.model.entity.Cliente;
import br.com.roberto.model.repository.CLienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {
    //injcção de dependência repositorio
    @Autowired
    private CLienteRepository repository;

    /**
     * busca todos os clientes
     * @return uma lista de clientes
     */
    @GetMapping
    public List<Cliente> buscaTodos(){
        return repository.findAll();
    }
    /**
     * busca um clientes
     * @return um clientes
     */
    @GetMapping("/{id}")
    public Cliente buscaUmCliente(@PathVariable("id") Long id){
        return repository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    /**
     * passa um cliente por JSON e salva no banco e mostra o cliente salvo em JSON
     * @param cliente
     * @return um estatus creted codigo 201
     */
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Cliente salvar(@RequestBody Cliente cliente){
        return repository.save(cliente);
    }
    /**
     * Deleta um clientes
     * @return um void
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleta(@PathVariable("id") Long id){
         repository
                .findById(id)
                .map(cliente -> {
                  repository.delete(cliente);
                  return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    /**
     * Atualiza um clientes
     * @return um void
     */
    @PutMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void atualiza(@PathVariable("id") Long id, @RequestBody Cliente cli){
        repository
                .findById(id)
                .map(cliente -> {
                    cliente.setBairrro(cli.getBairrro());
                    cliente.setCelular(cli.getCelular());
                    cliente.setCep(cli.getCep());
                    cliente.setCidade(cli.getCidade());
                    cliente.setCpf(cli.getCpf());
                    cliente.setDataNascimento(cli.getDataNascimento());
                    cliente.setEndereco(cli.getEndereco());
                    cliente.setId(cli.getId());
                    cliente.setNome(cli.getNome());
                    cliente.setProfição(cli.getProfição());
                    cliente.setRendaMensal(cli.getRendaMensal());
                    cliente.setRg(cli.getRg());
                    cliente.setTelefone(cli.getTelefone());
                    cliente.setUf(cli.getUf());
                    repository.save(cliente);
                    return Void.TYPE;
                })
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

}
