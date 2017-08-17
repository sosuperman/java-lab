public class MathExpEvaluation {

	    public static void main(String[] args) {
	        String expression = "1*5*4+8*9+16/8-9"; // Answer: 85
	        double ans = computeAnother(expression);
	        System.out.println(ans);
	    }

	    static double computeAnother(String equation) {
	        double result = 0.0;
	        String noMinus = equation.replace("-", "+-");
	        String[] byPluses = noMinus.split("\\+");

	        for (String multipl : byPluses) {
	            String[] byMultipl = multipl.split("\\*");
	            double multiplResult = 1.0;
	            for (String operand : byMultipl) {
	                if (operand.contains("/")) {
	                    String[] division = operand.split("\\/");
	                    double divident = Double.parseDouble(division[0]);
	                    for (int i = 1; i < division.length; i++) {
	                        divident /= Double.parseDouble(division[i]);
	                    }
	                    multiplResult *= divident;
	                } else {
	                    multiplResult *= Double.parseDouble(operand);
	                }
	            }
	            result += multiplResult;
	        }

	        return result;
	    }
	}
