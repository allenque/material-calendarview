package com.prolificinteractive.library.calendarwidget.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;
import com.prolificinteractive.library.calendarwidget.CalendarDay;
import com.prolificinteractive.library.calendarwidget.CalendarWidget;
import com.prolificinteractive.library.calendarwidget.OnDateChangedListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class CustomizeCodeActivity extends ActionBarActivity implements OnDateChangedListener {

    private static final DateFormat FORMATTER = SimpleDateFormat.getDateInstance();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);

        textView = (TextView) findViewById(R.id.textView);

        CalendarWidget widget = (CalendarWidget) findViewById(R.id.calendarView);
        widget.setOnDateChangedListener(this);

        widget.setShowOtherMonths(true);
        widget.setArrowColor(getResources().getColor(R.color.sample_primary));
        widget.setSelectionColor(getResources().getColor(R.color.sample_primary));
        widget.setHeaderTextAppearance(R.style.TextAppearance_AppCompat_Medium);
        widget.setWeekDayTextAppearance(R.style.TextAppearance_AppCompat_Medium);
        widget.setDateTextAppearance(R.style.TextAppearance_AppCompat_Medium);
    }

    @Override
    public void onDateChanged(CalendarWidget widget, CalendarDay date) {
        textView.setText(FORMATTER.format(date.getDate()));
    }

}
