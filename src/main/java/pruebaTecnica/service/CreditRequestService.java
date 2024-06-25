package pruebaTecnica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pruebaTecnica.entities.CreditRequest;
import pruebaTecnica.repository.CreditRequestRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CreditRequestService {
    @Autowired
    private CreditRequestRepository creditRequestRepository;

    public List<CreditRequest> findAll() {
        return creditRequestRepository.findAll();
    }

    public Optional<CreditRequest> findById(Long id) {
        return creditRequestRepository.findById(id);
    }

    // Create and update method
    public CreditRequest save(CreditRequest creditRequest) {
        return creditRequestRepository.save(creditRequest);
    }

    public CreditRequest updateStatus(Long id, String status) {
        Optional<CreditRequest> optionalCreditRequest = creditRequestRepository.findById(id);
        if (optionalCreditRequest.isPresent()) {
            CreditRequest creditRequest = optionalCreditRequest.get();
            creditRequest.setStatus(status);
            return creditRequestRepository.save(creditRequest);
        }
        throw new RuntimeException("Credit Request not found");
    }

    public void deleteById(Long id) {
        creditRequestRepository.deleteById(id);
    }
}
