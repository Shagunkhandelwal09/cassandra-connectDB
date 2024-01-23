package com.example.DataAPI.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.DataAPI.dao.CdArchiveRatesRepository;
import com.example.DataAPI.dao.CdRatesRepository;
import com.example.DataAPI.model.ArchiveCdRates;
import com.example.DataAPI.model.CdRates;
 
@RestController
public class DataApiController {
 
	@Autowired
	CdRatesRepository cdRatesRepository;
 
	@Autowired
	CdArchiveRatesRepository cdArchiveRatesRepository;
 
	@GetMapping("/cdRates/viewRates/{stateCd}")
	public List<CdRates> getCustomerRates(@PathVariable String stateCd) {
		return cdRatesRepository.findByStateName(stateCd);
 
	}
 
	@GetMapping("/historyCdRates/viewRates/{stateCd}")
	public List<ArchiveCdRates> getManagerRates(@PathVariable String stateCd) {
		return cdArchiveRatesRepository.findByStateName(stateCd);
 
	}
 
}