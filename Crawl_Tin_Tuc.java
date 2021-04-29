import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static URL url;

    public static void main(String[] args) throws IOException {
        url =new URL("https://dantri.com.vn/the-gioi/cac-lang-gieng-dung-ngoi-khong-yen-khi-an-do-cang-minh-doi-pho-covid-19-20210429144202759.htm");
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\Z");
        String content = scanner.next();
        scanner.close();
        content = content.replaceAll("\\n+","");
        content = content.replaceAll("<a href=\"","");
        content = content.replaceAll("</a>","");
        content = content.replaceAll("\">",": ");
        String str = "<p>(.*?)</p>";
        Pattern p = Pattern.compile(str);
        Matcher m = p.matcher(content);
        while (m.find()){
            System.out.println(m.group(1));
        }
    }
}
