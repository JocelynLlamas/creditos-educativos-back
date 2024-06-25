package pruebaTecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pruebaTecnica.entities.CreditRequest;

public interface CreditRequestRepository extends JpaRepository<CreditRequest, Long> {
}