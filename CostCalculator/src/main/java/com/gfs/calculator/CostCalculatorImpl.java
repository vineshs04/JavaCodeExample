package com.gfs.calculator;

import static com.gfs.constant.Constants.ERR_MSG_COST_AMOUNT_CANNOT_BE_NULL;
import static com.gfs.constant.Constants.ERR_MSG_COST_DTO_IS_NULL;
import static com.gfs.constant.Constants.ERR_MSG_DIFFERENT_COST_ID;

import com.gfs.dto.CostDTO;
import com.gfs.exception.CalculatorException;

/**
 * The Class CostCalculatorImpl. 
 * The Implementations of ICostCalculator interface.
 */
public class CostCalculatorImpl implements ICostCalculator {

	/* (non-Java doc)
	 * @see com.gfs.calculator.ICostCalculator#add(com.gfs.dto.CostDTO, com.gfs.dto.CostDTO)
	 */
	@Override
	public CostDTO add(final CostDTO dto1, final CostDTO dto2) throws CalculatorException {
		//Check if first DTO is null. If its null then throw exception.
		if (dto1 == null){
			throw new CalculatorException(ERR_MSG_COST_DTO_IS_NULL);
		}

		//Check if both DTO are equal i.e. if both DTO have same cost id or not.
		//If not same then throw CalculatorException
		if (!dto1.equals(dto2))
			throw new CalculatorException(ERR_MSG_DIFFERENT_COST_ID);

		//Check if both DTO contains not null cost amount
		//If not then throw CalculatorException.
		if (dto1.getCostAmount() == null || dto2.getCostAmount() == null)
			throw new CalculatorException(ERR_MSG_COST_AMOUNT_CANNOT_BE_NULL);

		//Perform add operation on cost amount and set in new DTO which will be returned.
		CostDTO dto = new CostDTO();
		dto.setCostId(dto1.getCostId());
		dto.setCostAmount(dto1.getCostAmount().add(dto2.getCostAmount()));
		return dto;
	}

	/* (non-Javadoc)
	 * @see com.gfs.calculator.ICostCalculator#subtract(com.gfs.dto.CostDTO, com.gfs.dto.CostDTO)
	 */
	@Override
	public CostDTO subtract(CostDTO dto1, CostDTO dto2) throws CalculatorException {
		//Check if first DTO is null. If its null then throw exception.
		if (dto1 == null){
			throw new CalculatorException(ERR_MSG_COST_DTO_IS_NULL);
		}

		//Check if both DTO are equal i.e. if both DTO have same cost id or not.
		//If not same then throw CalculatorException
		if (!dto1.equals(dto2))
			throw new CalculatorException(ERR_MSG_DIFFERENT_COST_ID);

		//Check if both DTO contains not null cost amount
		//If not then throw CalculatorException.
		if (dto1.getCostAmount() == null || dto2.getCostAmount() == null)
			throw new CalculatorException(ERR_MSG_COST_AMOUNT_CANNOT_BE_NULL);

		//Perform subtract operation on cost amount and set in new DTO which will be returned.
		CostDTO dto = new CostDTO();
		dto.setCostId(dto1.getCostId());
		dto.setCostAmount(dto1.getCostAmount().subtract(dto2.getCostAmount()));
		return dto;
	}
}