package projects.parkingLot.strategy.feeCalculationStrategy;

public class FeeCalculationStrategyFactory {

    public static FeeCalculationStrategy getFeeCalculationStrategy(){
        return new LowFeeCalculationStrategy();
    }
}
