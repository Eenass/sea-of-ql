form RentBenefit{

age : "How old are you?" int
income: "What was your income for 2012?" money
student: "Are you a student?" boolean
rent: "How much do you pay for rent?" money
roomate: "Do you have roomates?" boolean

if(roomate){
	roomate2: "111111111How many roomates do you have?" int
	status: "22222222Do they work?" boolean

	}
	else{
	
	student2 : "Are you a part-time student?" boolean
	hours: "How many hour per week do you study?" int (age+100/2)

 benefit : "Your benefit for the year 2012 is (per month)" money ((rent)*0.3-income/12.0)
	}
	


}