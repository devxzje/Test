package testiq;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestIQ {

    public static void main(String[] args) {
        String input;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập gì cũng được ạ: ");
        input = sc.nextLine();
        int dem = demChu(input);
        System.out.println("Số lượng chữ cái Tiếng Việt có thể được tạo thành trong chuỗi: " + dem);
    }

    public static int demChu(String input) {
        String vietnamesePattern = "[a-zA-ZđĐÀÁẢÃẠĂẰẮẲẴẶÂẦẤẨẪẬÈÉẺẼẸÊỀẾỂỄỆÌÍỈĨỊÒÓỎÕỌÔỒỐỔỖỘƠỜỚỞỠỢÙÚỦŨỤƯỪỨỬỮỰỲÝỶỸỴàáảãạăằắẳẵặâầấẩẫậèéẻẽẹêềếểễệìíỉĩịòóỏõọôồốổỗộơờớởỡợùúủũụưừứửữựỳýỷỹỵ]+";
        Pattern pattern = Pattern.compile(vietnamesePattern);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }

}
