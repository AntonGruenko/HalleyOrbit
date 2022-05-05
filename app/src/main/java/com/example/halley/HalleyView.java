package com.example.halley;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

public class HalleyView extends View {

    public HalleyView(Context context){
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(128, 128, 20, paint);
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);

        for(int i = 40; i <= 580; i += 70){
            canvas.drawCircle(128, 128, i, paint);
        }

        RectF rect = new RectF(-20,230,580,330);
        Paint paintLine = new Paint(Paint.ANTI_ALIAS_FLAG);
        paintLine.setStyle(Paint.Style.STROKE);

        canvas.rotate(45,280,280);
        canvas.drawOval(rect, paintLine);
    }
}
