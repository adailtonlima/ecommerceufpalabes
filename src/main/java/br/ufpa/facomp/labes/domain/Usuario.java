package br.ufpa.facomp.labes.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Usuario.
 */
@Entity
@Table(name = "usuario")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "criado")
    private ZonedDateTime criado;

    @OneToMany(mappedBy = "usuario")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "usuario" }, allowSetters = true)
    private Set<Endereco> meusEnderecos = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Usuario id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public Usuario nome(String nome) {
        this.setNome(nome);
        return this;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Usuario cpf(String cpf) {
        this.setCpf(cpf);
        return this;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public Usuario dataNascimento(LocalDate dataNascimento) {
        this.setDataNascimento(dataNascimento);
        return this;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ZonedDateTime getCriado() {
        return this.criado;
    }

    public Usuario criado(ZonedDateTime criado) {
        this.setCriado(criado);
        return this;
    }

    public void setCriado(ZonedDateTime criado) {
        this.criado = criado;
    }

    public Set<Endereco> getMeusEnderecos() {
        return this.meusEnderecos;
    }

    public void setMeusEnderecos(Set<Endereco> enderecos) {
        if (this.meusEnderecos != null) {
            this.meusEnderecos.forEach(i -> i.setUsuario(null));
        }
        if (enderecos != null) {
            enderecos.forEach(i -> i.setUsuario(this));
        }
        this.meusEnderecos = enderecos;
    }

    public Usuario meusEnderecos(Set<Endereco> enderecos) {
        this.setMeusEnderecos(enderecos);
        return this;
    }

    public Usuario addMeusEnderecos(Endereco endereco) {
        this.meusEnderecos.add(endereco);
        endereco.setUsuario(this);
        return this;
    }

    public Usuario removeMeusEnderecos(Endereco endereco) {
        this.meusEnderecos.remove(endereco);
        endereco.setUsuario(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Usuario)) {
            return false;
        }
        return id != null && id.equals(((Usuario) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Usuario{" +
            "id=" + getId() +
            ", nome='" + getNome() + "'" +
            ", cpf='" + getCpf() + "'" +
            ", dataNascimento='" + getDataNascimento() + "'" +
            ", criado='" + getCriado() + "'" +
            "}";
    }
}
