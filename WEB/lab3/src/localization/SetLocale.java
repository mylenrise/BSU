package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class SetLocale {
    public static final String DEFAULT_LANGUAGE = "en";
    private static java.util.Locale locale = new java.util.Locale(DEFAULT_LANGUAGE);

    private static final String BUNDLE_PATH = "localization/locales/locale";
    private static ResourceBundle bundle = ResourceBundle.getBundle(BUNDLE_PATH, locale);

    public static String INVALID_ARGS = "InvalidArgs";
    public static String FILE_LOADED = "FileLoaded";
    public static String DIVIDING_LEVEL = "DividingLevel";
    public static String MAX_SUB_STR = "MaxSubStr";
    public static String SORTED_WORDS = "SortedWords";
    public static String START_COMBINE = "StartCombine";

    public static java.util.Locale getDefaultLocale(){
        return new java.util.Locale(DEFAULT_LANGUAGE);
    }

    public static java.util.Locale getCurrentLocale(){
        return locale;
    }

    public static void setLocale( String localeStr ){
        locale = new java.util.Locale(localeStr);
        bundle = ResourceBundle.getBundle(BUNDLE_PATH, locale);
    }

    public static String getLocalizedString( String string ){
        String str = "?";
        return bundle.getString( string );
    }

    public static char[] getVowels(String localeStr){
        String vowels = ResourceBundle.getBundle(BUNDLE_PATH, new java.util.Locale(localeStr)).getString("vowels");
        char[] res = new char[vowels.length()];
        for (int i = 0; i< res.length; ++i)
            res[i] = vowels.charAt(i);
        return res;
    }

}
