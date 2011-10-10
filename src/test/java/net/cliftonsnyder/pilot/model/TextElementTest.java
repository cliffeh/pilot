package net.cliftonsnyder.pilot.model;

import net.cliftonsnyder.pilot.model.TextElement;

public class TextElementTest implements TextElement {

	private String id;
	private String text;

	public TextElementTest(String id, String text) {
		this.id = id;
		this.text = text;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getText() {
		return text;
	}

}
