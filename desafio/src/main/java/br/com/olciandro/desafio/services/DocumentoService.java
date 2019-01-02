package br.com.olciandro.desafio.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.olciandro.desafio.domain.Documento;
import br.com.olciandro.desafio.repositories.DocumentoRepository;

@Service
public class DocumentoService {
	
	private DocumentoRepository documentoRepository;
	
	public List<Documento> listarTodos(){
		return documentoRepository.findAll();
	}
	
	public Documento salvar(Documento documento) {
		return documentoRepository.save(documento);
	}
	
	public List<Documento> salvarTodos(List<Documento> documentos) {
		return documentoRepository.saveAll(documentos);
	}
	
	public Optional<Documento> buscarPorId(Long id){
		Optional<Documento> objeto = documentoRepository.findById(id);
		return objeto;
	}
	
	public void deletar(Documento documento) {
		documentoRepository.delete(documento);
	}
	
	public DocumentoRepository getDocumentoRepository() {
		return documentoRepository;
	}
	
	@Autowired
	public void setDocumentoRepository(DocumentoRepository documentoRepository) {
		this.documentoRepository = documentoRepository;
	}

}
