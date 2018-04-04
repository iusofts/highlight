
public class HighlightUtilTest {

    public static void main(String[] args) {
        String content = "市场时常会失控，所以要时常把握市场。";
        String keyword[] = "市场 suoyi".split(" ");
        System.out.println(HighlightUtil.contentHighlight(content, keyword, true, 0));
        System.out.println(HighlightUtil.contentHighlight(content, keyword, true, 12));
    }

}