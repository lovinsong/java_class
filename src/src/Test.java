import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	// # JSON
	//	- JavaScript���� ����ϴ� MapŸ�� 
	//	- ���ڿ������� Map�� �����ϰ� ǥ���� �� �־ �αⰡ ����
	//	- { Key : Value, Key : Value }�� ���¸� ������

	// # JSON Value�� ���Ǵ� �ڹٽ�ũ��Ʈ Ÿ�Ե�
	//	- '', "" : String
	//	- ����, �Ҽ� : Number
	//	- [] : Array
	//	- {} : JSON
	
	// # JAVA���� JSONŸ���� �������� �ʱ� ������  
	//	 �����͵��� JSON ������ ���ڿ��� �������� �Ѵ� (Parsing, Binding) 
	
	public static void mapToJsonFile(Map<String, Object> map) throws IOException {
		StringBuilder builder = new StringBuilder();
		
		builder.append("{\n");
		
		int count = 0;		
		int size = map.size() - 1;
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			
			builder.append("\t\"" + key + "\"\t: ");		
			
			if (value == null) {
				builder.append("null");
			} else if (value instanceof String) {
				builder.append("'" + value + "'");
			} else if (value instanceof Object[]) {
				
				Object[] arr = (Object[]) value;				
				
				if (arr.length == 0) {
					builder.append("[]");
				}
				
				if (arr instanceof String[]) {
					builder.append("[");
					
					int len = arr.length - 1;
										
					int lencount = 0;
					for (Object obj : arr) {
						builder.append("'" + obj + "'");
					
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}					
				} else {
					builder.append("[");
					
					int len = arr.length - 1;
					
					int lencount = 0;
					for (Object obj : arr) {
						builder.append(obj);
					
						if (lencount++ == len) {
							builder.append("]");
						} else {
							builder.append(", ");
						}
					}	
				}
				
			} else {
				builder.append(value);
			} 
			
			if (count++ == size) {
				builder.append("\n}");
			} else {
				builder.append(",\n");
			}
		}
				
		// System.out.println(builder);
		
		FileWriter fw = new FileWriter("D:\\java_io\\data.json");
		
		fw.write(new String(builder));
		
		fw.close();
		
		System.out.println("���Ͼ��� �Ϸ�");
	}
	
	public static void jsonFileToMap(Map<String, Object> map) throws IOException {
		FileReader fr = new FileReader("D:\\java_io\\data.json");
				
		StringBuilder sb = new StringBuilder();
		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char)ch);
		}
		System.out.println("���Ͽ��� �о�� ����:");
		System.out.println(sb);
		
		fr.close();
		
		String jsonObj = new String(sb);
		
		Pattern entry_pattern = Pattern.compile(".+:.+\n");
		
		Matcher matcher = entry_pattern.matcher(jsonObj);
		
		while (matcher.find()) {
			// ����ǥ�������� ��Ʈ���� ������ �� ��ǥ�� ������ ����
			String entry = matcher.group().trim();
			
			if (entry.charAt(entry.length() - 1) == ',') {
				entry = entry.substring(0, entry.length() - 1);
			}
			System.out.println("Entry: " + entry);
			
			String[] split_entry = entry.split(":");
			
			String key = split_entry[0].trim().replaceAll("[\"\']", "");
			String value = split_entry[1].trim();
			
			System.out.println("key : " + key);
			System.out.println("value : " + value);
			
			if (value.equals("null")) {
				
				System.err.println("null");
				map.put(key, null);
				
			} else if (Pattern.matches("[\"\'].+[\"\']", value)) {
				
				System.err.println("���ڿ��� ������");
				map.put(key, value.replaceAll("[\"\']", ""));
				
			} else if (Pattern.matches("\\d+", value)) {
				
				System.err.println("���ڷ� ������");
				map.put(key, Integer.parseInt(value));
				
			} else if (Pattern.matches("\\d+\\.\\d+", value)) {
				
				System.err.println("�Ҽ��� ������");
				map.put(key, Double.parseDouble(value));
				
			} else if (Pattern.matches("\\[.+\\]", value)) {
				System.err.println("�迭�� ������");
				
				value = value.replaceAll("[\\[\\]]", "");
				
				String[] items = value.split(",");				
				Object[] objs = null;
								
				// �迭 ������ ������ ���ڿ��� ��
				if (Pattern.matches("[\"\'].+[\"\']", items[0])) {
					objs = new String[items.length];
					
					for (int i = 0; i < items.length; ++i) {
						objs[i] = items[i].trim().replaceAll("[\"\']", "");						
					}					
				} else if (Pattern.matches("\\d+", items[0])) {
					objs = new Integer[items.length];
					
					for (int i = 0; i < items.length; ++i) {
						objs[i] = Integer.parseInt(items[i].trim());
					}
				} else if (Pattern.matches("\\d+\\.\\d+", items[0])) {
					objs = new Double[items.length];
					
					for (int i = 0; i < items.length; ++i) {
						objs[i] = Double.parseDouble(items[i].trim());
					}
				}	
				
				map.put(key, objs);
			}
			
			System.out.println("---------------------------------");
		}
	}
	
	public static void main(String[] args) throws IOException {
		// ���� Map�� ����� �����͸� JSON������ ���ڿ��� �����Ͽ� ����غ�����		
		HashMap<String, Object> map = new HashMap<>();		
		map.put("name", "ȫ�浿");
		map.put("age", 15);
		map.put("tel", "010-1234-1234");
		map.put("abc", null);
		map.put("programming", new String[] {"JAVA", "Python", "JS"});
		map.put("lotto", new Integer[] {1, 2, 3, 4, 5, 6});
		
		// instanceof �����ڸ� ���� �ش� ���� Ÿ���� ������ �� �ִ�
//		System.out.println(map.get("name") instanceof String);
//		System.out.println(map.get("age") instanceof String);
//		System.out.println(map.get("age") instanceof Integer);
//		System.out.println(map.get("programming") instanceof Object[]);
		/* �ùٸ� ��� : 		 
		 	{ 
		 		"name" : 'ȫ�浿', 
		 		"age" : 15, 
		 		"tel" : '010-1234-1234',
		 		"programming" : ['JAVA', 'Python', 'JS']
		 	}		 		 
		 */
		
		
		// mapToJsonFile(map);
		
		HashMap<String, Object> map2 = new HashMap<>();
		
		// .json���Ͽ� ����� �����͸� JAVA Map���� ��ȯ�ϴ� �޼��带 �������� 
		jsonFileToMap(map2);	
		
		System.out.println(map2);
		System.out.println(Arrays.toString((Integer[])map2.get("lotto")));
		System.out.println(Arrays.toString((String[])map2.get("programming")));
	}
	
}














