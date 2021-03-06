package com.ait.toolkit.sencha.touch.client.events.dataview;

import com.ait.toolkit.data.client.BaseModel;
import com.ait.toolkit.sencha.shared.client.core.EventObject;
import com.ait.toolkit.sencha.touch.client.ui.ListView;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.DomEvent.Type;

public class ItemTouchStartEvent extends EventObject {

	public static String EVENT_NAME = "itemtouchstart";

	private ListView source;
	private BaseModel record;
	private Element target;
	private int index;

	/**
	 * UiBinder implementations
	 */
	private static Type<ItemTouchStartHandler> TYPE = new Type<ItemTouchStartHandler>(EVENT_NAME, null);

	public static Type<ItemTouchStartHandler> getType() {
		return TYPE;
	}

	public static Type<ItemTouchStartHandler> getAssociatedType() {
		return TYPE;
	}

	protected ItemTouchStartEvent(JavaScriptObject jsObj) {
		super(jsObj);
	}

	public ItemTouchStartEvent(JavaScriptObject jsObj, ListView source, BaseModel record, Element target, int index) {
		super(jsObj);
		this.source = source;
		this.record = record;
		this.target = target;
		this.index = index;
	}

	/**
	 * @return the source
	 */
	public ListView getSource() {
		return source;
	}

	public BaseModel getRecord() {
		return record;
	}

	public Element getTarget() {
		return target;
	}

	public int getIndex() {
		return index;
	}
}
