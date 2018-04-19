 public class ComputeResult {
        public static void main(String[] args) {
            String original = "software";
			
			String subStringDemo = "Was it a car or a cat I saw?";
			
			String hannah = "Did Hannah see bees? Hannah did.";
			
			StringBuilder result = new StringBuilder("hi");
            int index = original.indexOf('a');

    /*1*/   result.setCharAt(0, original.charAt(0)); //si
    /*2*/   result.setCharAt(1, original.charAt(original.length()-1)); //se
    /*3*/   result.insert(1, original.charAt(4)); //swe
    /*4*/   result.append(original.substring(1,4)); //sweoft
    /*5*/   result.insert(3, (original.substring(index, index+2) + " "));  //swear oft
            System.out.println(result);
			
			System.out.println(subStringDemo.substring(9,12)); // car
			
			System.out.println(hannah.length());
			System.out.println(hannah.charAt(12));
			System.out.println(hannah.charAt(15));
			
			System.out.println(result.capacity());
        }
    }
