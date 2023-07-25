package Algoritm3;

import java.util.Comparator;

public class EmployeeComporator implements Comparator<Emloyee> {
	private SotrType sortType;

	public EmployeeComporator(SotrType sortType) {
		this.sortType = sortType;
	}

	public int compare(Emloyee o1, Emloyee o2) {
		int nameRes = sortType == SotrType.Ascending ? o1.getName().compareTo(o2.getName())
				: o2.getName().compareTo(o1.getName());
		if (nameRes == 0) {
			return sortType == SotrType.Ascending ? Integer.compare(o1.getAge(), o2.getAge())
					: Integer.compare(o2.getAge(), o1.getAge());
		}
		return nameRes;
	}
}
