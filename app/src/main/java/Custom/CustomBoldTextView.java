package Custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class CustomBoldTextView extends TextView {


    public CustomBoldTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        // TODO Auto-generated constructor stub
    }
    public CustomBoldTextView(Context context) {
        super(context);
        init();
        // TODO Auto-generated constructor stub
    }
    public CustomBoldTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        // TODO Auto-generated constructor stub
    }
    private void init(){
        Typeface font_type= Typeface.createFromAsset(getContext().getAssets(), "font/Roboto-Bold.ttf");
        setTypeface(font_type);
    }
}