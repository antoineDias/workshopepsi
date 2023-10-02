package fr.backend.back.request;

import fr.backend.back.request.dto.RequestDTOFindAll;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/requests")
public class RequestController {

    private final RequestService requestService;
    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }
    @GetMapping("")
    public List<RequestDTOFindAll> findAll(){
        return requestService.findAll();
    }
    @GetMapping("/{id}")
    public Request findById(@PathVariable("id") Long id){
        return requestService.findById(id);
    }
    @PostMapping("")
    public Request save(@RequestBody Request request){
        return requestService.save(request);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Long id){
        requestService.deleteByid(id);
    }
    @PutMapping("/{id}")
    public Request updateById(@PathVariable("id") Long id, @RequestBody Request article){
        return requestService.updateById(id, article);
    }
}
