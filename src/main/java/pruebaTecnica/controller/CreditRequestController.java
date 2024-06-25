package pruebaTecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import pruebaTecnica.service.CreditRequestService;
import pruebaTecnica.entities.CreditRequest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/credit-requests")
@PreAuthorize("hasRole('USER')")
public class CreditRequestController {
    @Autowired
    private CreditRequestService creditRequestService;

    @GetMapping
    public List<CreditRequest> getAllCreditRequests() {
        return creditRequestService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<CreditRequest> getCreditRequestById(@PathVariable Long id) {
        return creditRequestService.findById(id);
    }

    @PostMapping
    public CreditRequest createCreditRequest(@RequestBody CreditRequest creditRequest) {
        return creditRequestService.save(creditRequest);
    }

    @PutMapping("/{id}")
    public CreditRequest updateCreditRequest(@PathVariable Long id, @RequestBody CreditRequest creditRequest) {
        creditRequest.setId(id);
        return creditRequestService.save(creditRequest);
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<CreditRequest> updateStatus(@PathVariable Long id,
            @RequestBody Map<String, String> statusMap) {
        String status = statusMap.get("status");
        CreditRequest updatedRequest = creditRequestService.updateStatus(id, status);
        return ResponseEntity.ok(updatedRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteCreditRequest(@PathVariable Long id) {
        creditRequestService.deleteById(id);
    }
}