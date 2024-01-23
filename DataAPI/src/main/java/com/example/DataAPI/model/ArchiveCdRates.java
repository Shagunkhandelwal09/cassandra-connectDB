
package com.example.DataAPI.model;
 
import java.util.Date;
 
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
 
import jakarta.persistence.Table;
 
@Table

public class ArchiveCdRates {
 
	@PrimaryKey

	private String id;

	private Integer termLength;

	private Double intrstRate;

	private Double managerRate;

	private String stateCd;

	private Integer mindo;

	private Integer maxdp;

	private Date startDate;

	private Date endDate;

	private String createdBy;

	private String updatedBy;

 
	public ArchiveCdRates() {

		super();

	}
 
	public String getId() {

		return id;

	}
 
	public void setId(String id) {

		this.id = id;

	}
 
	public Integer getTermLength() {

		return termLength;

	}
 
	public void setTermLength(Integer termLength) {

		this.termLength = termLength;

	}
 
	public Double getIntrstRate() {

		return intrstRate;

	}
 
	public void setIntrstRate(Double intrstRate) {

		this.intrstRate = intrstRate;

	}
 
	public Double getManagerRate() {

		return managerRate;

	}
 
	public void setManagerRate(Double managerRate) {

		this.managerRate = managerRate;

	}
 
	public String getStateCd() {

		return stateCd;

	}
 
	public void setStateCd(String stateCd) {

		this.stateCd = stateCd;

	}
 
	public Integer getMindo() {

		return mindo;

	}
 
	public void setMindo(Integer mindo) {

		this.mindo = mindo;

	}
 
	public Integer getMaxdp() {

		return maxdp;

	}
 
	public void setMaxdp(Integer maxdp) {

		this.maxdp = maxdp;

	}
 
	public Date getStartDate() {

		return startDate;

	}
 
	public void setStartDate(Date startDate) {

		this.startDate = startDate;

	}
 
	public Date getEndDate() {

		return endDate;

	}
 
	public void setEndDate(Date endDate) {

		this.endDate = endDate;

	}
 
	public String getCreatedBy() {

		return createdBy;

	}
 
	public void setCreatedBy(String createdBy) {

		this.createdBy = createdBy;

	}
 
	public String getUpdatedBy() {

		return updatedBy;

	}
 
	public void setUpdatedBy(String updatedBy) {

		this.updatedBy = updatedBy;

	}
 
	@Override

	public String toString() {

		return "ArchiveCdRates [id=" + id + ", termLength=" + termLength + ", intrstRate=" + intrstRate

				+ ", managerRate=" + managerRate + ", stateCd=" + stateCd + ", mindo=" + mindo + ", maxdp=" + maxdp

				+ ", startDate=" + startDate + ", endDate=" + endDate + ", createdBy=" + createdBy + ", updatedBy="

				+ updatedBy + "]";

	}

}
