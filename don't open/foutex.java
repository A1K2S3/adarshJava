import java.io.FileOutputStream;

class foutex{
	public static void main(String[] args) {
		String s = "File No: ";
		FileOutputStream fout;
		try{
			for(int i = 0; i < 5; i++){
				fout = new FileOutputStream("./Foutex/#"+i+"File.txt");
				String f = s + i;
				byte b[] = f.getBytes();
				fout.write(b);
			}
		} catch(Exception e){
			System.out.println(e);
		}
	}
}