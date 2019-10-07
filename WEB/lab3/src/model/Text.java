package model;

public class Text extends TextPart{
    public Text( String value ){
        super(value, Type.TEXT);
    }

    @Override
    protected boolean isCorrect( String value ){
        return true;
    }

}
