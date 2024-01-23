package com.example.DataAPI.dao;
 
import java.util.List;
 
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
 
import com.example.DataAPI.model.CdRates;
 
@Repository
public interface CdRatesRepository extends CassandraRepository<CdRates, String>{
	@AllowFiltering
	@Query("SELECT * FROM CdRates WHERE stateCd=?0 ALLOW FILTERING")
	public List<CdRates> findByStateName(String stateCd);
 
}