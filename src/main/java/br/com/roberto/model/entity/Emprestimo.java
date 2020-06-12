package br.com.roberto.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Emprestimo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_emprestimo", nullable = false, length = 100)
    private String tipoEmprestimo;

    @Column(name = "descricao", nullable = false, length = 250)
    private String descricao;

    @Column(name = "valor_emprestimo", nullable = false)
    private BigDecimal valorEmpretimo;

    @Column(nullable = false, name = "numero_parcelas")
    private Integer numeroParcelas;

    @Column(name = "valor_parcela", nullable = false)
    private BigDecimal valorParcela;

    @Column(name = "data_emprestimo", nullable = false)
    private LocalDate dataEmprestimo;

    @Column(name = "data_final_emprestimo", nullable = false)
    private Date dataFinalEmprestimo;

    @Column(name = "percentual_juros_ao_mes", nullable = false)
    private BigDecimal percentualJurosAoMes;

    @Column(name = "valor_total_emprestimo", nullable = false)
    private BigDecimal valorTotalEmprestimo;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


}
