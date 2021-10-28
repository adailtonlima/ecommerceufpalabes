package br.ufpa.facomp.labes.service.mapper;

import br.ufpa.facomp.labes.domain.Endereco;
import br.ufpa.facomp.labes.service.dto.EnderecoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Endereco} and its DTO {@link EnderecoDTO}.
 */
@Mapper(componentModel = "spring", uses = { UsuarioMapper.class })
public interface EnderecoMapper extends EntityMapper<EnderecoDTO, Endereco> {
    @Mapping(target = "usuario", source = "usuario", qualifiedByName = "nome")
    EnderecoDTO toDto(Endereco s);

    @Named("nome")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "nome", source = "nome")
    EnderecoDTO toDtoNome(Endereco endereco);
}
