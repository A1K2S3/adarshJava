import java.io.FileOutputStream;
import java.net.*;
import java.nio.channels.*;
import java.lang.*;
import java.nio.channels.FileChannel;

class browser{


	final static String front = "http://43.240.64.241:81/Marksheets/EnrollmentNumber/17/";
	final static String back = "Marksheet.html";
  static String[] enroll = new String[] {
		"1715080059","1715080060","1715080061", "1715080062", "1715080064", "1715080065", "1715080066", "1715080072", "1715080074", "1715080076", "1715080077", "1715080078", "1715080079", "1715080080", "1715080081", "1715080082", "1715080083", "1715080084", "1715080085", "1715080086", "1715080087", "1715080090", "1715080092", "1715080093", "1715080097", "1715080104", "1715080105", "1715080108", "1715080109", "1715080112", "1715080113", "1715080116", "1715080117", "1715080118", "1715080119", "1715080120", "1715080123", "1715080124", "1715080399"
	};


	public static void main(String[] args) {
		try {
			// FileOutputStream fileStream;
			URL website;
				for(int i = 0; i < 1; i++){
					website = new URL(front + enroll + back);
			// 		ReadableByteChannel rbc = Channels.newChannel(website.openStream());
			// 		fileStream = new FileOutputStream("./Results/"+enroll[i]+".html");
			// 		fileStream.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
			// URL website = new URL("http://www.website.com/information.asp");
// ReadableByteChannel rbc = Channels.newChannel(website.openStream());
// FileOutputStream fos = new FileOutputStream("./Results/"+enroll[i]+".html");
// fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);	/
		FileUtils.copyURLToFile(website, "./Results/"+enroll[i]+".html");	
				}
		} catch(Exception e){
			System.out.println(e);
		}
	}
}