import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<ManagementIt> mngt = new ArrayList<>();
        mngt.add(new ManagementIt(1324,5,"Hardware","printer",3));
        String nxtLine = System.lineSeparator();

        String homefolder=System.getProperty("user.home");
        Path path = Paths.get(homefolder+"/calls.csv");

        Scanner sc = new Scanner(path);
        List<ManagementIt> datalist =new ArrayList<>();
        while(sc.hasNextLine()){
            String ln = sc.nextLine();
            System.out.println(ln);

            if(!nxtLine.startsWith("staffId")){
                String [] field=ln.split(",");
                //field[1]=field[1].trim().replace("\"","");
                field[2]=field[2].trim().replace("\"","");
                field[3]=field[3].trim().replace("\"","");
               // field[4]=field[4].trim().replace("\"","");
               // field[5]=field[5].trim().replace("\"","");

                ManagementIt mang = new ManagementIt(Integer.parseInt(field[0]),Integer.parseInt(field[1]),field[2],field[3],Integer.parseInt(field[4]));

                datalist.add(mang);
            }
        }
        System.out.println(datalist);
    }
}
