package jijin;

import java.text.DecimalFormat;

public class Profit {

	
	
	public static void main(String[] args) {

		double current_principal =0;
		int current_month=1;
		int years=30;
		double month_add=1000;
		for(int i=0;i<30*12*years;i++){
			
			
			
			current_principal+= getCompletProfitTotal(current_principal,1);
			
			
			if(i%30==0){
				current_principal+=month_add;
				
				System.out.println( current_month+"month principal-> "+new DecimalFormat("#.00").format((month_add*current_month))+"  :   "+"principal+profit-> "+new DecimalFormat("#.00").format(current_principal)+"   profit->"+new DecimalFormat("#.00").format(current_principal-month_add*(current_month)));
				current_month++;
			}
		}
	
	}
	
	
	
	public static  double getCompletProfitTotal(double principal,double per_10thousand_profit){
		
		
		double current_principal=principal;
		
			
			current_principal +=  (current_principal/10000)*per_10thousand_profit;
			
			
		
		double total_profit= current_principal-principal;
		
		
		return total_profit;
	}
	
	
	
}
