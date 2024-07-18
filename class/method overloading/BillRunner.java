class BillRunner{

public static void main(String args[]){

    Bill bill1=new Bill();
	boolean isBillCreated= bill1.createBill(1,"27/3/2023","27/4/2024",true,false);
	System.out.println(" is bill created  :"+isBillCreated);
    bill1.displayBillInfo();
 Bill bill2=new Bill();
 bill2.billId=2;
 bill2.billDueDate="23-june-2024";
bill2.billIssueDate="10-june-2024";
bill2.displayBillInfo();
 //System.out.println(bill2.billId+" "+bill2.billIssuedDate+" "+bill2.billDueDate);

}


}