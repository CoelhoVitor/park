package br.com.hackathonfc.park.bo;

import br.com.hackathonfc.park.dto.VagaDTO;
import br.com.hackathonfc.park.dto.VagaDTOSemEstacionamento;
import br.com.hackathonfc.park.dto.VeiculoDTO;
import br.com.hackathonfc.park.exception.EstacionamentoNotFound;
import br.com.hackathonfc.park.exception.VagaNotFound;
import br.com.hackathonfc.park.exception.VeiculoNotFound;
import br.com.hackathonfc.park.model.Vaga;
import br.com.hackathonfc.park.model.Veiculo;
import br.com.hackathonfc.park.service.VagaService;
import br.com.hackathonfc.park.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VagaBO {

    @Autowired
    private VagaService vagaService;

    @Autowired
    private VeiculoService veiculoService;

    public List<VeiculoDTO> listarVeiculos(Long id) throws EstacionamentoNotFound {
        return veiculoService.listarVeiculosDoEstacionamento(id);
    }
    public List<VagaDTOSemEstacionamento> listarVagas(Long id) throws EstacionamentoNotFound {
        return vagaService.listar(id);
    }

    public ResponseEntity<VagaDTO> cadastrarVaga(VagaDTO vagaDTO, Long id) {
        return vagaService.cadastrar(vagaDTO, id);
    }

    public ResponseEntity<VagaDTO> atualizarVaga(Long id, VagaDTO vagaDTO) throws VagaNotFound, VeiculoNotFound {
        return vagaService.atualizar(id, vagaDTO);
    }

    public ResponseEntity<VagaDTO> removerVaga(Long id) throws VagaNotFound {
        return vagaService.remover(id);
    }

    public VagaDTO detalharVaga(Long id) throws VagaNotFound {
        return vagaService.detalhar(id);
    }
}
