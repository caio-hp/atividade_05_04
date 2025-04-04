package application;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GeneroService {
    private final GeneroRepository repository;

    public GeneroService(GeneroRepository repository) {
        this.repository = repository;
    }

    public List<Genero> listarTodos() {
        return repository.findAll();
    }

    public Optional<Genero> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Genero salvar(Genero genero) {
        return repository.save(genero);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
