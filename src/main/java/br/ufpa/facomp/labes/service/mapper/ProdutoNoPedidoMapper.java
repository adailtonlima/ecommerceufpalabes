package br.ufpa.facomp.labes.service.mapper;

import br.ufpa.facomp.labes.domain.ProdutoNoPedido;
import br.ufpa.facomp.labes.service.dto.ProdutoNoPedidoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProdutoNoPedido} and its DTO {@link ProdutoNoPedidoDTO}.
 */
@Mapper(componentModel = "spring", uses = { ProdutoMapper.class, PedidoMapper.class })
public interface ProdutoNoPedidoMapper extends EntityMapper<ProdutoNoPedidoDTO, ProdutoNoPedido> {
    @Mapping(target = "produto", source = "produto", qualifiedByName = "nome")
    @Mapping(target = "pedido", source = "pedido", qualifiedByName = "id")
    ProdutoNoPedidoDTO toDto(ProdutoNoPedido s);
}
