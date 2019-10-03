package Custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class CustomTextView extends TextView {


    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
        // TODO Auto-generated constructor stub
    }
    public CustomTextView(Context context) {
        super(context);
        init();
        // TODO Auto-generated constructor stub
    }
    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
        // TODO Auto-generated constructor stub
    }
    private void init(){
        Typeface font_type= Typeface.createFromAsset(getContext().getAssets(), "font/Roboto-Regular.ttf");
        setTypeface(font_type);
    }
}