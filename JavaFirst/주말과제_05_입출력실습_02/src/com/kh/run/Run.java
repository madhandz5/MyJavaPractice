package com.kh.run;

import com.kh.controller.SungjukProcess;

public class Run {

	public static void main(String[] args) {
		SungjukProcess sProcess = new SungjukProcess();
		sProcess.sungjukSave();
		sProcess.scoreRead();
	}

}
