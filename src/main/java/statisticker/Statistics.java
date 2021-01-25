package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics 
{
    public class Stats {
      public float average;
      public float max;
      public float min;
      
      private void findMax(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty()|| numbers.contains(Float.NaN)) {
          max = Float.NaN;
        } else {
          Collections.sort(numbers);
          max = numbers.get(numbers.size()-1);
        }
      }
      
      private void findMin(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty() || numbers.contains(Float.NaN)) {
          min = Float.NaN;
        } else {
          Collections.sort(numbers);
          min = numbers.get(0);
        }
      }
      
      private void calculateAverage(List<Float> numbers) {
        float sum = 0.0f;
        
        if (numbers == null || numbers.contains(Float.NaN)) {
          average = Float.NaN;
        } else {
          for (Float number: numbers) {
            sum += number;
          }
          average = sum / numbers.size();
        }
      }
    }
    public static Stats getStatistics(List<Float> numbers) {
        //implement the computation of statistics here
        Statistics statistics = new Statistics();
        Stats s = statistics.new Stats();
        
        s.calculateAverage(numbers);
        s.findMin(numbers);
        s.findMax(numbers);
        
        return s;
    }
}
