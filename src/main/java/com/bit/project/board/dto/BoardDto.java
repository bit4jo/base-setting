package com.bit.project.board.dto;

public class BoardDto {
	private int idx;
	private String title;
	private String contents;

	public BoardDto() {
	}

	public BoardDto(int idx, String title, String contents) {
		super();
		this.idx = idx;
		this.title = title;
		this.contents = contents;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
}
