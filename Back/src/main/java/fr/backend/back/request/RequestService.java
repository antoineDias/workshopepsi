package fr.backend.back.request;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.backend.back.request.dto.RequestDTOFindAll;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Service
public class RequestService {

    private final RequestRepository requestRepository;
    private final ObjectMapper objectMapper;
    private LocalDate dateActuel;

    public RequestService(RequestRepository articleRepository, ObjectMapper objectMapper) {
        this.requestRepository = articleRepository;
        this.objectMapper = objectMapper;
    }

    public List<RequestDTOFindAll> findAll(){
        List<Request> requests = requestRepository.findAll();
        return requests.stream().map(request -> objectMapper.convertValue(request, RequestDTOFindAll.class)).toList();
    }

    /**
     * Retourne une requête par son identifiant.
     * @param id l'identifiant de l'article
     * @return la requête correspondante à l'identifiant
     * @throws ResponseStatusException si la requête n'est pas trouvée
     */
    public Request findById(Long id){
        return requestRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Article Not-Found") {
        });
    }

    /**
     * Enregistre une nouvelle requête.
     * @param request la requête à enregistrer
     * @return la requête enregistrée
     */
    public Request save(Request request){
        return requestRepository.save(request);
    }

    /**
     * Supprime une requête par son identifiant.
     * @param id l'identifiant de la requête à supprimer
     */
    public void deleteByid(Long id){
        requestRepository.deleteById(id);
    }

    /**
     * Met à jour un article.
     * @param request la requête à mettre à jour
     * @param id l'identifiant de la requête
     * @return la requête mis à jour
     * @throws RuntimeException si la requête n'est pas trouvé
     */
    public Request updateById(Long id, Request request){
        Request requestActual = requestRepository.findById(id).orElseThrow(() -> new RuntimeException("request not found for id: " + id));
        requestActual.setTitre(request.getTitre() == null ? requestActual.getTitre() : request.getTitre());
        requestActual.setCorps(request.getCorps() == null ? requestActual.getCorps() : request.getCorps());
        requestActual.setCategories(request.getCategories() == null ? requestActual.getCategories() : request.getCategories());
        requestActual.setDate_modif(request.getDate_modif() == null ? requestActual.getDate_modif() : request.getDate_modif());
        return requestRepository.save(requestActual);
    }
}
