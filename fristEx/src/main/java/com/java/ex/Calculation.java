package com.java.ex;

public class Calculation {

		private int fristnum;
		private int secondNum;
		
		public int getFristnum() {
			return fristnum;
		}
		public void setFristnum(int fristnum) {
			this.fristnum = fristnum;
		}
		public int getSecondNum() {
			return secondNum;
		}
		public void setSecondNum(int secondNum) {
			this.secondNum = secondNum;
		}
		public void add() {
			System.out.println("add");
			System.out.println(fristnum+"+"+secondNum+"="+(fristnum+secondNum));
		}
		public void sub() {
			System.out.println("sub");
			System.out.println(fristnum+"-"+secondNum+"="+(fristnum-secondNum));
		}
		public void mult() {
			System.out.println("mult");
			System.out.println(fristnum+"*"+secondNum+"="+(fristnum*secondNum));
		}
		public void div() {
			System.out.println("div");
			System.out.println(fristnum+"/"+secondNum+"="+(fristnum/secondNum));
		}
}
