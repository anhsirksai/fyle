package com.fyle.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyle.model.BankBranches;

@Repository
public interface BankBranchesRepository extends JpaRepository<BankBranches, Long> {

	@Query(
			value = "Select * from bank_branches e where e.ifsc = :ifsc", 
			nativeQuery=true
	)
	public Optional<BankBranches> findByifsc(@Param("ifsc") String ifsc);
	
	@Query(
			value = "SELECT * FROM bank_branches t where t.bank_name = :name AND t.city = :city", 
			nativeQuery=true
		)
		public List<BankBranches> findByCityAndName(@Param("name") String name, @Param("city") String city);

}
