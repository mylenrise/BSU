package controller;

import localization.SetLocale;
import model.Text;
import model.TextPart;
import model.Word;
import model.util.Splitter;
import model.util.VowelComparator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {
    Text text;
    VowelComparator wc;
    public String loadController(String path, String fileLocale, String programLocale){
        try {
            String text = new String( Files.readAllBytes( Paths.get( path ) ) );
            this.text = new Text(text);
            SetLocale.setLocale(programLocale);
            wc = new VowelComparator(SetLocale.getVowels(fileLocale));
        } catch (IOException e) {
            return SetLocale.getLocalizedString(SetLocale.INVALID_ARGS);
        }
        return SetLocale.getLocalizedString(SetLocale.FILE_LOADED);
    }

   public String printTextPart(Splitter sp){
        String res= SetLocale.getLocalizedString(SetLocale.DIVIDING_LEVEL) +
                ": " + sp.getLevel() + "\n_________________________________________\n";
        for (TextPart tp: sp.getTextParts())
            res+=tp.getType().toString() + ": " + tp.getValue()+"\n";
        return res+"\n\n";
   }

    public String findMaxSubStr(){
        Pattern pattern = Pattern.compile("[^a-zA-Z\\u0430-\\u044F\\u0410-\\u042F]+");
        Matcher matcher = pattern.matcher(text.getValue());
        int max_length = 0;
        String max_str = "";
        while (matcher.find()) {
            String str = matcher.group();
            if (str.length() > max_length){
                max_length = str.length();
                max_str = str;
            }
        }
        max_str = max_str.replaceAll("[\\n]", "\\\\n");
        max_str = max_str.replaceAll("[\\r]", "\\\\r");
        max_str = max_str.replaceAll("[\"]", "\\\\\"");
        return SetLocale.getLocalizedString(SetLocale.MAX_SUB_STR) + " \"" + max_str + "\"";
    }

    public String sortByVolwes(List<TextPart> ltp){
        ArrayList<Word> slw= new ArrayList<>();
        for (TextPart tp: ltp)
            if (tp instanceof Word)
                slw.add((Word)tp);
        String res = SetLocale.getLocalizedString(SetLocale.SORTED_WORDS) +
                 ":\n____________________________________________________________________\n";
        slw.sort(wc);
        for (Word w: slw)
            res+=w.getValue() + "\n";
        return res+"\n___________________________________________________________________\n";
    }

    public Text getText(){
        return text;
    }
}
