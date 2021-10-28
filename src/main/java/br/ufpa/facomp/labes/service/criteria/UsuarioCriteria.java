package br.ufpa.facomp.labes.service.criteria;

import java.io.Serializable;
import java.util.Objects;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LocalDateFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;
import tech.jhipster.service.filter.ZonedDateTimeFilter;

/**
 * Criteria class for the {@link br.ufpa.facomp.labes.domain.Usuario} entity. This class is used
 * in {@link br.ufpa.facomp.labes.web.rest.UsuarioResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /usuarios?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
public class UsuarioCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter nome;

    private StringFilter cpf;

    private LocalDateFilter dataNascimento;

    private ZonedDateTimeFilter criado;

    private LongFilter meusEnderecosId;

    private Boolean distinct;

    public UsuarioCriteria() {}

    public UsuarioCriteria(UsuarioCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.nome = other.nome == null ? null : other.nome.copy();
        this.cpf = other.cpf == null ? null : other.cpf.copy();
        this.dataNascimento = other.dataNascimento == null ? null : other.dataNascimento.copy();
        this.criado = other.criado == null ? null : other.criado.copy();
        this.meusEnderecosId = other.meusEnderecosId == null ? null : other.meusEnderecosId.copy();
        this.distinct = other.distinct;
    }

    @Override
    public UsuarioCriteria copy() {
        return new UsuarioCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public LongFilter id() {
        if (id == null) {
            id = new LongFilter();
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getNome() {
        return nome;
    }

    public StringFilter nome() {
        if (nome == null) {
            nome = new StringFilter();
        }
        return nome;
    }

    public void setNome(StringFilter nome) {
        this.nome = nome;
    }

    public StringFilter getCpf() {
        return cpf;
    }

    public StringFilter cpf() {
        if (cpf == null) {
            cpf = new StringFilter();
        }
        return cpf;
    }

    public void setCpf(StringFilter cpf) {
        this.cpf = cpf;
    }

    public LocalDateFilter getDataNascimento() {
        return dataNascimento;
    }

    public LocalDateFilter dataNascimento() {
        if (dataNascimento == null) {
            dataNascimento = new LocalDateFilter();
        }
        return dataNascimento;
    }

    public void setDataNascimento(LocalDateFilter dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ZonedDateTimeFilter getCriado() {
        return criado;
    }

    public ZonedDateTimeFilter criado() {
        if (criado == null) {
            criado = new ZonedDateTimeFilter();
        }
        return criado;
    }

    public void setCriado(ZonedDateTimeFilter criado) {
        this.criado = criado;
    }

    public LongFilter getMeusEnderecosId() {
        return meusEnderecosId;
    }

    public LongFilter meusEnderecosId() {
        if (meusEnderecosId == null) {
            meusEnderecosId = new LongFilter();
        }
        return meusEnderecosId;
    }

    public void setMeusEnderecosId(LongFilter meusEnderecosId) {
        this.meusEnderecosId = meusEnderecosId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final UsuarioCriteria that = (UsuarioCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(nome, that.nome) &&
            Objects.equals(cpf, that.cpf) &&
            Objects.equals(dataNascimento, that.dataNascimento) &&
            Objects.equals(criado, that.criado) &&
            Objects.equals(meusEnderecosId, that.meusEnderecosId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, cpf, dataNascimento, criado, meusEnderecosId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "UsuarioCriteria{" +
            (id != null ? "id=" + id + ", " : "") +
            (nome != null ? "nome=" + nome + ", " : "") +
            (cpf != null ? "cpf=" + cpf + ", " : "") +
            (dataNascimento != null ? "dataNascimento=" + dataNascimento + ", " : "") +
            (criado != null ? "criado=" + criado + ", " : "") +
            (meusEnderecosId != null ? "meusEnderecosId=" + meusEnderecosId + ", " : "") +
            (distinct != null ? "distinct=" + distinct + ", " : "") +
            "}";
    }
}
