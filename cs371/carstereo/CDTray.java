package cs371.carstereo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by resop18 on 1/26/2017.
 */
public class CDTray extends SurfaceView {

    public CDTray(Context context, AttributeSet attrs)
    {
        super(context,attrs);
    }

    @Override
    public void onDraw(Canvas canvas)
    {
        Paint cdTray = new Paint();
        cdTray.setColor(0xFF202020);
        canvas.drawRect(250f,200f,1800f,240f,cdTray);
    }
}
