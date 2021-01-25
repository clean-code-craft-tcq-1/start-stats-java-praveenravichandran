package statisticker;

import java.util.List;

import alerters.IAlerter;

public class StatsChecker {
  private float maxThreshold;
  private IAlerter[] alerters;
  public StatsChecker(float maxThreshold, IAlerter[] alerters) {
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;
  }
  
  public void checkAndAlert(List<Float> numbers) {
    Statistics.Stats s = Statistics.getStatistics(numbers);
    if(s.max != Float.NaN || s.max > maxThreshold || alerters.length > 0) {
        for(IAlerter alerter :  alerters) {
          alerter.alert();
        }
    }
  }

}
