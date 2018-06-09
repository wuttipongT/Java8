import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;
class Steams 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter( string -> !string.isEmpty() ).collect( Collectors.toList() );

		strings.forEach(System.out::println);
		System.out.println("Data filtered....");
		filtered.forEach(System.out::println);

		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i * i).distinct().collect(Collectors.toList());

		squaresList.forEach(System.out::println);

		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println( count + " ");
	
		random.ints().limit(10).sorted().forEach(System.out::println);

		System.out.println("Filtered List: " + filtered);
		String mergedString = filtered.stream().collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();

		System.out.println("Highest number in List : " + stats.getMax());
		System.out.println("Lowest number in List : " + stats.getMin());
		System.out.println("Sum of all numbers : " + stats.getSum());
		System.out.println("Average of all numbers : " + stats.getAverage());


		System.out.println("Using Java 7: ");
		System.out.println("List: " +strings);
		count = getCountEmptyStringUsingJava7(strings);
		System.out.println("Empty Strings: " + count);
		count = getCountLength3UsingJava7(strings);
		System.out.println("Strings of length 3: " + count);

		//Eliminate empty string
		filtered  = deleteEmptyStringsUsingJava7(strings);
		System.out.println("Filtered List: " + filtered);

		//Eliminate empty string and join using comma.
		mergedString = getMergedStringUsingJava7(strings, ", ");
		System.out.println("Merged String: " + mergedString);

		squaresList = getSquares(numbers);
		System.out.println("Squares List: " + squaresList);
		List<Integer> integers = Arrays.asList(1,2,13,4,15,6,17,8,19);

		System.out.println("List: " +integers);
		System.out.println("Highest number in List : " + getMax(integers));
		System.out.println("Lowest number in List : " + getMin(integers));
		System.out.println("Sum of all numbers : " + getSum(integers));
		System.out.println("Average of all numbers : " + getAverage(integers));
		System.out.println("Random Numbers: ");
		
		//print ten random numbers
		for(int i = 0; i < 10; i++) {
		 System.out.println(random.nextInt());
		}

	}

	private static int getCountEmptyStringUsingJava7(List<String> strings){
		int count = 0;

		for(String string : strings){

			if(string.isEmpty()){
				count++;
			}
		}

		return count;
	}

	private static int getCountLength3UsingJava7(List<String> strings){
		int count = 0;

		for(String string : strings){

			if(string.length() == 3){
				count++;
			}
		}

		return count;
	}

	private static List<String> deleteEmptyStringsUsingJava7(List<String> strings){
		List<String> filteredList = new ArrayList<String>();

		for(String string : strings){
			if(!string.isEmpty()){
				filteredList.add(string);
			}
		}

		return filteredList;
	}

	private static String getMergedStringUsingJava7(List<String> strings, String separator){
		StringBuilder stringBuilder = new StringBuilder();

		for(String string : strings){
			if(!string.isEmpty()){
				stringBuilder.append(string);
				stringBuilder.append(separator);
			}
		}

		String mergedString = stringBuilder.toString();
		return mergedString.substring(0, mergedString.length()-2);
	}

	public static List<Integer> getSquares(List<Integer> numbers){
		List<Integer> squaresList = new ArrayList<Integer>();

		for(Integer number : numbers){
			Integer square = new Integer(number.intValue() * number.intValue());
			if(!squaresList.contains(square)){
				squaresList.add(square);
			}
		}

		return squaresList;
	}

	public static int getMax(List<Integer> numbers){
		int max = numbers.get(0);

		for(int i = 1; i< numbers.size(); i++){
			Integer number = numbers.get(i);

			if(number.intValue() > max){
				max = number.intValue();
			}
		}

		return max;
	}

	public static int getMin(List<Integer> numbers){
		int min = numbers.get(0);

		for(int i = 1; i < numbers.size(); i++){
			Integer number = numbers.get(i);

			if(number.intValue() < min){
				min = number.intValue();
			}
		}

		return min;
	}

	public static int getSum(List numbers){
		int sum = (int)(numbers.get(0));

		for(int i = 1; i < numbers.size(); i++){
			sum += (int)numbers.get(i);
		}

		return sum;
	}

	public static int getAverage(List<Integer> numbers){
		return getSum(numbers) / numbers.size();
	}
	
}
