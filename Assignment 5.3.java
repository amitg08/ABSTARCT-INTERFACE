
public class Employee {
	int empId;
	String empName;
	int total_leaves;
	double total_salary;
	void calculate_balance_leaves(){
		
	}
	boolean avail_leave(int no_of_leaves, char type_of_leave){
		return true;
		
	}
	void calculate_salary(){
		
	}
	public static void main(String[] args){
	PermanentEmp p = new PermanentEmp(12, 6, 6);
	p.print_leave_details();
	p.avail_leave(5, 'c');
	// c =  casual leave
	// p =  paid leave
	// s =  sick leave
	p.calculate_salary();
	
	TemporaryEmp t = new TemporaryEmp();
	t.avail_leave(6, 'p');
	t.calculate_balance_leaves();
	t.calculate_salary();
	
	}

}

class PermanentEmp extends Employee{
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
	PermanentEmp(int paid_leave, int sick_leave, int casual_leave){
		//super total_leaves;
		this.paid_leave=paid_leave;
		this.sick_leave=sick_leave;
		this.casual_leave=casual_leave;
	}
	void print_leave_details(){
		System.out.println("paid_leave " +paid_leave + "sick_leave "+ sick_leave
				+ "casual_leave " + casual_leave);
		
	}
	 void calculate_balance_leaves(){
		 
		 super.total_leaves = paid_leave + sick_leave + casual_leave;
		 
		
	}
	 boolean avail_leave(int no_of_leaves, char type_of_leave){
		return true;
				
	}
	 void calculate_salary(){
		 pfa = 0.12 * basic;
		 hra = 0.5 * basic;
		 super.total_salary = basic + hra - pfa;
		 
		
	}
}

class TemporaryEmp extends Employee{
	int paid_leave, sick_leave, casual_leave;
	double basic, hra,pfa;
    void calculate_balance_leaves(){
    	super.total_leaves = paid_leave + sick_leave + casual_leave;
    	
    }
	boolean avail_leave(int no_of_leaves, char type_of_leave){
		return true;
		
	}
    void calculate_salary(){
    	pfa = 0.12 * basic;
		hra = 0.5 * basic;
		super.total_salary = basic + hra - pfa;
    	
    }
	
}
