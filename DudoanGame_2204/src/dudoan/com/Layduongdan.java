package dudoan.com;
import java.io.File;
public class Layduongdan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:/music/bolero/longme.mp3";
		try {
            System.out.println("Đường dẫn gốc: " + path);
            int post = path.lastIndexOf("/");
            int dot = path.lastIndexOf(".");
            if (post == -1 || dot == -1) {
                throw new Exception("Định dạng đường dẫn không hợp lệ!");
            }
            String tenFileDayDu = path.substring(post + 1);
            System.out.println("Tên file: " + tenFileDayDu);

            String tenBH = path.substring(post+ 1, dot);
            System.out.println("Tên bài hát: " + tenBH);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Lỗi: Không thể cắt chuỗi, vui lòng kiểm tra lại vị trí dấu gạch và dấu chấm.");
        } catch (NullPointerException e) {
            System.out.println("Lỗi: Đường dẫn không được để trống (null).");
        } catch (Exception e) {
            System.out.println("Thông báo: " + e.getMessage());
        } finally {
            System.out.println("--- Yup ---");
        }
    }

}
