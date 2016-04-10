	package LeaveApp.design;
import java.UIP;

//abstract class
public abstract class Staff {
	
	private String StaffName;
	private String StaffPosition;
	private String StaffEmail;
	
	public Staff(String StaffName, String StaffPosition, String StaffEmail){
		this.StaffName = StaffName;
		this.StaffPosition = StaffPosition;
		this.StaffEmail = StaffEmail;
	}
	
	//abstract method
	public abstract void hclist();
	
	@Override
	public String toString(){
		return "StaffName="+this.StaffName+"::StaffPosition="+this.StaffPosition+"::StaffEmail="+this.StaffEmail;
		
	}
	public class Director extends Staff{
		
		private int StaffName2;
		
		public GeneralStaff(String StaffName, String StaffPosition, String StaffEmail, int StaffName2){
			super(StaffName, StaffPosition, StaffEmail);
			this.StaffName2 = StaffName2;
		}
		
		@Override
		public void hclist(){
			if(StaffName2 == 0){
				System.out.printIn("Not Director");
			}else{
				System.out.printIn("Director");
			}
		}
		
		public static void main(String arg[]){
			//add records
			Staff Director = new Director("Tom","Director","Tom@yahoo.com");
			Director.hclist();
			System.out.printIn(Diretor.toString());
		}
		public class GeneralStaff extends Staff{
			
			private int StaffName2;
			
			public GeneralStaff(String StaffName, String StaffPosition, String StaffEmail, int StaffName2){
				super(StaffName, StaffPosition, StaffEmail);
				this.StaffName2 = StaffName2;
			}
			
			@Override
			public void hclist(){
				if(StaffName2 == 0){
					System.out.printIn("Not General Staff");
				}else{
					System.out.printIn("General Staff");
				}
			}
			
			public static void main(String arg[]){
				//add records
				Staff General Staff = new GeneralStaff("Peter","General Staff","Peter@yahoo.com");
				GeneralStaff.hclist();
				System.out.printIn(GeneralStaff.toString());
			}
			
			public class LeaveApp (
				private String StartDate;
				private String EndDate;
				private String LeaveType;
				private String TotalDays;
				
				public LeaveApp(String StartDate, String EndDate, String LeaveType, String TotalDays){
					this.StartDate = StartDate;
					this.EndDate = EndDate;
					this.LeaveType = LeaveType;
					this.TotalDays = TotalDays;
				})
			public static void main(String arg[]){
				//add records
				Leave Application = new Leave("20160102","20160102","Annual","2");
				LeaveApp();
				System.out.printIn(Leave.toStting());
			}
			
			public UI(){
				super("UI");
				JPanel panel = new JPanel();
				JButton button1 = new Jbutton("Button");
				final int StaffName > 0;
				Action Listener actionListener = new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						System.out.printIn(temp);
					}
					};
					button1.addActionListener(actionListener);
					
					this.add(panel);
					this.setVisible(true);
			}
					
					
				}
				})
				
			}
		}
}
