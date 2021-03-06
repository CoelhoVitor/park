package br.com.hackathonfc.park.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import br.com.hackathonfc.park.bo.VagaBO;
import br.com.hackathonfc.park.dto.VagaDTO;
import br.com.hackathonfc.park.dto.VagaDTOSemEstacionamento;
import br.com.hackathonfc.park.exception.EstacionamentoNotFound;
import br.com.hackathonfc.park.exception.PlacaFound;
import br.com.hackathonfc.park.exception.VagaNotFound;
import br.com.hackathonfc.park.exception.VeiculoNotFound;
import br.com.hackathonfc.park.mapper.VeiculoMAP;
import br.com.hackathonfc.park.model.Vaga;
import br.com.hackathonfc.park.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.hackathonfc.park.dto.VeiculoDTO;
import br.com.hackathonfc.park.model.Veiculo;
import br.com.hackathonfc.park.repository.VagaRepository;
import br.com.hackathonfc.park.repository.VeiculoRepository;

@RestController
@RequestMapping("/estacionamentos")
public class VagaController {
		
	@Autowired
	private VagaBO vagaBO;

	@GetMapping("/{id}/vagas/{id2}")
	public VagaDTO detalharVaga(@PathVariable Long id2) throws VagaNotFound{
		return vagaBO.detalharVaga(id2);
	}

	@GetMapping("/{id}/vagas")
	public List<VagaDTOSemEstacionamento> listarVagas(@PathVariable Long id) throws EstacionamentoNotFound {
		return vagaBO.listarVagas(id);
	}
	
	@PostMapping("/{id}/vagas")
	public ResponseEntity<VagaDTO> cadastrarVaga(@RequestBody @Valid VagaDTO vagaDTO, @PathVariable Long id){
		return vagaBO.cadastrarVaga(vagaDTO, id);
	}
	
	@PutMapping("/{id}/vagas/{id2}")
	public ResponseEntity<VagaDTO> atualizarVaga(@PathVariable Long id2, @RequestBody @Valid VagaDTO vagaDTO) throws VagaNotFound, VeiculoNotFound {
		return vagaBO.atualizarVaga(id2, vagaDTO);
	}
	
	@DeleteMapping("/{id}/vagas/{id2}")
	public ResponseEntity<VagaDTO> removerVaga(@PathVariable Long id2) throws VeiculoNotFound, VagaNotFound {
		return vagaBO.removerVaga(id2);
	}
}
