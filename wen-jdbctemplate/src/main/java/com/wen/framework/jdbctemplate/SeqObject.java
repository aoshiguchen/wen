package com.wen.framework.jdbctemplate;

public class SeqObject implements Comparable<SeqObject>{
	
	private int seq;
	private Object obj;
	
	public SeqObject(){
		
	}
	
	public SeqObject(int seq,Object obj){
		this.seq = seq;
		this.obj = obj;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "SeqObject [seq=" + seq + ", obj=" + obj + "]";
	}

	@Override
	public int compareTo(SeqObject seqObject) {

		return seq - seqObject.seq;
	}
	
	
}
