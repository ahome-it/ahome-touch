package com.ait.toolkit.sencha.touch.charts.client.events;

import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.touch.charts.client.series.AbstractSeries;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ItemPinchEndEvent extends EventObject {

	public static String EVENT_NAME = "itempinchend";

	private AbstractSeries series;
	private JavaScriptObject item;

	public ItemPinchEndEvent(AbstractSeries series, JavaScriptObject item, JavaScriptObject nativeEvent) {
		super(nativeEvent);
		this.series = series;
		this.item = item;
	}

	/**
	 * UiBinder implementations
	 */
	private static Type<ItemPinchEndHandler> TYPE = new Type<ItemPinchEndHandler>(EVENT_NAME, null);

	public static Type<ItemPinchEndHandler> getType() {
		return TYPE;
	}

	public static Type<ItemPinchEndHandler> getAssociatedType() {
		return TYPE;
	}

	protected ItemPinchEndEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public AbstractSeries getSeries() {
		return series;
	}

	public JavaScriptObject getItem() {
		return item;
	}

}
