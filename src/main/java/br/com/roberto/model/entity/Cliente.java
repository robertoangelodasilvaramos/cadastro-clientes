package br.com.roberto.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false, length = 20)
    private String rg;
    @Column(nullable = false, length = 30)
    private String telefone;
    @Column(nullable = false, length = 30)
    private String celular;
    @Column(nullable = false, length = 20)
    private String cep;
    @Column(nullable = false, length = 200)
    private String endereco;
    @Column(nullable = false, length = 100)
    private String bairrro;
    @Column(nullable = false, length = 50)
    private String cidade;
    @Column(nullable = false, length = 2)
    private String uf;
    @Column(nullable = false, length = 20)
    private String dataNascimento;
    @Column(nullable = false)
    private BigDecimal rendaMensal;
    @Column(nullable = false, length = 100)
    private String profição;

}
