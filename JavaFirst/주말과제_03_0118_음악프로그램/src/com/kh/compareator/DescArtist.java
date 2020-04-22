package com.kh.compareator;

import java.util.Comparator;

import com.kh.model.vo.Music;

public class DescArtist implements Comparator<Music> {

	@Override
	public int compare(Music o1, Music o2) {
		return o2.getArtist().compareTo(o1.getArtist());
	}

}
