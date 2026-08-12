package mk.ukim.finki.wp.jan2025g1.model.exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class InvalidArchaeologicalSiteIdException extends RuntimeException {

    public InvalidArchaeologicalSiteIdException(Long Id) {
        super(String.format("ArchaeologicalSite with id %d does not exist.", Id));
    }
}
