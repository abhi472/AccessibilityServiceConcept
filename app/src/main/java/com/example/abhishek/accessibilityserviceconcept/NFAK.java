package com.example.abhishek.accessibilityserviceconcept;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by abhishek on 10/5/16.
 */
public class NFAK extends AccessibilityService {//named it NFAK cz Nusrat Fateh Ali Khan is great and i was listening to tere jiye hor disda
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
//        Log.v("TAG", String.format(
//                "%s  %s  %s %s"
//                , event.getClassName(), event.getPackageName(),
//                event.getEventTime(), event.describeContents()));
        AccessibilityNodeInfo source = event.getSource();

        if (source != null) {
            for (int i = 0; i < source.getChildCount(); i++) {
                AccessibilityNodeInfo child = source.getChild(i);

                if (child != null) {

                    CharSequence text = child.getText();
                    if (text!=null) {
                        Log.v("TAG", text.toString());
                    }
                }
            }
        }
    }

    @Override
    public void onInterrupt() {

    }
}
