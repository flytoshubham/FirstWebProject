package com.allstate.training.pojo;

import java.io.Serializable;

public class Trainer implements Serializable {
String trainerid;
String trainername;
public void setTrainerid(String trainerid) {
	this.trainerid = trainerid;
}
public void setTrainername(String trainername) {
	this.trainername = trainername;
}
@Override
public String toString() {
	return "Trainer [trainerid=" + trainerid + ", trainername=" + trainername + "]";
}

}
