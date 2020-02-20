//Zhilin Jiang
import java.io.*;
import java.util.*;
public class HW1 {
	//example from 
	//https://www.tutorialspoint.com/how-to-read-the-data-from-a-csv-file-in-java
	public static final String delimiter = ",";
	public static void main(String[] args) throws IOException {
		File file = new File("regional-global-weekly-2020-01-17--2020-01-24.csv");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
    
		LinkedList<String> songList = new LinkedList<String>();
		LinkedList<String> artistList = new LinkedList<String>();
    
		String line ="";
		String[] tempArr;
    
		while ((line = br.readLine()) != null) {
			tempArr = line.split(delimiter);
      
			//data[0] = position, data[3] = streams, data[4] = url;
      
			String song = tempArr[1];
			songList.add(song);
      
			String artist = tempArr[2];
			artistList.add(artist);
		}
		br.close();
		System.out.print("The most streamed artist now is " + artistList.get(0));
    
		System.out.println(" and The name of the song is " + songList.get(0));
		
		//example from
		//https://www.programcreek.com/2012/09/sort-a-string-linkedlist-in-java/
		//sort in ascending order
		Collections.sort(artistList);
    
		System.out.println("\nArtist names in ascending order");
		System.out.println(artistList);	
	}
	}
