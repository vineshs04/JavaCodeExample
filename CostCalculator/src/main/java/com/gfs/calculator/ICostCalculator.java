package com.gfs.calculator;

import com.gfs.dto.CostDTO;
import com.gfs.exception.CalculatorException;

/**
 * The Interface ICostCalculator.
 * This class contains methods add and subtract the cost amount of provided cost DTO.
 */
public interface ICostCalculator {

	/**
	 * Adds the cost amount of given cost DTO if both have same costId.
	 *
	 * @param costDTO1 the cost DTO
	 * @param costDTO2 the cost DTO
	 * @return the cost DTO having cost as sum of given cost DTOs
	 * @throws CalculatorException if the provided cost DTO have different costId or cost amount is null.
	 */
	CostDTO add(CostDTO costDTO1, CostDTO costDTO2) throws CalculatorException;

	/**
	 * Subtracts the cost amount of given cost DTO if both have same costId.
	 *
	 * @param costDTO1 the cost DTO
	 * @param costDTO2 the cost DTO
	 * @return the cost DTO having cost as difference of given cost DTOs
	 * @throws CalculatorException if the provided cost DTO have different costId or cost amount is null.
	 */
	CostDTO subtract(CostDTO costDTO1, CostDTO costDTO2) throws CalculatorException;
}
