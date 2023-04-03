package com.bridgelabz.employewagecomputationprograms;

public class EmpWageBuilderObject {


	private static final int IS_PART_TIME = 1;
	private static final int IS_FULL_TIME = 2;
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHourPerMonth;
	private int totalEmpWage;

	 public EmpWageBuilderObject(String company, int empRatePerHour, int numOfWorkingDays, int maxHourPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHourPerMonth = maxHourPerMonth;
	}

	public void computeEmpWage() {

		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

		while (totalEmpHrs <= maxHourPerMonth && totalWorkingDays < numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Days :" + "totalWorkingDays" + "Emp Hr:" + empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for Company " + company + " is: " + totalEmpWage;
	}

	public static void main(String[] args) {
		EmpWageBuilderObject orion = new EmpWageBuilderObject("Orion", 25, 3, 35);
		EmpWageBuilderObject inorbit = new EmpWageBuilderObject("Inorbit", 20, 2, 25);
		orion.computeEmpWage();
		inorbit.computeEmpWage();
		System.out.println(orion);
		System.out.println(inorbit);
	}


	}


