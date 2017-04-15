package com.gfs.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The Class CostDTO.
 */
public class CostDTO {

	/** The cost id. */
	private String costId;

	/** The cost amount. */
	private BigDecimal costAmount;

	/** The effective date. */
	private Date effectiveDate;

	/**
	 * Gets the cost id.
	 *
	 * @return the cost id
	 */
	public String getCostId() {
		return costId;
	}

	/**
	 * Sets the cost id.
	 *
	 * @param costId the new cost id
	 */
	public void setCostId(String costId) {
		this.costId = costId;
	}

	/**
	 * Gets the effective date.
	 *
	 * @return the effective date
	 */
	public Date getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * Sets the effective date.
	 *
	 * @param effectiveDate the new effective date
	 */
	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * Gets the cost amount.
	 *
	 * @return the cost amount
	 */
	public BigDecimal getCostAmount() {
		return costAmount;
	}

	/**
	 * Sets the cost amount.
	 *
	 * @param costAmout the new cost amount
	 */
	public void setCostAmount(BigDecimal costAmount) {
		this.costAmount = costAmount;
	}

	
	/**
	* The hashCode of costDTO based costId field.
	*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costId == null) ? 0 : costId.hashCode());
		return result;
	}

	/**
	* The two cost DTO will be equal if both have same costId.
	*
	* @param obj the costDTO object
	* @return true, if two cost DTO have same costId.
	*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CostDTO other = (CostDTO) obj;
		if (costId == null) {
			if (other.costId != null)
				return false;
		} else if (!costId.equals(other.costId))
			return false;
		return true;
	}

}
