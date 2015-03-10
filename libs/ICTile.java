package com.demo.controls;

import com.demo.speedometer.R;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ICTile extends LinearLayout {
	
	private TextView paneTitleView;
	private TextView paneSubtitleView;
	private TextView measurementValueView;
	private TextView measurementUnitView;
	private LinearLayout graphLytView;

	public ICTile(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Tile, 0, 0);
		try{
			String paneTitle = a.getString(R.styleable.Tile_pane_title);
			String paneSubtitle = a.getString(R.styleable.Tile_pane_subtitle);
			String measurementValue = a.getString(R.styleable.Tile_measurement_value);
			String measurementUnit = a.getString(R.styleable.Tile_measurement_unit);
		
			setOrientation(LinearLayout.HORIZONTAL);
		LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		inflater.inflate(R.layout.tile, this, true);
		
		paneTitleView = (TextView)findViewById(R.id.txtbx_lbl_pane_title);
		paneSubtitleView = (TextView)findViewById(R.id.txtbx_lbl_pane_subtitle);
		measurementValueView = (TextView)findViewById(R.id.txtbx_lbl_measurement_value);
		measurementUnitView = (TextView)findViewById(R.id.txtbx_lbl_measurement_unit);
		graphLytView = (LinearLayout)findViewById(R.id.lyt_chart);
		
		paneTitleView.setText(paneTitle);
		paneSubtitleView.setText(paneSubtitle);
		measurementValueView.setText(measurementValue);
		measurementUnitView.setText(measurementUnit);
		}finally{
			a.recycle();
		}
	}

	public TextView getPaneTitleView() {
		return paneTitleView;
	}

	public void setPaneTitleView(TextView paneTitle) {
		this.paneTitleView = paneTitle;
	}

	public TextView getPaneSubtitleView() {
		return paneSubtitleView;
	}

	public void setPaneSubtitleView(TextView paneSubtitle) {
		this.paneSubtitleView = paneSubtitle;
	}

	public TextView getMeasurementValueView() {
		return measurementValueView;
	}

	public void setMeasurementValueView(TextView measurementValue) {
		this.measurementValueView = measurementValue;
	}

	public TextView getMeasurementUnitView() {
		return measurementUnitView;
	}

	public void setMeasurementUnitView(TextView measurementUnit) {
		this.measurementUnitView = measurementUnit;
	}

	public LinearLayout getGraphLytView() {
		return graphLytView;
	}

	public void setGraphLytView(LinearLayout graphLyt) {
		this.graphLytView = graphLyt;
	}

}
