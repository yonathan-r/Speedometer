package com.demo.controls;

import com.demo.speedometer.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Tile extends LinearLayout {
	
	private TextView paneTitleView;
	private TextView paneSubtitleView;
	private TextView measurementValueView;
	private TextView measurementUnitView;
	private LinearLayout paneTopBarView;
	private LinearLayout graphSpace;
	
	private String paneTitle;
	private String paneSubtitle;
	private String measurementValue;
	private String measurementUnit;
	
	private boolean paneTopBarViewVisible;
	private boolean graphSpaceVisible;
	
	public Tile(Context context, AttributeSet attrs) {
		super(context, attrs);
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Tile, 0, 0);
		paneTitle = a.getString(R.styleable.Tile_pane_title);
		paneSubtitle = a.getString(R.styleable.Tile_pane_subtitle);
		measurementValue = a.getString(R.styleable.Tile_measurement_value);
		measurementUnit = a.getString(R.styleable.Tile_measurement_unit);
		paneTopBarViewVisible = a.getBoolean(R.styleable.Tile_pane_top_bar_visible, true);
		graphSpaceVisible = a.getBoolean(R.styleable.Tile_graph_space_visible, true);
		
		a.recycle();
		
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.tile, this, true);
		
		paneTitleView = (TextView)findViewById(R.id.txtbx_lbl_pane_title);
		paneSubtitleView = (TextView)findViewById(R.id.txtbx_lbl_pane_subtitle);
		measurementValueView = (TextView)findViewById(R.id.txtbx_lbl_measurement_value);
		measurementUnitView = (TextView)findViewById(R.id.txtbx_lbl_measurement_unit);
		paneTopBarView = (LinearLayout)findViewById(R.id.lyt_pane_top_bar);
		graphSpace = (LinearLayout)findViewById(R.id.lyt_chart);
		
		paneTitleView.setText(paneTitle);
		paneSubtitleView.setText(paneSubtitle);
		measurementValueView.setText(measurementValue);
		measurementUnitView.setText(measurementUnit);
		
		if(!paneTopBarViewVisible)
			paneTopBarView.setVisibility(View.GONE);
		if(!graphSpaceVisible)
			graphSpace.setVisibility(View.GONE);	
	}

}
