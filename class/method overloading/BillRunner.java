class BillRunner{

public static void main(String args[]){

    Bill bill1=new Bill();
	bill1.billId=101;
	bill1.billIssuedDate="07-july-2024";
	bill1.billDueDate="20-july-2024";
    bill1.billDetails();
// System.out.println(bill1.billId+" "+bill1.billIssuedDate+" "+bill1.billDueDate);
 
 Bill bill2=new Bill();
 bill2.billId=2;
 bill2.billDueDate="23-june-2024";
bill2.billIssuedDate="10-june-2024";
bill2.billDetails();
 //System.out.println(bill2.billId+" "+bill2.billIssuedDate+" "+bill2.billDueDate);

}


}