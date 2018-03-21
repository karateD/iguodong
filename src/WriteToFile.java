

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class WriteToFile {

	public WriteToFile(String path,ArrayList<String> suanshi)
	{
		try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(path));
            bw.write("201571030307");   //–¥»Î—ß∫≈
            bw.newLine();
            for(String pa:suanshi){
                bw.write(pa);  
                bw.newLine();
            }
            bw.close();
        } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
	}
}
