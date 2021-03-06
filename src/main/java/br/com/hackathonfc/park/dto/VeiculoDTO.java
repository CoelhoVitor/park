package br.com.hackathonfc.park.dto;

import br.com.hackathonfc.park.enums.TipoVeiculo;
import br.com.hackathonfc.park.model.Veiculo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VeiculoDTO {

	@Id
	private Long id;

	@NotEmpty
	private String marca;

	@NotEmpty
	private String modelo;

	@NotEmpty
	private String cor;

	@NotEmpty
	private String placa;

	@NotNull
	private TipoVeiculo tipoVeiculo;

	@NotNull
	private Long vagaId;

	public VeiculoDTO(Veiculo veiculo) {
		this.id = veiculo.getId();
		this.marca = veiculo.getMarca();
		this.modelo = veiculo.getModelo();
		this.cor = veiculo.getCor();
		this.placa = veiculo.getPlaca();
		this.tipoVeiculo = veiculo.getTipoVeiculo();
		this.vagaId = veiculo.getVaga().getId();
	}
}
