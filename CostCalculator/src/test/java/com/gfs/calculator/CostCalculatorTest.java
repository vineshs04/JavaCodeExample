package com.gfs.calculator;

import static org.junit.Assert.fail;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import com.gfs.dto.CostDTO;
import com.gfs.exception.CalculatorException;

/**
 * The Class CostCalculatorTest.
 */
public class CostCalculatorTest {

	private ICostCalculator calculator;
	private CostDTO dto1;
	private CostDTO dto2;

	@Before
	public void init() {
		//Initialize the calculator instance
		calculator = new CostCalculatorImpl();

		String costId = "someCostId";
		
		//Populate the fields for dto1
		dto1 = new CostDTO();
		dto1.setCostId(costId);
		dto1.setCostAmount(new BigDecimal(22334455.2254325));

		//Populate the fields for dto2
		dto2 = new CostDTO();
		dto2.setCostId(costId);
		dto2.setCostAmount(new BigDecimal(11223344.114532453));
	}

	/************* Test Cases for Add Method *****************/
	@Test
	public void whenTwoDtoHaveSameCostIdThenReturnDtoHasSumOfTheirCostAmount() {
		try {
			BigDecimal expected = dto1.getCostAmount().add(dto2.getCostAmount());
			assertEquals(expected, calculator.add(dto1, dto2).getCostAmount());
//			assertTrue(expected.equals(calculator.add(dto1, dto2).getCostAmount()));
		} catch (CalculatorException e) {
			fail("Got the CalculatorException when not excepted");
		}
	}
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoIsNullThenAddThrowsCalculatorException() throws CalculatorException {
		dto1 = null;
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoIsNullThenAddThrowsCalculatorException() throws CalculatorException {
		dto2 = null;
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoHasNullCostAmountThenAddThrowsCalculatorException() throws CalculatorException {
		dto1.setCostAmount(null);
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoHasNullCostAmountThenAddThrowsCalculatorException() throws CalculatorException {
		dto2.setCostAmount(null);
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoHasNullCostIdThenAddThrowsCalculatorException() throws CalculatorException {
		dto1.setCostId(null);
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoHasNullCostIdThenAddThrowsCalculatorException() throws CalculatorException {
		dto2.setCostId(null);
		calculator.add(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenDtoHaveDifferentCostIDThenAddThrowsCalculatorException() throws CalculatorException {
		dto2.setCostId("someOtherId");
		calculator.add(dto1, dto2);
    }
	
	/************* Test Cases for Subtract Method *****************/
	@Test
	public void whenTwoDtoHaveSameCostIdThenReturnDtoHasDifferenceOfTheirCostAmount() {
		try {
			BigDecimal expected = dto1.getCostAmount().subtract(dto2.getCostAmount());
			assertEquals(expected, calculator.subtract(dto1, dto2).getCostAmount());
//			assertTrue(expected.equals(calculator.add(dto1, dto2).getCostAmount()));
		} catch (CalculatorException e) {
			fail("Got the CalculatorException when not excepted");
		}
	}
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoIsNullThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto1 = null;
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoIsNullThSubtractddThrowsCalculatorException() throws CalculatorException {
		dto2 = null;
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoHasNullCostAmountThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto1.setCostAmount(null);
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoHasNullCostAmountThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto2.setCostAmount(null);
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenFirstDtoHasNullCostIdThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto1.setCostId(null);
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenSecondDtoHasNullCostIdThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto2.setCostId(null);
		calculator.subtract(dto1, dto2);
    }
	
	@Test(expected = CalculatorException.class)
    public void whenDtoHaveDifferentCostIDThenSubtractThrowsCalculatorException() throws CalculatorException {
		dto2.setCostId("someOtherId");
		calculator.subtract(dto1, dto2);
    }

}
