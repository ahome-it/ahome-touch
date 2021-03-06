/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.touch.client.ui;

import com.ait.toolkit.sencha.shared.client.core.XType;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * provides a progress indicator for file uploads.
 */

// TODO Finish this for in Touch4j5
public class ProgressIndicator extends Container {

    @Override
    protected native void init()/*-{
		var c = new $wnd.Ext.ProgressIndicator();
		this.@com.ait.toolkit.sencha.touch.client.core.Component::configPrototype = c.initialConfig;
    }-*/;

    protected ProgressIndicator(JavaScriptObject config) {
        super(config);
    }

    @Override
    protected native JavaScriptObject create(JavaScriptObject config) /*-{
		return new $wnd.Ext.ProgressIndicator(config);
    }-*/;

    @Override
    public String getXType() {
        return XType.PROGRESS_INDICATOR.getValue();
    }

    /**
     * Create a new ProgressIndicator.
     */
    public ProgressIndicator() {
    }

}
