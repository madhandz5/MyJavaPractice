package com.kh.controller;

import java.util.ArrayList;

import com.kh.model.vo.Music;

public class MusicController {

	ArrayList<Music> list = new ArrayList<>();

	public MusicController() {

	}

	public void addList(Music music) {
		list.add(music);
	}

	public ArrayList<Music> selectList() {
		return list;
	}

	public Music searchMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().contains(title)) {
				return list.get(i);
			}
		}
		return null;
	}

	public int removeMusic(String title) {
		Music old = null;
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.get(i);
				list.remove(i);
			}
		}
		if (old != null) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}

	public int updateMusic(String title, Music updateMusic) {
		Music old = null;
		int result = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getTitle().equals(title)) {
				old = list.get(i);
				list.set(i, updateMusic);
			}
		}
		if (old != null) {
			result = 1;
		} else {
			result = 0;
		}
		return result;
	}
}
