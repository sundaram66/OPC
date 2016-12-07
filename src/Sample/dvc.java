package Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by seetharams on 24/10/16.
 */
public class dvc {

    public static void main(String[] args) {

        String furl = "func://wechat.com/cloudSearch-main?q=Quixey";
        String tempFurl = "func://wechat.com/cloudSearch-main?name={name}";

        String val = furl;
        List<String> paramValue = new ArrayList<>();
        String[] urlParts = furl.split("\\?");
        if (urlParts.length == 2) {
            val = urlParts[1];
            String[] queryparams = val.split("&");
            for(int i=0;i<queryparams.length;i=i+1){
                paramValue.add(queryparams[i].split("=")[1]);
            }
        }


        Pattern params = Pattern.compile("\\{(.*?)\\}");
        Matcher matchPattern = params.matcher(tempFurl);
        List<String> paramToReplace = new ArrayList<>();
        while(matchPattern.find()) {
            paramToReplace.add("{" + matchPattern.group(1) + "}");
        }

        tempFurl = replaceParams(tempFurl,paramToReplace,paramValue);
        System.out.println(tempFurl);

    }

    private static String replaceParams(String toBeReplaced, List<String> paramToReplace, List<String> paramValue) {
        int minLen = Math.min(paramToReplace.size(),paramValue.size());
        for(int i=0;i<minLen;i++) {
            toBeReplaced = toBeReplaced.replace(paramToReplace.get(i),paramValue.get(i));
        }
        return toBeReplaced;
    }
}
