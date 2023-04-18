package clockApp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // # 91 clock app 
		 System.out.println(" # 91. clock app: ");
        
        // displaying day of week
        SimpleDateFormat simpleformat = new SimpleDateFormat("EEEE");
        String strDayofWeek = simpleformat.format(new Date());
        System.out.println("Day of Week = "+strDayofWeek);  // Day of Week = 星期日
        
        new MyFrameClockApp();
	}

}
