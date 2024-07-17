class PenRunner{

public static void main(String args[]){
pen ref=new pen();
ref.name="reynolds";
ref.id=23;
ref.color="blue";
ref.price=5;
System.out.println("Brand name : "+ref.name+"\n id of pen : "+ref.id+"\ncolor of pen : "+ref.color+"\n price : "+ref.price);

ref.write();
}

}