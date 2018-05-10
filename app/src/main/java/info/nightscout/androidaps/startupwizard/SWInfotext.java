package info.nightscout.androidaps.startupwizard;

import android.content.Context;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SWInfotext extends SWItem {
    private static Logger log = LoggerFactory.getLogger(SWInfotext.class);
    private String textLabel = null;

    public SWInfotext() {
        super(Type.TEXT);
    }

    public SWInfotext label(String newLabel){
        this.textLabel = newLabel;
        return this;
    }

    @Override
    public void generateDialog(View view, LinearLayout layout) {
        Context context = view.getContext();

        TextView l = new TextView(context);
        l.setId(view.generateViewId());
        if(textLabel != null)
            l.setText(textLabel);
        else
            l.setText(label);
        layout.addView(l);

    }

}