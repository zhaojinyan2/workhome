
import com.spire.xls.*;


public class test4 {

    public static void main(String[] args) {

        String path="C:\\Users\\PC\\Desktop\\test\\execl1.xlsx";
        Workbook workbook = new Workbook();
        workbook.loadFromFile(path);

        Worksheet sheet=workbook.getWorksheets().get(0);
        System.out.println(workbook.getDocumentProperties().getAuthor());
        System.out.println();



    }
}
