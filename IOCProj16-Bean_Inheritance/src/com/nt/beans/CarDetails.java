package com.nt.beans;

public class CarDetails {
	 private String company;
		private String modelname;
	    private String color;
	    private String no;
	    private int capacity;
	    private int milese;
		public CarDetails(String company, String modelname, String color, String no, int capacity, int milese) {
			this.company = company;
			this.modelname = modelname;
			this.color = color;
			this.no = no;
			this.capacity = capacity;
			this.milese = milese;
		}
		@Override
		public String toString() {
			return "CarDetails [company=" + company + ", modelname=" + modelname + ", color=" + color + ", no=" + no
					+ ", capacity=" + capacity + ", milese=" + milese + "]";
		}

}
