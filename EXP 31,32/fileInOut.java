import java.io.*;
class fileInOut{
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\adarshJava\\EXP 31,32\\Files\\fileInOut.txt");
			String s = "Adarsh Senghani";
			byte	b[] = s.getBytes();
			fout.write(b);
			fout.close();
			
			FileInputStream fin = new FileInputStream("D:\\adarshJava\\EXP 31,32\\Files\\fileInOut.txt");
			int i;
			while ((i=fin.read())!=-1) {
				System.out.print((char)i);
			}
			fin.close();
		} catch (Exception e) {
				System.out.println(e);
		}
	}
}