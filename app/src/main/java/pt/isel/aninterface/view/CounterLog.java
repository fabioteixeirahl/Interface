package pt.isel.aninterface.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import pt.isel.aninterface.model.CounterListerner;

public class CounterLog extends View implements CounterListerner {

    int value = 0;

    public CounterLog(Context ctx) { super(ctx); }

    public CounterLog(Context ctx, AttributeSet attrs) { super(ctx, attrs); }

    Paint p = new Paint();
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(canvas.getWidth()/2,canvas.getHeight()/2,(value*5),p);
    }

    @Override
    public void updateValue(int value) {
        this.value = value;
        Log.e("Value", Integer.toString(value));
        invalidate();
    }
}
