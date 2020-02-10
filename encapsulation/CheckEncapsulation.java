package encapsulation;


public class CheckEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EncapsulationDemo demo=new EncapsulationDemo();
		demo.setId(1);
		demo.setname("Moumita");
		demo.setaddress("Pune");
		
		System.out.println("id : "+demo.getId()+"\n"+
                "name : "+demo.getname()+"\n"+
                "address : "+demo.getaddress()+"\n");

	}

}
