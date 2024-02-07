
public class Arrayprocessor4 {
	public static final ArrayProcessor SUM = array -> {
        if (array.length == 0){
            return 0;
        }
        else{
            double sum = 0;
            for (double v : array) {
                sum += v;
            }
            return sum;
        }
    };

}
