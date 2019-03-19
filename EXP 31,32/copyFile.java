import java.io.*;
class copyFile{
	public static void main(String args[]) {
		try (FileInputStream fin = new FileInputStream(args[0]);
		FileOutputStream fout = new FileOutputStream(args[1])){
			
			int i;
			while ((i=fin.read())!=-1) {
				fout.write((char)i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}