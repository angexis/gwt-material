package gwt.material.design.client.ui;

/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

@SuppressWarnings("deprecation")
public class ListItem extends ComplexPanel {
	
	private String opacity;
	
	public ListItem() {
		setElement(DOM.createElement("LI"));
	}

	public ListItem(Widget item) {
		setElement(DOM.createElement("LI"));
		add(item);
	}

	public void add(Widget w) {
		super.add(w, getElement());
	}

	public void insert(Widget w, int beforeIndex) {
		super.insert(w, getElement(), beforeIndex, true);
	}

	public String getOpacity() {
		return opacity;
	}

	public void setOpacity(String opacity) {
		this.opacity = opacity;
		this.getElement().getStyle().setOpacity(Double.parseDouble(opacity));
	}

}