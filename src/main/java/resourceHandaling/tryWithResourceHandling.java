package resourceHandaling;



	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	public class tryWithResourceHandling {

		public static void main(String[] args) {
			try (BufferedReader br = new BufferedReader(new FileReader("C:\\resume_content.txt"))) {
				System.out.println(br.readLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}



